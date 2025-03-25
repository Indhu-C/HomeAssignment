package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecMethod;

import io.cucumber.java.en.When;

public class MyAccountPage extends ProjSpecMethod{

//	public MyAccountPage() {
//		this.driver=driver;
//	}
	
	@When("the user clicks the Create Account")
	public CreateAccountPage clickCreateAccount() {
		getdriver().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}

}
