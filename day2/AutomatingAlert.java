package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		//=========Prompt Alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
	
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(1000);
		
		alert.sendKeys("Indhu");
		Thread.sleep(10000);
		
		alert.dismiss();
		//System.out.println(alert.getText());
		
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		driver.quit();
		
	}

}
