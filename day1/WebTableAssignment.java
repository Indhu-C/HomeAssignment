package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableAssignment {
	public static void main(String[] args) throws InterruptedException {
		//Precondition:
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on “Crypto” tab
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		act.moveToElement(driver.findElement(By.xpath("//button[@aria-label='More']"))).perform();
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']"));
		element1.click();
		act.scrollByAmount(0, 300).perform();
		//Locate the cryptocurrency names in the table using specific row and column.
		
		List<WebElement> cryptoNames = driver.findElements(By.xpath("//table[@data-testid='table-container']/tbody/tr"));
		System.out.println("Total Crypto Currencies Displayed: "+cryptoNames.size());
		System.out.println("Crypto Currencies Names: ");
		System.out.println("==================");
		
		for(int i=1; i<= cryptoNames.size(); i++) {
			String names = driver.findElement(By.xpath("//table[@data-testid='table-container']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(names);
		}
}
}