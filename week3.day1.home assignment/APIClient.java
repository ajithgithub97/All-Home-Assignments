package week3.day1.homeassignment;

public class APIClient {
	private void sendRequest(String endpoint) {
		System.out.println(endpoint);
		}
	private void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println(endpoint);	
System.out.println(requestBody);
System.out.println(true);
	}public static void main(String[] args) {
		
		APIClient ac = new APIClient();
		ac.sendRequest("Request accept");
		ac.sendRequest("Request Received", "Request send by clint", true);
	}
}
