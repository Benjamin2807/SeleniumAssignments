package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		System.out.println("");
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Benjamin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prem Kumar AS");
		
		WebElement webdriver = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(webdriver);
		dropdown.selectByVisibleText("Partner");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akash");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Nair");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");      
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
		
		WebElement webdriver1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1 = new Select(webdriver1);
		dropdown1.selectByVisibleText("Health Care");
		
		WebElement webdriver2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown2 = new Select(webdriver2);
		dropdown2.selectByVisibleText("Corporation");
		
	
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("70105");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Adding new position");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Urgent requirement");
		
		
		WebElement webdriver3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown3 = new Select(webdriver3);
		dropdown3.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/28/1996");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		WebElement webdriver4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown4 = new Select(webdriver4);
		dropdown4.selectByVisibleText("GBP - British Pound");
	
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("124");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("70");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("benjaminpremkumar23@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7010881175");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Benjamin");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.benjamin.com");
		
				
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Benjamin");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 2, st marys house, 8th street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("nehru colony, nanganallur, chennai 61");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("61");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("00");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Akash");
		
		
		WebElement webdriver5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown5 = new Select(webdriver5);
		dropdown5.selectByVisibleText("California");

		
		WebElement webdriver6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown6 = new Select(webdriver6);
		dropdown6.selectByVisibleText("United States");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);
		System.out.println("");
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Paypal");
		driver.findElement(By.name("submitButton")).click();
		
		 String text3 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text3);
		
		if(text2.equalsIgnoreCase(text3))
		{
			System.out.println("Testcase Failed");
		}
		
		else
		{
			System.out.println("Testcase Passed");
		}
	}

}
