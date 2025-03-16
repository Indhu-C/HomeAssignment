package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {


	WebDriver driver;
	@Parameters({"URL","un","pwd"})
	@BeforeMethod
	public void preCondition(String url,String un,String pwd) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		  driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		  driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		  driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();

}
	@AfterMethod
	public void postCondition() {
		//driver.close();
}
}
