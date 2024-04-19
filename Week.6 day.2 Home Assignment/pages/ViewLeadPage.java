package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassPOM;

public class ViewLeadPage extends BaseClassPOM {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
		}
public ViewLeadPage verifyleadcreation() {
	 String verifypage = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if (verifypage.contains("Testleaf")) {
	System.out.println("Lead Created Successfuly");

}else
	System.out.println("Lead is not created");
return this;
}
public EditLLeadPage clickedit() {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLLeadPage(driver);

}
public ViewLeadPage verifyeditcreation() {
	String editname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if (editname.contains("TCS")) {
	System.out.println("Lead is Edited Successfully");
}
else
	System.out.println("Lead is Not Edited");
return this;
}
public MyLeadsPage clickdelete() {
	driver.findElement(By.linkText("Delete")).click();
	return new MyLeadsPage(driver);

}
}
