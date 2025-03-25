package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjSpecMethod;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjSpecMethod{
	


@When("the user clicks the crsmfa link")
public MyHomePage clickCRM() {
	
	getdriver().findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage();


}
}
