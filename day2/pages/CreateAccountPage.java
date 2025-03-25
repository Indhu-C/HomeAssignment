package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecMethod;

import io.cucumber.java.en.When;

public class CreateAccountPage extends ProjSpecMethod{

//	public CreateAccountPage() {
//		this.driver=driver;
//	}
	@When("the user enters the Account Name")
	public CreateAccountPage enterAccountName() {
		Random no=new Random();
		int i =no.nextInt(20);
		
		getdriver().findElement(By.id("accountName")).sendKeys("AccountName"+i);
		return this;
	}
	@When("the user clicks the create Account Button")
	public ViewAccountPage createAccountButton() {
		getdriver().findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}
