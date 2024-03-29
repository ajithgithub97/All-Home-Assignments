package week3.day2.homeassignment;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Data Base Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Data Base Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}
public static void main(String[] args) {
	JavaConnection jc = new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
}
}
