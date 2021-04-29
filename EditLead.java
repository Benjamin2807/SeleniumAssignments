package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Benjamin");
	  //driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::div/input")).sendKeys("Benjamin");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		Thread.sleep(3000);
		
		String companyname = driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-companyName']/a")).getText();
		System.out.println("Company name is " +companyname);
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); 
		String str = driver.getTitle();
		System.out.println("Title is " +str);

		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Wondersoft");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		
		Thread.sleep(3000);
		String str1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated Company name is " +str1);
		
		if(companyname.equalsIgnoreCase(str1))
		{
			System.out.println("Testcase Failed");
		}
		else
		{
			System.out.println("Testcase Passed");
		}
		
	}
	
}
