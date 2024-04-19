package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadData;

public class BaseClassPOM {
	public ChromeDriver driver;
	public String  filename;
	
	
	@BeforeMethod
public void precondition() {
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@AfterMethod
	public void postcondition() {
	driver.close();	

	}
	@DataProvider(name = "fetchdata")
	public String[][] senddata() throws IOException {
		return ReadData.readData(filename);

	}
}

