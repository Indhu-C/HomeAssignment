package week4.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class StaticParameter {
	ChromeDriver driver;
	
 
  @BeforeMethod
  public void login() throws InterruptedException {
	  System.out.println("before method");
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		//Thread.sleep(3000);
		System.out.println("User Name: ");
		driver.findElement(By.id("password")).sendKeys("Testleaf@2025");
		System.out.println("Password: ");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	
	
	
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
