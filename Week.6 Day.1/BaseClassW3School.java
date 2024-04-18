package week6.day1.homeassignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClassW3School {
	ChromeDriver driver;
	public String filename;
@BeforeMethod	
public void precondition() {
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
@AfterMethod
public void postcondition() {
	driver.close();
}
@DataProvider(name="fetchdata")
public String[][] senddata() throws IOException {
	return ReadData.readData(filename);

}
}
