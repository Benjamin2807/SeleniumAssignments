package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		String string = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("Lead name 1 is " +string);
		driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']//a")).click();
		driver.findElement(By.xpath("//a[text() ='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println("Printing the Titile " +title);
		driver.findElement(By.name("submitButton")).click();
		String string2 = driver.findElement(By.xpath("//span[@id = 'viewLead_firstName_sp']")).getText();
		System.out.println("Lead name 2 is " +string2);
		
		if(string.equalsIgnoreCase(string2))
		{
			System.out.println("Duplicate name found");
			System.out.println("Testcase passed");
		}
		
		else
		{
			System.out.println("Different name");
			System.out.println("Testcase failed");
		}

	}

}
