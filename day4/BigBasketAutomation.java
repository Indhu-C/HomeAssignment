package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Precondition:
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on "Shop by Category".
		Actions act=new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("(//span[text()='Category'])[2]/ancestor::button"));
		act.pause(1000).click(element1).perform();
		Thread.sleep(1000);
		//Mouse over "Foodgrains, Oil & Masala".
	
		
		act.moveToElement(driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"))).pause(3000).perform();
		//Mouse over "Rice & Rice Products".
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).pause(5000).perform();
		//Click on "Boiled & Steam Rice".
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).pause(3000)
		.click(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).pause(1000)
		.perform();
		Thread.sleep(1000);
		//Filter the results by selecting the brand "bb Royal".
		act.scrollToElement(driver.findElement(By.xpath("//span[text()='Brands']"))).pause(3000).perform();
		act.click(driver.findElement(By.xpath("//label[text()='BB Royal']/preceding-sibling::input"))).pause(3000).perform();
		Thread.sleep(1000);
		//Click on "Tamil Ponni Boiled Rice".
		act.scrollToElement(driver.findElement(By.xpath("//a[@class='h-full']//h3[text()='Tamil Ponni Boiled Rice - 12 - 17 Months Old']")))
		.pause(3000).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@class='h-full']//h3[text()='Tamil Ponni Boiled Rice - 12 - 17 Months Old']")))
		.pause(3000)
		.click().perform();
		//Select the 5 Kg bag.
		Thread.sleep(1000);
		Set<String> allOpenWindows = driver.getWindowHandles();
		
		List<String> toGetChildWindows =new ArrayList<String>(allOpenWindows);
		
		driver.switchTo().window(toGetChildWindows.get(1));
		act.moveToElement(driver.findElement(By.xpath("//span[text()='5 kg']")))
		.pause(3000)
		.click().perform();
		//Check and note the price of the rice.
		WebElement cost = driver.findElement(By.xpath("//span[text()='₹378.18']"));
		System.out.println("Cost of Rice:"+ cost.getText());
		//Click "Add" to add the bag to your cart.
		act.moveToElement(driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")))
		.pause(3000)
		.click().perform();
		//Verify the success message that confirms the item was added to your cart.
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='An item has been added to your basket successfully']")));
		if(until.isDisplayed()==true) {
		Alert alert = driver.switchTo().alert();
		System.out.println("success message"+alert.getText());
		}
		Thread.sleep(1000);
		driver.switchTo().window(toGetChildWindows.get(1));*/
		//Take a snapshot of the current page
		 File screenShot = driver.getScreenshotAs(OutputType.FILE);
		 File target =new File("./snap/groceryItem.png");
		 FileUtils.copyFile(screenShot, target);
		 
		 driver.close();
		 driver.switchTo().window(toGetChildWindows.get(0));
		 driver.close();
		 
		
	}

}
