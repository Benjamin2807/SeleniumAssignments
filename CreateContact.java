package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()= 'Contacts']")).click();
		driver.findElement(By.xpath("//a[text()= 'Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Lionel");
		driver.findElement(By.id("lastNameField")).sendKeys("Messi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Goal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Scorer");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Football");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Main Contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("lionelmessi@gmail.com");
		
		WebElement web = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(web);
		select.selectByVisibleText("California");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important contact");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
