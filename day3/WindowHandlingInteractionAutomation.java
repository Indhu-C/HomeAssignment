package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
	
		//Precondition:
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA link.
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		System.out.println("Parent Window:"+ driver.getTitle());
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("(//td[2]/a/img)[1]")).click();
		//=========New Window========
		Set<String> allOpenWindows1 = driver.getWindowHandles();
		List<String> toGetChildWindows1 =new ArrayList<String>(allOpenWindows1);
		driver.switchTo().window(toGetChildWindows1.get(1));
		System.out.println("Popup Window:"+ driver.getTitle());
		//Click on the first resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(toGetChildWindows1.get(0));
		System.out.println("Parent Window:"+ driver.getTitle());
		
	
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//td[2]/a/img)[2]")).click();
		
		//=========New Window========
		Set<String> allOpenWindows2 = driver.getWindowHandles();
		List<String> toGetChildWindows2 =new ArrayList<String>(allOpenWindows2);
		driver.switchTo().window(toGetChildWindows2.get(1));
		System.out.println("Popup Window:"+driver.getTitle());
		
		//Click on the second resulting contact.
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		Thread.sleep(1000);
		driver.switchTo().window(toGetChildWindows1.get(0));
		System.out.println("Parent Window:"+ driver.getTitle());
		driver.findElement(By.xpath("//tr[4]/td[2]/a")).click();
		//Alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert: "+alert.getText());
		alert.accept();
		System.out.println("Parent Window:"+ driver.getTitle());
		driver.close();
		
	}

}
