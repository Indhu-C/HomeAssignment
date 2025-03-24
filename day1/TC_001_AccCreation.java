package week6.day1;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;



public class TC_001_AccCreation extends ProjectSpecificMethods{

	@Test
	public	 void runCreateAccount() {
		
		new LoginPage(driver)
		.enterUserName().enterPassWord().clickLogin()
		//from Welcome Page
		.clickCRMSFA()
		//from MyHome Page
		.clickAccountsTab()
		//from MyAccount Page 
		.clickCreateAccount()
		//from CreateAccount Page
		.enterAccountName().createAccountButton();
		//from view Account Page
		
		}



}
