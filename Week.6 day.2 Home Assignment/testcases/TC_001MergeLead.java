package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassPOM;
import pages.LoginPage;

public class TC_001MergeLead extends BaseClassPOM{
	@BeforeTest
	public void setValue() {
		filename = "MergeLeadExcelSheet";

	}
	
	@Test(dataProvider = "fetchdata")
public void runmergelead(String uName,String pWord,String FNAme,String LNAme,String leadid) throws InterruptedException {
	new LoginPage(driver)
	.enterusername(uName)
	.enterpassword(pWord)
	.clickloginbutton()
	.clickoncrmlink()
	.clickleads()
	.clickmergelead()
	.clickonfromlead()
	.windowhandles(FNAme)
	.clickontolead()
	.windowhaldles2(LNAme)
	.clickonmergebutton()
	.acceptalert()
	.clickmergefindlead()
	.entermergeleadid(leadid)
	.clickmergefindbutton()
	.verifymergelead();
	

}
}
