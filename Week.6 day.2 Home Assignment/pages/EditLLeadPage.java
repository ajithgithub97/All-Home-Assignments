package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class EditLLeadPage extends BaseClassPOM{
	public EditLLeadPage(ChromeDriver driver) {
		this.driver=driver;
		}
public EditLLeadPage clearcompanyname() {
	WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	companyName.clear();
	return this;
}
public EditLLeadPage sendname(String coName) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(coName);
return this;
}

public ViewLeadPage clicksubmitbutton() {
	driver.findElement(By.name("submitButton")).click();
return new ViewLeadPage(driver);
}
}
