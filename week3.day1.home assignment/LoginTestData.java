package week3.day1.homeassignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Ajith@97");

	}public void enterPassword() {
		System.out.println("Ajith@123");

	}
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		
	}
	
}
