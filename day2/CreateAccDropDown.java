package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccDropDown {

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
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		Thread.sleep(1000);
		
		//opens page ===> Create Account | opentaps CRM
		String title3= driver.getTitle();
		System.out.println(title3);
		
		
		driver.findElement(By.id("accountName")).sendKeys("IndTestLeafs3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Industry select drop down
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select option1 = new Select(industry);	
		option1.selectByValue("IND_SOFTWARE"); 
		
		//Ownership select drop down
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select option2 = new Select(ownership);	
		option2.selectByVisibleText("S-Corporation"); 
		
		//Source select drop down
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select option3 = new Select(source);	
		option3.selectByValue("LEAD_EMPLOYEE"); 
		
		
		//Marketing Campaign select drop down
		WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select option4 = new Select(marketing);	
		option4.selectByIndex(6); 
		
		//State/Province select drop down
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select option5 = new Select(state);	
		option5.selectByValue("TX");
				
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//opens page ===> Account Details | opentaps CRM
				String title4= driver.getTitle();
				System.out.println(title4);
				
				Thread.sleep(1000);
				
				
				//driver.close();

	}
}
