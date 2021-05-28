package week6.day2POM.Pages;

import org.openqa.selenium.By;

import week6.day2POM.Hooks.PomHooks;

public class TypesOfChanges extends PomHooks{
	
	public CreatingNewChange ClickNormal()
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class = 'chg-model-model-description change-model-truncate'])[2]")).click();
		return new CreatingNewChange();
	}
	
	

}
