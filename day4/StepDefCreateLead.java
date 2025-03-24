package week5.day4;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class StepDefCreateLead extends Common{

@When("the user clicks the CRMSFA link")
public void the_user_clicks_the_crmsfa_link() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	
}
	@When("the user clicks the Leads tab")
	public void the_user_clicks_the_leads_tab() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("the user clicks the Create Lead")
	public void the_user_clicks_the_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	//@When("the user enters the company name as {string}")
	@When("the user enters the company name as (.*)$")
	public void the_user_enters_the_company_name_as(String cname) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	//@When("the user enters the first name as {string}")
	@When("the user enters the first name as (.*)$")
	public void the_user_enters_the_first_name_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	//@When("the user enters the last name as {string}")
	@When("the user enters the last name as (.*)$")
	public void the_user_enters_the_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}

	//@When("the user enters the phone number as {string}")
	@When("the user enters the phone number as (.*)$")
	public void the_user_enters_the_phone_number_as(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);

	}

	@When("the user clicks the Create Lead button")
	public void the_user_clicks_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();

	}

}
