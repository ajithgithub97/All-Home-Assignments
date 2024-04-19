package pages;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class FindLeadPage extends BaseClassPOM {
	public FindLeadPage(ChromeDriver driver) {
		this.driver=driver;
		}
public FindLeadPage clickphone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
return this;
}
public FindLeadPage enterphonenumber(String phNum) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNum);
return this;
}
public FindLeadPage clickfindleadbutton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
}
public FindLeadPage clickfirestlead1() {
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
return this;
}
public ViewLeadPage clickfirstlead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
return new ViewLeadPage(driver);
}
public FindLeadPage verifydeletelead() {
	String verifyresult = driver.findElement(By.className("x-paging-info")).getText();
	if (verifyresult.contains("No records")) {
		System.out.println("Lead deleted successfully");
	}
	else
		System.out.println("Lead is not deleted");
return this;
}
public MergeLeadPage windowhandles(String FNAme) throws InterruptedException {
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FNAme);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles.get(0));
return new MergeLeadPage(driver);
}
public MergeLeadPage windowhaldles2(String LNAme) throws InterruptedException {
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(LNAme);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles2.get(0));
return new MergeLeadPage(driver);
}
public FindLeadPage entermergeleadid(String leadid) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
	Thread.sleep(3000);
	return this;
}
public FindLeadPage clickmergefindbutton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
return this;
}
public FindLeadPage verifymergelead() {
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
return this;
}
}
