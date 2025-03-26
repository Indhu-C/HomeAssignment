package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjSpecMethod;
import pages.LoginPage;

public class LeadCreationTC002 extends ProjSpecMethod{
	@BeforeTest
	public void setTestcaseDetails() {
		filepath="Login";

	}
	@Test(dataProvider = "fetchData")
	public	 void runCreateLead(String username,String password) {
		System.out.println("Lead driverValue:"+getdriver());
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLead()
		.clickCreateLeadMenu()
		.enterCompanyName().enterFirstName().enterLastName().clickSubmitButton();
		}

}
