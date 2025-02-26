package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("CRM")).click();
		//opens page ===> My Home | opentaps CRM
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Leads")).click();
		//opens page ===> My Leads | opentaps CRM
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Find Leads")).click();
		//opens page ===>Find Leads | opentaps CRM
		String title3 = driver.getTitle();
		System.out.println(title3);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	
	
		 
		//First item in row
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a[@class='linktext'])[1]")).click();
		
		// opens page ===>View Lead | opentaps CRM
		String title4 = driver.getTitle();
		System.out.println(title4);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		// opens page ===>My Leads | opentaps CRM
		String title5 = driver.getTitle();
		System.out.println(title5);
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Find Leads")).click();
		//opens page ===> Find Leads | opentaps CRM
		String title6 = driver.getTitle();
		System.out.println(title6);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
	}

}
