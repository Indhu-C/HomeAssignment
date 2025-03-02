package week2.day3.ClassAssignment;

public class Chrome extends Browser {


		public void openIncognito() {

			System.out.println(" Open Incognito Mode");
		
		}
		
		public void clearCache()
		{

			System.out.println("Cache cleared");
		
		}
		public static void main(String[] args) {
			Chrome chrome = new Chrome();
			chrome.browserName ="CHROME";
			chrome.browserVersion=3.0f;
			
			chrome.closeBrowser();
			chrome.openURL();
			chrome.openIncognito();
			chrome.clearCache();
		}
	}


