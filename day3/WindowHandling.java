package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		
		//Precondition:

		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Parent Window:"+driver.getTitle());
		Thread.sleep(1000);
		//pop up alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(1000);
	
		Thread.sleep(1000);
		Set<String> allOpenWindows = driver.getWindowHandles();
		List<String> toGetChildWindows =new ArrayList<String>(allOpenWindows);
		for (String string : allOpenWindows) {
			//System.out.println(string);
		}
		
		//driver.switchTo().window(toGetChildWindows.get(1));
		System.out.println("Child Window:"+ driver.getTitle());
		Thread.sleep(1000);
		//driver.close();
		driver.switchTo().window(toGetChildWindows.get(0));
		Thread.sleep(1000);
		//driver.close();
		//driver.quit();
}
}
