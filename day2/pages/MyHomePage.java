package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjSpecMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjSpecMethod{
	
	@When("the user clicks the lead menu")
	public MyLeadsPage clickLead() {

		getdriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();

	}
	@When("the user clicks the AccountsTab")
	public MyAccountPage clickAccountsTab() {
		getdriver().findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}
	
}
