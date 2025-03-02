package week2.day3;

public class APIClient {
		
	void sendRequest(String endpoint){
		System.out.println(endpoint);
	}
	void sendRequest(String endpoint,String requestBody,boolean requestStatus){
		if(requestStatus == true) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		}
	}
	public static void main(String[] args) {
		APIClient apiClass = new APIClient();
		apiClass.sendRequest("Enter Name");
		apiClass.sendRequest("Enter Id No", "Enter Org", true);
		
		apiClass.sendRequest("Enter DoorNo", "Enter Address", false);
	}
}
