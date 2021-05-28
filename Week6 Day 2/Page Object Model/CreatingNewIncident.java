package week6.day2POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.day2POM.Hooks.PomHooks;

public class CreatingNewIncident extends PomHooks
{
	public CreatingNewIncident getIncidentNumber()
	{
		incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Incident Number: "+incidentNumber);
		return this;
	}
	
	public CreatingNewIncident enterUrgency(String incurgency) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select dropdown1 = new Select(urgency);
		dropdown1.selectByVisibleText(incurgency);
		return this;
	}
	
	public CreatingNewIncident enterstate(String state1) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.id("incident.state"));
		Select dropdown2 = new Select(state);
		dropdown2.selectByVisibleText(state1);
		return this;
	}

	public CreatingNewIncident shortdesc(String desc) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("incident.short_description")).sendKeys(desc);
		return this;
	}

	
	public Incidents clicksubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		Thread.sleep(3000);
		return new Incidents();
		
	}

	
	
	
	
	
	
	
	
	
}
