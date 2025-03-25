package testcases;

import org.testng.annotations.Test;

import base.ProjSpecMethod;
import pages.LoginPage;

public class LeadCreationTC002 extends ProjSpecMethod{
	@Test
	public	 void runCreateLead() {
		System.out.println("Lead driverValue:"+getdriver());
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRM()
		.clickLead()
		.clickCreateLeadMenu()
		.enterCompanyName().enterFirstName().enterLastName().clickSubmitButton();
		}

}
