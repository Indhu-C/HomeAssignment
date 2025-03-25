package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjSpecMethod;

public class CreateLeadPage extends ProjSpecMethod{
	
	public CreateLeadPage enterCompanyName() {
		getdriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadPage enterFirstName() {
		getdriver().findElement(By.id("createLeadForm_firstName")).sendKeys("I");
		return this;
	}
	public CreateLeadPage enterLastName() {
		getdriver().findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		getdriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
}
