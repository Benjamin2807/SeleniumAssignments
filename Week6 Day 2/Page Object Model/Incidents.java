package week6.day2POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import week6.day2POM.Hooks.PomHooks;

public class Incidents extends PomHooks{

	public CreatingNewIncident clicknew()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id = 'sysverb_new']")).click();
		return new CreatingNewIncident();
	}	
	
	public Incidents incidentverify() throws InterruptedException
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

		return this;
	}

	
	
	
	
}
