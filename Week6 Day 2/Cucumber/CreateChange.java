package stepDefsServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import serviceNowHooks.BaseClass;

public class CreateChange extends BaseClass{

	String chngNumber;

	@And("Type Change in the Filter")
	public void typeChange() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));
		Thread.sleep(3000);
		web.sendKeys("change");
		Thread.sleep(3000);
	}

	@And("Click create new change")
	public void clickCreateNew() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[text() = 'Create New'])[3]")).click();
		Thread.sleep(3000);
	}


	@And("click normal")
	public void ClickNormal()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class = 'chg-model-model-description change-model-truncate'])[2]")).click();
	}

	@And("get change Number")
	public void getChangeNumber()
	{
		chngNumber = driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println("Change number is "+chngNumber);
	}

	@And("enter Change_state (.*)$")
	public void enterState(String state) 
	{ 
		WebElement element = driver.findElement(By.id("change_request.state"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(state);

	}

	@And("enter priority (.*)$")
	public void enterPriority(String prio)
	{
		WebElement element1 = driver.findElement(By.id("change_request.priority"));
		Select dropdown1= new Select(element1);
		dropdown1.selectByVisibleText(prio);
	}

	@And("enter risk (.*)$")
	public void enterRisk(String risk)
	{
		WebElement element2 = driver.findElement(By.id("change_request.risk"));
		Select dropdown2= new Select(element2);
		dropdown2.selectByVisibleText(risk);
	}

	@And("enter impact (.*)$")
	public void enterImpact(String impact)
	{
		WebElement element2 = driver.findElement(By.id("change_request.risk"));
		Select dropdown2= new Select(element2);
		dropdown2.selectByVisibleText(impact);
	}

	@And("click submit for change")
	public void submitChange() throws InterruptedException
	{
		driver.findElement(By.id("sysverb_insert")).click();
		Thread.sleep(3000);

	}

	@Then("verify change")
	public void verifyChange() throws InterruptedException
	{
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("(//div[text() = 'Open'])[3]")).click();

		driver.switchTo().frame(0);


		WebElement type = driver.findElement(By.xpath("//select[@class = 'form-control default-focus-outline']"));
		Select select1 = new Select(type);
		select1.selectByVisibleText("Number");


		WebElement search = driver.findElement(By.xpath("//span[text() = 'Press Enter from within the input to submit the search.']/following::input"));
		search.sendKeys(chngNumber);
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement list =  driver.findElement(By.xpath("//td[@class = 'vt']/a"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(list));

		list.click();


		String verifychngNumber = driver.findElement(By.id("change_request.number")).getAttribute("value");

		if(verifychngNumber.equalsIgnoreCase(chngNumber))
		{
			System.out.println("Created Change Number is "+verifychngNumber);
			System.out.println("Testcase Passed");
		}

		else
		{
			System.out.println(verifychngNumber);
			System.out.println("Testcase Failed");
		}
	}

}



