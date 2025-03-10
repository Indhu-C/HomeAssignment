package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapdealAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Precondition:

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		// Go to "Men's Fashion"
		WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Men')]/parent::a[@class='menuLinks leftCategoriesProduct ']"));
		act.moveToElement(element1).pause(1000).perform();
	
		//Go to "Sports Shoes".
		WebElement element2 = driver.findElement(By.xpath("//li[@navindex='1']//span[contains(text(),'Sports Shoes')]"));
		act.moveToElement(element2).pause(1000).click().perform();	
		
		//Get the count of sports shoes.
		WebElement element3 = driver.findElement(By.xpath("//h1[@class='category-name']/following-sibling::span"));
		System.out.println("count of sports shoes " +element3.getText());
		Thread.sleep(1000);
		//Click on "Training Shoes".
		WebElement element4 = driver.findElement(By.xpath("//div[text()='Training Shoes']/parent::a"));
		act.click(element4).perform();
		//Sort the products by "Low to High".
		WebElement element5 = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		act.pause(1000).click(element5).perform();
		Thread.sleep(1000);
		WebElement element6 = driver.findElement(By.xpath("(//li[@data-index='1'])[2]"));
		act.moveToElement(element6).pause(1000).click(element6).perform();
		Thread.sleep(1000);
		//Check if the displayed items are sorted correctly.
		String txt1=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		String txt2=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		int i=Integer.valueOf(txt1.substring(4));
		int j=Integer.valueOf(txt2.substring(4));
		if(i<=j)
		System.out.println("Sorted from Low to High Price");
		//Select any price range ex:(500-700).
		
		WebElement element7 = driver.findElement(By.xpath("//input[@name='fromVal']"));
				element7.clear();
		WebElement element8 = driver.findElement(By.xpath("//input[@name='toVal']"));
		element8.clear();
		
		act.sendKeys(element7, "500").pause(1000).perform();
		act.sendKeys(element8, "700").pause(1000).perform();
		
		WebElement element9 = driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
		act.pause(1000).click(element9).perform();
		Thread.sleep(1000);
		//Filter by any colour.
		WebElement element10 = driver.findElement(By.xpath("//a[text()=' White & Blue']"));
		act.pause(1000).moveToElement(element10).click().perform();
		//Verify all the applied filters.
		String txt3=driver.findElement(By.xpath("(//div[@class='filters-top-selected']//a)[1]")).getText();
		String txt4=driver.findElement(By.xpath("(//div[@class='filters-top-selected']//a)[2]")).getText();
		System.out.println("Applied Filters:"+txt3+"  "+txt4);
		
		//Mouse hover on the first resulting "Training Shoes".
		WebElement element11 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.pause(1000).moveToElement(element11).perform();
		Thread.sleep(1000);
		//Click the "Quick View" button.
		WebElement element12 = driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
		act.pause(1000).click(element12).perform();
		//Print the cost and the discount percentage.
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sidebarin-content']")));
		
		WebElement element14 = driver.findElement(By.xpath("//span[@class='payBlkBig']")); 
		WebElement element15 = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		System.out.println("Applied Filters:"+element14.getText()+"  "+element15.getText());
		
		//Take a snapshot of the shoes
		
		 File screenShot = driver.getScreenshotAs(OutputType.FILE);
		 File target =new File("./snap/TrainingShoe.png");
		 FileUtils.copyFile(screenShot, target);
		 
		 driver.close();
		 driver.switchTo().parentFrame();
		 driver.close();
		
				}

}
