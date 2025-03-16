package week4.day3;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod{

	@Test
	public  void TC1() throws InterruptedException {
		
		
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation");
		 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		 
		 String enteredName = driver.findElement(By.xpath("//lightning-formatted-text[@data-output-element-id='output-field'][1]")).getText();
		  if(enteredName.equals("Salesforce Automation by Indhu"))
			  System.out.println("Test Case 1 - Pass");
			  

	}

	@Test
	public  void TC2() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	       driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div/textarea")).sendKeys("Salesforce"); 
	       WebElement statusDropdown = driver.findElement(By.xpath("//button[@aria-label='Status']/parent::div"));
	       JavascriptExecutor jse = (JavascriptExecutor) driver;
	       jse.executeScript("arguments[0].scrollIntoView();", statusDropdown);
	       jse.executeScript("arguments[0].click();", statusDropdown);
	       driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Active']")).click();
	       driver.findElement(By.xpath("//button[@name='SaveEdit']")).click(); 
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	       //Alert Msg=> We hit a snag.Review the following fields-Legal Entity Name
	       WebElement msg = driver.findElement(By.xpath("//a[text()='Legal Entity Name']"));
	       wait.until(ExpectedConditions.visibilityOf(msg));
	     
	       if(msg.getText().equals("Legal Entity Name"))
			  System.out.println("Test Case 2 - Pass");
	       msg.click();
	       driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("LEName");
	       driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
