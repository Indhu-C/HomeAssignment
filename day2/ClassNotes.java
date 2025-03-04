package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNotes {

	public static void main(String[] args) throws InterruptedException {
		//Alert
		/*
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		//=========Simple Alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button")).click();
	
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(1000);
		alert.accept();
		
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		//=========Confirmation Alert
		WebElement confirmDialog = driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button"));
		//Java cript
		driver.executeScript("arguments[0].click()", confirmDialog);
		alert.getText();
		System.out.println(text);
		alert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		//=========Prompt Alert
		
		
		
		driver.quit();*/
		
		//Frame
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		//Switch back to main html DOM
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Count Frames']")).click();
		System.out.println(driver.findElement(By.xpath("//button[text()='Count Frames']")).getText());
		
		//Nested Frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().parentFrame();
		}

}
