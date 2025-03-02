package week2.day3;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionCheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Basic Check Box
		WebElement basicCB = driver.findElement(By.xpath("//span[text()='Basic']"));

		if (basicCB.isSelected() == false) {
			basicCB.click();
		}

		// Notification Check Box
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(2000);

		String chkdMg = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		if (chkdMg.equals("Checked")) {
			
			System.out.println(" PopUp -Checked is displayed.");
		}
		

		// Favorite Language Check Box
		WebElement favLangCB = driver.findElement(By.xpath("//label[text()='Java']"));

		if (favLangCB.isSelected() == false) {
			favLangCB.click();
		}
		Thread.sleep(1000);
		// Tri-State Checkbox
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		Thread.sleep(1000);
		String triStateCB1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		if (triStateCB1.equals("State = 1")) {
			System.out.println("First state");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		Thread.sleep(2000);
		String trStateCB2 = driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
		if (trStateCB2.equals("State = 2")) {
			System.out.println("Second state");
		}
		// Toggle Switch
		WebElement toggleSwitch = driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]"));

		if (toggleSwitch.isSelected() == false) {
			toggleSwitch.click();
		}
		//Verify if check box is disabled
		WebElement disableCB = driver.findElement(By.xpath("//span[text()='Disabled']"));

		if (disableCB.isEnabled() == true) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
		Thread.sleep(10000);
		//multiple location
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[@data-label='Cities']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(("(//label[text()='London'])[2]/preceding::div[1]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(("(//label[text()='Paris'])[2]/preceding::div[1]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
		
		String text = driver.findElement(By.xpath(("//h5[text()='Select Multiple']/following::div[@aria-haspopup='listbox']"))).getText();
		System.out.println(text);
		
		driver.close();
		
	}
}
