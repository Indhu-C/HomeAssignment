package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecMethod;


public class ViewAccountPage extends ProjSpecMethod{

	public ViewAccountPage() {
		
		String text =getdriver().findElement(By.xpath("(//span[@class='requiredField']/following::span[@class='tabletext'])[1]")).getText();
	System.out.println("Account Name Diplayed"+text);
	}

}
