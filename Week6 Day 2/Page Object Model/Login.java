package week6.day2POM.Pages;

import org.openqa.selenium.By;

import week6.day2POM.Hooks.PomHooks;

public class Login extends PomHooks{
	
	
	public Login enteruname(String uname)
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys(uname);
		return this;

	}
	
	public Login enterpassword(String pwd)
	{
		driver.findElement(By.id("user_password")).sendKeys(pwd);
		return this;
	}

	public HomePage clicklogin()
	{
		driver.findElement(By.id("sysverb_login")).click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
}
