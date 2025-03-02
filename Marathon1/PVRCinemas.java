package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		//Select Cinema dropdown
		driver.findElement(By.xpath("//span[contains(text(),'OMR')]")).click();
		Thread.sleep(1000);
		//Select Date dropdown
		driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();
		Thread.sleep(1000);
		// Select Movie dropdown
		//driver.findElement(By.xpath("//span[contains(text(),'Select Movie')]")).click();

	
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])/span[text()='DRAGON']")).click();
		Thread.sleep(1000);
		// Select Timing dropdown
		
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'01:10 PM')]")).click();
		Thread.sleep(1000);
		//book button
		driver.findElement(By.xpath("(//span[text()='Book'])/parent::button[@aria-label='Submit']")).click();
		Thread.sleep(1000);
		//terms
		driver.findElement(By.xpath("(//div[@class='accpet-btn-flow-seat'])/button[2]")).click();
		
		//Seat
		driver.findElement(By.xpath("(//td[@class='seats-col']/span[text()='24'])[3]")).click();
		
		//proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Summary
		String bs= driver.findElement(By.xpath("//div[@class='movies-summary']")).getText();
		System.out.println("Details of bookin" +bs);
		
		
		String seatNo= driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat info "+seatNo);
		
		
		String total= driver.findElement(By.xpath("(//div[@class='grand-prices'])/h6")).getText();
		System.out.println("grand total "+total);
		
		String title = driver.getTitle();
		System.out.println("Page Title "+title);
		
		driver.close();
		
	}
}
