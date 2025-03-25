package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class ProjSpecMethod extends AbstractTestNGCucumberTests{
	//public  ChromeDriver driver;
	private static final ThreadLocal<RemoteWebDriver> driver=new  ThreadLocal<RemoteWebDriver>();
	@BeforeMethod
	public void precondition() {
	//	driver = new ChromeDriver();
		setdriver(new ChromeDriver());
		getdriver().manage().window().maximize();
		getdriver().get("http://leaftaps.com/opentaps/control/main");
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@AfterMethod
	public void postcondition() {
		getdriver().quit();
	}
	public static RemoteWebDriver getdriver() {
		return driver.get();
	}
	public static void setdriver(RemoteWebDriver rwdriver) {
		driver.set(rwdriver);
	}
	

}
