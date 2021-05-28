package week6.day2POM.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import week6.day2POM.Hooks.PomHooks;

public class ChangeRequests extends PomHooks{
	
	public ChangeRequests changeVerify() throws InterruptedException
	{
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
		
		
		return this;
		
	}


	
	}
	
	
	
	


