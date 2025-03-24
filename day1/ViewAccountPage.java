package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{

	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
		 String text = driver.findElement(By.xpath("(//span[@class='requiredField']/following::span[@class='tabletext'])[1]")).getText();
	System.out.println("Account Name Diplayed"+text);
	}

}
