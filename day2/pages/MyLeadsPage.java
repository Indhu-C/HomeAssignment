package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjSpecMethod;
import io.cucumber.java.en.When;

public class MyLeadsPage extends ProjSpecMethod{
	
	
	
	@When("the user clicks the creat lead menu")
	public CreateLeadPage clickCreateLeadMenu() {
		getdriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}
}
