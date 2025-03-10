package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		//Precondition:
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Uncheck the "Sort on Date" checkbox.
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		//Retrieve the train names from the web table.
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr"));
		 System.out.println("Total no of train:"+rows.size());
		 List<WebElement> columns = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr[1]/td"));
		// System.out.println(columns.size());
		 Set<String> set =new HashSet<String>();
			for (int i = 2; i <= 35; i++) {
				
					WebElement element = driver.findElement(By.xpath("//div[@id='divTrainsList']//tbody/tr["+i+"]/td[2]"));
					
					//System.out.println( element.getText());
					 set.add(element.getText());
				}
				
		for (String string : set) {
			 System.out.println(string);
		}
			
			
	}

}
