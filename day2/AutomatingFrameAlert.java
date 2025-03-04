package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAlert {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		//- Click OK/Cancel in the alert that appears
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hermione Granger");
		System.out.println(alert.getText());
		Thread.sleep(5000);
		
		//Confirm the action is performed correctly by verifying the text displayed
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		Thread.sleep(5000);
		//Click the "Try It" button inside the frame
		WebElement element = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		driver.executeScript("arguments[0].click()", element);
		Thread.sleep(5000);
		alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
	}

}
