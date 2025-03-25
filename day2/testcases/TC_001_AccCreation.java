package testcases;

import org.testng.annotations.Test;

import base.ProjSpecMethod;

import pages.LoginPage;



public class TC_001_AccCreation extends ProjSpecMethod{

	@Test
	public	 void runCreateAccount() {
		
		new LoginPage()
		.enterUserName().enterPassword().clickLogin()
		
		//from Welcome Page
		.clickCRM()
		//from MyHome Page
		.clickAccountsTab()
		//from MyAccount Page 
		.clickCreateAccount()
		//from CreateAccount Page
		.enterAccountName().createAccountButton();
		//from view Account Page
		
		}



}
