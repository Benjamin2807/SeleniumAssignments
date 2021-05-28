package week6.day2POM.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import week6.day2POM.Hooks.PomHooks;

public class NewCallerCreation extends PomHooks{
	

	public NewCallerCreation enterfname(String fname)
	{
		driver.findElement(By.id("sys_user.first_name")).sendKeys(fname);
		return this;
	}

	public NewCallerCreation getFirstName()
	{
		firstName = driver.findElement(By.id("sys_user.first_name")).getAttribute("value");
		System.out.println("First Name is: " +firstName);
		return this;
	}
	
	
	public NewCallerCreation enterlname(String lname)
	{
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lname);
		return this;
	}

	
	public NewCallerCreation enterTile() throws InterruptedException
	{
		driver.findElement(By.id("lookup.sys_user.title")).click();
		Set<String> set = driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Junior Developer")).click();
		Thread.sleep(3000);
		return this;
	}

	
	public NewCallerCreation enterbphone(String bNumber)
	{
		Set<String> set = driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.id("sys_user.phone")).sendKeys(bNumber);
		return this;
	}


	
	public Callers clickSubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("sysverb_insert")).click();
		return new Callers();
	}

	
	
	

}
