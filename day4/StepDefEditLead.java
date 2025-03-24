package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class StepDefEditLead extends Common{

@When("the user clicks the Find Leads")
public void the_user_clicks_the_find_leads() {
	driver.findElement(By.linkText("Find Leads")).click();
   
}
@When("the user enters the Phone Number as (.*)$")
public void the_user_enters_the_phone_number_as(String phno) {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
   
}
@When("the user clicks the Find Leads button")
public void the_user_clicks_the_find_leads_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
   
}
@When("the user clicks the Lead Id")
public void the_user_clicks_the_lead_id() throws InterruptedException {
	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
	Thread.sleep(2000);
   
}
@When("the user clicks the Edit button")
public void the_user_clicks_the_edit_button() {
	driver.findElement(By.linkText("Edit")).click();
   
}
@When("the user enters the Company Name as (.*)$")
public void the_user_enters_the_company_name_as_test_leaf(String cname) {
	WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	companyName.clear();
	companyName.sendKeys(cname);
   
}
@When("the user clicks the Submit Button")
public void the_user_clicks_the_submit_button() {
	driver.findElement(By.name("submitButton")).click();
   
}
}
