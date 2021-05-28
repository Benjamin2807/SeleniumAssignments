package week6.day2POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import week6.day2POM.Hooks.PomHooks;

public class CreatingNewChange extends PomHooks{

	public CreatingNewChange getChangeNumber()
	{
		chngNumber = driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println("Change number is "+chngNumber);
		return this;
	}


	public CreatingNewChange enterState(String state) 
	{ 
		WebElement element = driver.findElement(By.id("change_request.state"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(state);
		return this;

	}

	public CreatingNewChange enterPriority(String prio)
	{
		WebElement element1 = driver.findElement(By.id("change_request.priority"));
		Select dropdown1= new Select(element1);
		dropdown1.selectByVisibleText(prio);
		return this;
	}

	public CreatingNewChange enterRisk(String risk)
	{
		WebElement element2 = driver.findElement(By.id("change_request.risk"));
		Select dropdown2= new Select(element2);
		dropdown2.selectByVisibleText(risk);
		return this;
	}

	public CreatingNewChange enterImpact(String impact)
	{
		WebElement element2 = driver.findElement(By.id("change_request.risk"));
		Select dropdown2= new Select(element2);
		dropdown2.selectByVisibleText(impact);
		return this;
	}

	public HomePage submitChange() throws InterruptedException
	{
		driver.findElement(By.id("sysverb_insert")).click();
		Thread.sleep(3000);
		return new HomePage();

	}



}
