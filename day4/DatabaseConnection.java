package week2.day4;

public interface DatabaseConnection {
	abstract void connect();
	abstract void disconnect();
	abstract void executeUpdate();
}
