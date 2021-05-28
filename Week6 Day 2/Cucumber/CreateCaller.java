package stepDefsServiceNow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import serviceNowHooks.BaseClass;

public class CreateCaller extends BaseClass{

	String firstName;

	@And("Type Callers to Create_caller")
	public void typeCaller() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));
		web.sendKeys("caller");
		Thread.sleep(3000);
	}

	@And("Click Callers to create_caller")
	public void clickCaller()
	{
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
	}

	@And("Click new to create_caller")
	public void clickNew()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
	}

	@And("Type First_name to Create_caller (.*)$")
	public void enterfname(String fname)
	{
		driver.findElement(By.id("sys_user.first_name")).sendKeys(fname);
	}

	@And("Type Last_name to Create_caller (.*)$")
	public void enterlname(String lname)
	{
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lname);
	}

	@And("Type Title to create_caller")
	public void enterTile() throws InterruptedException
	{
		driver.findElement(By.id("lookup.sys_user.title")).click();
		Set<String> set = driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Junior Developer")).click();
		Thread.sleep(3000);
	}

	@And("Type Number in Business_phone to Create_caller (.*)$")
	public void enterbphone(String bNumber)
	{
		Set<String> set = driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.id("sys_user.phone")).sendKeys(bNumber);
	}

	@And("Get First_name of Caller")
	public void getFirstName()
	{
		firstName = driver.findElement(By.id("sys_user.first_name")).getAttribute("value");
		System.out.println("First Name is: " +firstName);
	}

	@And("Click subit to Create_caller")
	public void clickSubmit() throws InterruptedException
	{
		driver.findElement(By.id("sysverb_insert")).click();
		Thread.sleep(3000);
	}

	@Then("Verify_caller")
	public void verify() throws InterruptedException
	{
		WebElement selectBy = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select select = new Select(selectBy);
		select.selectByVisibleText("First name");

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(firstName,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		String firstName1 = driver.findElement(By.id("sys_user.first_name")).getAttribute("value");

		if(firstName1.equalsIgnoreCase(firstName))
		{
			System.out.println("Caller created");
			System.out.println("Testcase Passed");
		}

		else
		{
			System.out.println("Testcase Failed");
		}
	}
}


