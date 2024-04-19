package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassPOM;
import pages.LoginPage;

public class TC_001EditLead extends BaseClassPOM {
	@BeforeTest
	public void setValue() {
		filename = "EditLEadExcelSheet";

	}

	@Test(dataProvider = "fetchdata")
	public void runeditlead(String uName,String pWord,String phNum,String coName) throws InterruptedException {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.clickoncrmlink()
		.clickleadsedit()
		.clickfindleads()
		.clickphone()
		.enterphonenumber(phNum)
		.clickfindleadbutton()
		.clickfirstlead()
		.clickedit()
		.clearcompanyname()
		.sendname(coName)
		.clicksubmitbutton()
		.verifyeditcreation();
		
		
		







	}
}
