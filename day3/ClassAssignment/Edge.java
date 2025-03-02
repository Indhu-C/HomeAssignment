package week2.day3.ClassAssignment;

public class Edge extends Browser {

	public void takeSnap(){

		System.out.println("Snap taken");
	
	}
	
	public void clearCookies()
	{

		System.out.println("Cookie cleared");
	
	}
	
	public static void main(String[] args) {
		Edge edge = new Edge();
		edge.browserName ="EDGE";
		edge.browserVersion=2.0f;
		
		edge.closeBrowser();
		edge.openURL();
		edge.takeSnap();
		edge.clearCookies();
	}

}
