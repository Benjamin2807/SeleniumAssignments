package week6.day2POM.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week6.day2POM.Hooks.PomHooks;

public class HomePage extends PomHooks{

	public HomePage verifylogin()
	{
		String name = driver.findElement(By.xpath("//a[@class='navbar-brand']//span")).getText();
		if(name.contains("service"))
		{
			System.out.println("Login success");

		}
		return this;
	}

	public HomePage typeincident() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));

		web.sendKeys("incident");
		Thread.sleep(3000);
		web.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		return this;
	}

	public Incidents clickincidentTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text() = 'Incidents']")).click();
		Thread.sleep(3000);
		return new Incidents();
	}

	public HomePage  typeChange() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));
		Thread.sleep(3000);
		web.sendKeys("change");
		Thread.sleep(3000);
		return this;
	}


	public TypesOfChanges clickcreatenewChange() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[text() = 'Create New'])[3]")).click();
		Thread.sleep(3000);
		return new TypesOfChanges();

	}

	public ChangeRequests clickOpenchange()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[text() = 'Open'])[3]")).click();
		driver.switchTo().frame(0);
		return new ChangeRequests();
	}

	public HomePage typeCaller() throws InterruptedException
	{
		WebElement web = driver.findElement(By.id("filter"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(web));
		web.sendKeys("caller");
		Thread.sleep(3000);
		return this;
	}

	public Callers clickCaller()
	{
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		return new Callers();
	}


	
	
	
	
	
	

}
