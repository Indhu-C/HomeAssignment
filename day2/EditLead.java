package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		//opens page ===> Create Lead | opentaps CRM
		String title3 = driver.getTitle();
		System.out.println(title3);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestingLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Test");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Always Ahead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("TestLeaf@gmail.com");
		
		//State/Province select drop down
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select option = new Select(state);	
		option.selectByVisibleText("New York");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		
		//opens page ===> View Lead | opentaps CRM
		String title4= driver.getTitle();
		System.out.println(title4);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//opentaps CRM
		String title5= driver.getTitle();
		System.out.println(title5);
		Thread.sleep(1000);
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Very Imp");
		driver.findElement(By.name("submitButton")).click();
		//View Lead | opentaps CRM
		String title6= driver.getTitle();
		System.out.println(title6);
		Thread.sleep(1000);
		driver.close();
	}

}
