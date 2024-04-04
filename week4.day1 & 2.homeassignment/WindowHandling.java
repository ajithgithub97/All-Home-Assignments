package week4.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("(//input[contains(@class,'XdijitInputField dijitInputFieldValidationNormal')])[1]")).sendKeys("9876543210");
	driver.findElement(By.xpath("(//input[contains(@class,'XdijitInputField dijitInputFieldValidationNormal')])[2]")).sendKeys("9876543210");
	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	System.out.println("Window Title:" +driver.getTitle());
}
}
