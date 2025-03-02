package week2.day3.ClassAssignment;

public class Browser {
	String browserName ="";
	float browserVersion;
	
	public void openURL(){
		System.out.println("URL is Open  -"+browserVersion);
	}
	public void closeBrowser(){
		System.out.println(browserName+" - is closed");
	}
	public void navigateBack(){
		System.out.println("Go Back ");
		}
}
