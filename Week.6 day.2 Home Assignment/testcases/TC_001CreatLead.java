package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassPOM;
import pages.LoginPage;

public class TC_001CreatLead extends BaseClassPOM {
	@BeforeTest
	public void setValue() {
		filename = "CreatLeadExcelSheet";

	}

	@Test(dataProvider = "fetchdata")	
	public void runcreatlead(String uName, String pWord,String cName,String fName,String lname,String pNum) {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.verifyhomepage()
		.clickoncrmlink()
		.clickleads()
		.clickoncreatlead()
		.entercompanyname(cName)
		.enterfname(fName)
		.enterlname(lname)
		.enterpnumber(pNum)
		.entersubmitbutton()
		.verifyleadcreation();



	}
}
