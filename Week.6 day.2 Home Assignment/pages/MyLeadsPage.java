package pages;


import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class MyLeadsPage extends BaseClassPOM {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
		}
	public CreatLeadsPage clickoncreatlead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreatLeadsPage(driver);
}
	public FindLeadPage clickfindleads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);

	}
	public FindLeadPage clickfindleadsdelete() {
		driver.findElement(By.linkText("Find Leads")).click();	
		return new FindLeadPage(driver);
	}
	public MyLeadsPage clickfindleadsdelete1() {
		driver.findElement(By.linkText("Find Leads")).click();	
		return this;

	}
	public FindLeadPage enterleadid(String leadid) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		return new FindLeadPage(driver);

	}
	public MergeLeadPage clickmergelead() {
		driver.findElement(By.linkText("Merge Leads")).click();
return new MergeLeadPage(driver);
	}
}