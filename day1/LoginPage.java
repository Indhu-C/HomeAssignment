package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;	}

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	public LoginPage enterPassWord() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	



}
