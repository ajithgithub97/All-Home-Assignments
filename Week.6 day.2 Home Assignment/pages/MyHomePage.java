package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class MyHomePage extends BaseClassPOM{
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
		}
	public MyLeadsPage clickleads() {
		driver.findElement(By.linkText("Leads")).click();
return new MyLeadsPage(driver);
}
	
	public MyLeadsPage clickleadsedit() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
}
	public MyLeadsPage clickleaddelete() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
	public MyLeadsPage clickleadmerge() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
