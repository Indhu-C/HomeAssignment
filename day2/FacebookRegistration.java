package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Indhu");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("C");
		
		Thread.sleep(1000);
		//select drop downs for Date of Birth
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select optionDay = new Select(day);	
		optionDay.selectByValue("24"); 
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select optionMonth = new Select(month);
		optionMonth.selectByIndex(9);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select optionYear = new Select(year);
		optionYear.selectByVisibleText("1984");
		
		//radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]")).sendKeys("Indhu.C@gmail.com");
		//driver.findElement(By.xpath("//div[contains(text(),'New password')]")).sendKeys("pwd1234");
		
		driver.findElement(By.name("reg_email__")).sendKeys("Indhu.C@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("pwd1234");
		
		
	}

}
