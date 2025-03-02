package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithWebElements {

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
		
		driver.findElement(By.linkText("Leads")).click();
		//opens page ===> My Leads | opentaps CRM
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		//opens page ===> Create Lead | opentaps CRM
		String title3 = driver.getTitle();
		System.out.println(title3);
		Thread.sleep(1000);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Always Ahead");
		
		driver.findElement(By.name("submitButton")).click();
		
		//opens page ===> View Lead | opentaps CRM
		String title4= driver.getTitle();
		System.out.println(title4);
		
		Thread.sleep(10000);
		driver.close();
	}

}
