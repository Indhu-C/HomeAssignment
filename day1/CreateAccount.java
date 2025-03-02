package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("CRM")).click();
		//opens page ===> My Home | opentaps CRM
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Accounts")).click();
		//opens page ===> Accounts | opentaps CRM
		String title2= driver.getTitle();
		System.out.println(title2);
		Thread.sleep(10000);
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		Thread.sleep(10000);
		
		//opens page ===> Create Account | opentaps CRM
		String title3= driver.getTitle();
		System.out.println(title3);
		
		
		driver.findElement(By.id("accountName")).sendKeys("TestLeafs");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.name("numberEmployees")).sendKeys("25");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//opens page ===> Account Details | opentaps CRM
				String title4= driver.getTitle();
				System.out.println(title4);
				
				Thread.sleep(10000);
				driver.close();

	}

}
