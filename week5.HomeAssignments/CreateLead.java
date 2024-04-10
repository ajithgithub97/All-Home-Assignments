package week5.homeassignment;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@DataProvider(name="Fetch")
	public String[][] senddata() {
		String[][] data = new String[1][4];
		data[0][0] = "Testleaf";
		data[0][1] = "Ajith";
		data[0][2] = "V";
		data[0][3] = "99";
		
		return data;
	}
	
	@Test(dataProvider="Fetch")
	public void runCreateLead(String cName,String fName,String lName, String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}


	}

}
