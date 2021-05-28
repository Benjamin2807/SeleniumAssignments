package week6.day2POMs.Testcases;


import org.testng.annotations.Test;

import week6.day2POM.Hooks.PomHooks;
import week6.day2POM.Pages.Login;

public class CreateIncident extends PomHooks{
	
	@Test
	public void createlead() throws InterruptedException
	{
		new Login()
		.enteruname("admin")
		.enterpassword("India@123")
		.clicklogin()
		.verifylogin()
		.typeincident()
		.clickincidentTab()
		.clicknew()
		.getIncidentNumber()
		.enterUrgency("2 - Medium")
		.enterstate("New")
		.shortdesc("shrtdesc")
		.clicksubmit()
		.incidentverify();
		
	}
	
	

}
