package week5.day4;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class StepDefDeleteLead extends Common{
//	@When("the user clicks the Find Leads")
//	public void the_user_clicks_the_find_leads() {
//		driver.findElement(By.linkText("Find Leads")).click();
//	   
//	}
//	@When("the user enters the Phone Number as (.*)$")
//	public void the_user_enters_the_phone_number_as(String phno) {
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
//	   
//	}
//	@When("the user clicks the Find Leads button")
//	public void the_user_clicks_the_find_leads_button() throws InterruptedException {
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		Thread.sleep(2000);
//	   
//	}
//	@When("the user clicks the Lead Id")
//	public void the_user_clicks_the_lead_id() throws InterruptedException {
//		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
//		Thread.sleep(2000);
//	   
//	}
@When("the user clicks the Delete button")
public void the_user_clicks_the_delete_button() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.linkText("Delete")).click();
}
@When("the user enters the Lead Id as (.*)$")
public void the_user_enters_the_lead_id_as(String leadID) {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
}
@When("No records to display will be displayed")
public void no_records_to_display_will_be_displayed() {
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Lead deleted successfully");
	} else {
		System.out.println("Lead is not deleted ");
	}
}
}
