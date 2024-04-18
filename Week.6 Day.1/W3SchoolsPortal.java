package week6.day1.homeassignment;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class W3SchoolsPortal extends BaseClassW3School {
	@BeforeTest
	public void setValue() {
		filename = "W3Schools";

	}

	@Test(dataProvider="fetchdata")
	public void checkoutform(String cname,String ccnum,String expmonth,String cvv,String expyear,String fname,String email,String adr,String city, String zip, String state ) {


		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(cname);
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccnum);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(expmonth);
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(expyear);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(adr);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
	}
}
