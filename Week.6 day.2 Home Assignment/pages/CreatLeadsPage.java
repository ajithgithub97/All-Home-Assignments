package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class CreatLeadsPage extends BaseClassPOM{
	public CreatLeadsPage(ChromeDriver driver) {
		this.driver=driver;
		}
	public CreatLeadsPage entercompanyname(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
return this;
	}
	public CreatLeadsPage enterfname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;		
	}
	 public CreatLeadsPage enterlname(String lname) {
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
return this;
	}
	 public CreatLeadsPage enterpnumber(String pNum) {
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNum);
return this;
	}
public ViewLeadPage entersubmitbutton() {
	driver.findElement(By.name("submitButton")).click();
return new ViewLeadPage(driver);
}
}

