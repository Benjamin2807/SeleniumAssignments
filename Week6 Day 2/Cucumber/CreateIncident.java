package stepDefsServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import serviceNowHooks.BaseClass;

public class CreateIncident extends BaseClass{


	String incidentNumber;


	@Given("Load URL {string}")
	public void load(String url)
	{
		driver.get(url);
		driver.switchTo().frame(0);
	}

	@When("Type username as {string}")
	public void enteruname(String uname)
	{
		driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys(uname);

	}


	@And("Type password as {string}")
	public void enterpassword(String pwd)
	{
		driver.findElement(By.id("user_password")).sendKeys(pwd);
	}


	@And("Click Login Button")
	public void clicklogin()
	{
		driver.findElement(By.id("sysverb_login")).click();	
	}


	@And("Verify Login is Successful")
	public void verifylogin()
	{
		String name = driver.findElement(By.xpath("//a[@class='navbar-brand']//span")).getText();
		if(name.contains("service"))
		{
			System.out.println("Login success");
		}
	}


	@And("Type Incident in the filter")
	public void typeincident() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));

		web.sendKeys("incident");
		Thread.sleep(3000);
		web.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}


	@And("Click the Incidents tab")
	public void clickincidentTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text() = 'Incidents']")).click();
		Thread.sleep(3000);
	}

	@And("Click new")
	public void clicknew()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id = 'sysverb_new']")).click();
	}

	@And("Get the Incident number")
	public void getIncidentNumber()
	{
		incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Incident Number: "+incidentNumber);
	}

	@And("enter Urgency (.*)$")
	public void enterUrgency(String incurgency)
	{
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select dropdown1 = new Select(urgency);
		dropdown1.selectByVisibleText(incurgency);
	}

	@And("enter state (.*)$")
	public void enterstate(String enterstate)
	{
		WebElement state = driver.findElement(By.id("incident.state"));
		Select dropdown2 = new Select(state);
		dropdown2.selectByVisibleText(enterstate);
	}

	@And("enter short description (.*)$")
	public void shortdesc(String shrtdesc)
	{
		driver.findElement(By.id("incident.short_description")).sendKeys(shrtdesc);
	}

	@And("Click submit")
	public void clicksubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		Thread.sleep(3000);
	}

	@Then("verify incident is created")
	public void incidentverify() throws InterruptedException
	{
		WebElement search = driver.findElement(By.xpath("//span[text() = 'Press Enter from within the input to submit the search.']/following::input"));
		search.sendKeys(incidentNumber);
		search.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class = 'vt']/a")).click();
		String savedIncident = driver.findElement(By.xpath("//div[@class = 'navbar-title-display-value']")).getText();

		if(savedIncident.contains(incidentNumber))
		{
			System.out.println(savedIncident+ " Incident Number saved and Matches");
			System.out.println("Testcase Passed");

		}

		else
		{
			System.out.println("Testcase Failed");
		}

	}

}

















