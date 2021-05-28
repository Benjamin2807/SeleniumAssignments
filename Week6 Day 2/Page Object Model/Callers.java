package week6.day2POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.day2POM.Hooks.PomHooks;

public class Callers extends PomHooks{
	
	public NewCallerCreation clickNew()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		return new NewCallerCreation();
		
	}

	public Callers verify() throws InterruptedException
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
	
	
	return this;
	
	}

}
