package week3.day1.homeassignment;

public class WebElement {
public void click() {
	System.out.println("WebElement allowed user to click");

}public void setText(String text) {
System.out.println(text);
}public static void main(String[] args) {
	WebElement we = new WebElement();
	we.setText("Aijth");
	we.click();
	
}
	
}

