package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class WelcomePage extends BaseClassPOM {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
		}
	
	public WelcomePage verifyhomepage() {
	String verify = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
if (verify.contains("Welcome")) {
	System.out.println("Page navigated succesfully");
}else
	System.out.println("Page not navigated");
return this;
}
	
	
	public MyHomePage clickoncrmlink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
return new MyHomePage(driver);
	}
}
