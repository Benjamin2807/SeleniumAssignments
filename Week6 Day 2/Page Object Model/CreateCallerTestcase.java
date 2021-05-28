package week6.day2POMs.Testcases;

import org.testng.annotations.Test;

import week6.day2POM.Hooks.PomHooks;
import week6.day2POM.Pages.Login;

public class CreateCaller extends PomHooks{

   @Test
	public void createcaller() throws InterruptedException {


		new Login()
		.enteruname("admin")
		.enterpassword("India@123")
		.clicklogin()
		.verifylogin()
		.typeCaller()
		.clickCaller()
		.clickNew()
		.enterfname("Anjana")
		.getFirstName()
		.enterlname("Dinesh")
		.enterTile()
		.enterbphone("213 198 1239")
		.clickSubmit()
		.verify();

	}



}
