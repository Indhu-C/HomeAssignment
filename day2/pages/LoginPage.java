package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjSpecMethod;
import io.cucumber.java.en.When;

public class LoginPage extends ProjSpecMethod{
	
	@When("the user enters the username as")
	public LoginPage enterUserName() {	
		getdriver().findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	@When("the user enters the password as")
	public LoginPage enterPassword() {
		getdriver().findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	@When("the user clicks the login button")
	public WelcomePage clickLogin() {
		getdriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();

	}

	

}
