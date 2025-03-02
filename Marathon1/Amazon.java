package Marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bag for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		//Print the total number of results
		String txt1=driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		String txt2=driver.findElement(By.xpath("(//span[contains(text(),'bag for boys')])[1]")).getText();
		System.out.println("Total number of results:" +txt1+txt2);
		
		//6)Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//span[text()='Brands']//following::div[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(" //span[text()='Skybags']")).click();
		
		//7) Choose New Arrivals (Sort)
		
		driver.findElement(By.xpath(" //span[contains(text(),'Sort by')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		Thread.sleep(1000);
		//8) Print the first resulting bag info
		//driver.findElement(By.xpath("(//span[text()='Safari'])[1]")).click();
		Thread.sleep(1000);
		String txt3=driver.findElement(By.xpath("//span[contains(text(),'Quadro')]")).getText();
		String txt4=driver.findElement(By.xpath("//span[@id='price-link']/following-sibling::a//span[@class='a-price-whole']")).getText();
		
		System.out.println("Name:"+txt3);
		System.out.println("Discounted Price:"+txt4);
		
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		//driver.close();
		 
		 
	}

}
