package week4.day4;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameter extends ProjectSpecificMethod {
	@DataProvider(name = "fetchData" )
	public String[][] sendData() {
		String[][] data=new String[2][2];
		// row1
		data[0][0] = "Legal Entities";
		data[0][1] = "Salesforce Automation by Indhu";
		// row2
		data[1][0] = "Legal Entities";
		data[1][1] = "Salesforce Automation";
		
		return data;
	}
	@Test(dataProvider = "fetchData")
	public  void TestCase(String appName,String uName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(appName);
		  driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();


	Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(uName);
	 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
}
}
