package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {


	ChromeDriver driver;
	@Parameters({"URL","un","pwd"})
	@BeforeMethod
	public void preCondition(String url,String un,String pwd) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		  driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
}
}
