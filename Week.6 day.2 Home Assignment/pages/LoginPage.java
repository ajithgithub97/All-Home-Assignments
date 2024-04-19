package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class LoginPage extends BaseClassPOM {
	
public LoginPage(ChromeDriver driver) {
this.driver=driver;
}

	public LoginPage enterusername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
return this;
	}
	public LoginPage enterpassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
return this;
	}
	public WelcomePage clickloginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
return new WelcomePage(driver);
	}
}
