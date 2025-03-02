package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionRadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 Thread.sleep(1000);
		 
		 	//Your most favorite browser
			WebElement favBrowserRB = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));

			if (favBrowserRB.isSelected() == false) {
				favBrowserRB.click();
			}
			Thread.sleep(1000);
			
			//UnSelectable radio button
			WebElement unSelectRB = driver.findElement(By.xpath("//label[text()='Chennai']"));

			if (unSelectRB.isSelected() == false) {
				unSelectRB.click();
			}
			Thread.sleep(1000);
			
			
			if (unSelectRB.isSelected() == true) {
				unSelectRB.clear();
			}
			Thread.sleep(1000);
			//Find the default select radio button
			WebElement defaultSelectRB = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));

			if (defaultSelectRB.isEnabled() == true) {
				
				System.out.println("Default Value Safari selected");
				
			}
			defaultSelectRB.click();
			/*Thread.sleep(1000);
			if (defaultSelectRB.isSelected() == false) {
				
				System.out.println("Default Value Safari now unselected");
				
			}*/
			
			//Select the age group (only if not selected) -radio button
			WebElement ageGroupRB = driver.findElement(By.xpath("//label[text()='21-40 Years']"));

			if (ageGroupRB.isEnabled() == true) {
				
				System.out.println("Default Value 21-40 Years selected");
			}
			
			ageGroupRB.click();

			if (ageGroupRB.isSelected() == false) {
				
				System.out.println("Default Value 21-40 Years now unselected");
			}
			Thread.sleep(1000);
			driver.close();
	}
	

}
