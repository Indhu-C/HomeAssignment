package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef1 {
	ChromeDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	    
	}
	@When("the user enters the username as democsr")
	public void the_user_enters_the_username_as_democsr() {
	    
		driver.findElement(By.id("username")).sendKeys("democsr");
	    
	}
	@When("the user enters the password as crmsfa")
	public void the_user_enters_the_password_as_crmsfa() {
	    
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	  
	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	    
		driver.findElement(By.className("decorativeSubmit")).click();
	 
	}

	@Then("the user should be redirected to Welcome page")
	public void the_user_should_be_redirected_to_welcome_page() {
	    //System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Leaftaps - TestLeaf Automation Platform", "Title does not match!");
	    
	}
	@Then("Welcome user name will be displayed")
	public void welcome_will_be_displayed() {
	    
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
		//System.out.println(element.getText());
		Assert.assertTrue(element.getText().contains("Welcome"), "Welcome message not shown...");
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
	@When("the user enters the username as democsr1")
	public void the_user_enters_the_username_as_democsr1() {
		driver.findElement(By.id("username")).sendKeys("democsr1");
	}
	@When("the user will be shown an error message")
	public void the_user_will_be_shown_an_error_message() {
		String error = driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
		//System.out.println(error);
				Assert.assertTrue(error.contains("error"), "error message shown...");
	}
}
