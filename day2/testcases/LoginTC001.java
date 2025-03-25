package testcases;

import org.testng.annotations.Test;

import base.ProjSpecMethod;
import pages.LoginPage;

public class LoginTC001 extends ProjSpecMethod{
@Test	
public void runLogin() {

	System.out.println("Login driverValue:"+getdriver());
	//from Login Page
	new LoginPage().enterUserName().enterPassword().clickLogin();
	//from Welcome Page
	
	
	
	
}
}
