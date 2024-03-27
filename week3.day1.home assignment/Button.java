package week3.day1.homeassignment;

public class Button extends WebElement {
	public void submit() {
	System.out.println("Submit Successful");

}public static void main(String[] args) {
	Button but = new Button();
	but.submit();
}
}
