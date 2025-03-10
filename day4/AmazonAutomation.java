package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("incognito");
		//Precondition:

		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Search for "oneplus 9 pro".
		Actions act=new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		act.sendKeys(element1,"oneplus 9 pro")
		.pause(1000)
		.click(driver.findElement(By.id("nav-search-submit-button")))
		.perform();
		//Get the price of the first product.
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println("Price of the first Mobile Listed:" +price.getText());
		WebElement cusRating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		System.out.println("Customer Rating for the first Mobile Listed:" +cusRating.getText());
		Thread.sleep(1000);
		//Click the first text link of the first image
		WebElement firstMobile = driver.findElement(By.xpath("(//span[contains(text(),'OnePlus')])[1]/ancestor::a"));
		//firstMobile.click();
		act.pause(1000).click(firstMobile).perform();
		//switching to child window
		Thread.sleep(10000);
		Set<String> allOpenWindows = driver.getWindowHandles();
		
		List<String> toGetChildWindows =new ArrayList<String>(allOpenWindows);
		
		driver.switchTo().window(toGetChildWindows.get(1));
		System.out.println("Title of new window:"+ driver.getTitle());
		//taking screenshot
		 File screenShot = driver.getScreenshotAs(OutputType.FILE);
		 File target =new File("./snap/amazon.png");
		 FileUtils.copyFile(screenShot, target);
		// Click the 'Add to Cart' button.
		 
		 WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		 act.pause(1000).click(addToCart).perform();
		 //Get the cart subtotal and verify if it is correct.
		 
		 Thread.sleep(10000);
		 WebElement cost = driver.findElement(By.xpath("//div[@id='attach-added-to-cart-message']//span[@id='attach-accessory-cart-subtotal']"));
			System.out.println("Cost of First Mobile:"+ cost.getText());
			
			driver.quit();
	}

}
