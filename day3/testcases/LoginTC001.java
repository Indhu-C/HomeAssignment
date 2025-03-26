package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjSpecMethod;
import pages.LoginPage;

public class LoginTC001 extends ProjSpecMethod{
	@BeforeTest
	public void setTestcaseDetails() {
		filepath="Login";

	}
	
@Test	(dataProvider = "fetchData")
public void runLogin(String username,String password) {

	System.out.println("Login driverValue:"+getdriver());
	//from Login Page
	new LoginPage().enterUserName(username).enterPassword(password).clickLogin();
	//from Welcome Page
	
	
	
	
}
}
