package week2.day3.Inheritance;

public class LoginTestData extends TestData{

	void enterUsername(String name){
		System.out.println(name);
	}
	void enterPassword(int pwd){
		System.out.println(pwd);
	}
	public static void main(String[] args) {

		TestData obj1= new TestData();
		LoginTestData obj2= new LoginTestData();
		
		obj1.enterCredentials("Indhu", 12345);
		obj2.enterCredentials("Indu", 1234);
		obj2.enterUsername("Ind");
		obj2.enterPassword(123);
	}
}
