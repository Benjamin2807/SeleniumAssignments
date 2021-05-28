package week6.day2POMs.Testcases;

import org.testng.annotations.Test;

import week6.day2POM.Hooks.PomHooks;
import week6.day2POM.Pages.Login;

public class CreateChange extends PomHooks{
	
	@Test
	public void createchange() throws InterruptedException
	{
		 new Login()
		.enteruname("admin")
		.enterpassword("India@123")
		.clicklogin()
		.verifylogin()
		.typeChange()
		.clickcreatenewChange()
		.ClickNormal()
		.getChangeNumber()
		.enterState("New")
		.enterPriority("2 - High")
		.enterRisk("High")
		.enterImpact("High")
		.submitChange()
		.clickOpenchange()
		.changeVerify();
		
		
	}

}
