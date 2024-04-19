package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassPOM;
import pages.LoginPage;

public class TC_001DeleteLead extends BaseClassPOM {
	@BeforeTest
	public void setValue() {
		filename = "DeleteLeadExcelSheet";

	}
	@Test(dataProvider = "fetchdata")	
	public void rundeletelead(String uName,String pWord,String phNum,String leadid) throws InterruptedException {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.clickoncrmlink()
		.clickleads()
		.clickfindleads()
		.clickphone()
		.enterphonenumber(phNum)
		.clickfindleadbutton()
		.clickfirestlead1()
		.clickfirstlead()
		.clickdelete()
		.clickfindleadsdelete1()
		.enterleadid(leadid)
		.clickfindleadbutton()
		.verifydeletelead();
		
		

	}
}
