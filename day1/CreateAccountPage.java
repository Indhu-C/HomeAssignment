package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{

	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateAccountPage enterAccountName() {
		driver.findElement(By.id("accountName")).sendKeys("AccName2");
		return this;
	}
	
	public ViewAccountPage createAccountButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
	}

}
