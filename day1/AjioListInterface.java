package week3.day1;

import java.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@name='genderfilter']/following-sibling::label[@for='Men']")).click();
		
		//- Under "Category" click "Fashion Bags"
		Thread.sleep(1000);
		
		WebElement bag = driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[@for='Men - Fashion Bags']"));
		bag.click();
		//Print the count of the items found.
		System.out.println(bag.getText());
		//Get the list of brand of the products displayed in the page and print the list.
		
		List <WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		
		System.out.println();					
		System.out.println("Brand Names:");
		System.out.println();	
		Set<String> set1=new HashSet<String>();
	
		 for ( int i= 0; i < brandNames.size(); i++ )
			 set1.add(brandNames.get(i).getText());
		 for (String str : set1) {
				System.out.println(str);
			}
		
		 //Get the list of names of the bags and print it
		 
	 List <WebElement> bagNames = driver.findElements(By.xpath("//a[descendant::div[@class='brand']]//div[@class='nameCls']"));
		 
		 System.out.println();					 				 
		 System.out.println("Bag Names:");
		 System.out.println();
		 Set<String> set2=new HashSet<String>();
			
		 for ( int i= 0; i < bagNames.size(); i++ )
			 set2.add(bagNames.get(i).getText());
		 for (String str : set2) {
				System.out.println(str);
			}
		 driver.quit();
		 }

}
