package week2.day4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	

	@Override
	public void connect() {
		System.out.println("Java Database Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Java Database disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update executed");
	}
	
	@Override
	void executeQuery() {
		System.out.println("Query executed");
	}
	
	public static void main(String[] args) {
		JavaConnection jc =new JavaConnection();
		jc.connect();
		jc.executeQuery();
		jc.executeUpdate();
		jc.disconnect();
	}



}
