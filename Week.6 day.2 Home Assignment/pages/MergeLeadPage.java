package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class MergeLeadPage extends BaseClassPOM {
	public MergeLeadPage(ChromeDriver driver) {
		this.driver=driver;
		}
public FindLeadPage clickonfromlead() {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
return new FindLeadPage(driver);
}
public FindLeadPage clickontolead() {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
return new FindLeadPage(driver);
}
public MergeLeadPage clickonmergebutton() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
return this;
}
public MergeLeadPage acceptalert() {
	driver.switchTo().alert().accept();
return this;
}
public FindLeadPage clickmergefindlead() {
	driver.findElement(By.linkText("Find Leads")).click();
return new FindLeadPage(driver);
}
}
