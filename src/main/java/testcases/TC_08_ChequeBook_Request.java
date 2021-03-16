package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;
public class TC_08_ChequeBook_Request  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC08_ChequeBook_Request";
		testDescription="Verifying ChequeBook_Request";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Regression";
		authors="Sreejith";
		testKeyword="TC08";
		LogoutStatus=true;	
		usertype="CIBUser";
		

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String GroupID ,String Username,String Password,String Otp,String CompanyName,String accnum,String checkbookno,String checkbookType,String Branchname,String auth1,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{

		try{


		new	Ajman_HomePage(driver,test)
	.enterGroupID(GroupID)
	.enterUsernameID(Username)
	.clickLoginButton()
	.clickVirtualPad()
.enterPassword(Password)
	.clickSecureimage()
	.clickLoginButtonFinal()
	.submitTokenXpath(Otp)
	.clickAccountMenu()
.clickRequestPage()	
.clickcheckbookRequest()
.fillcheckbook_RequestForm(CompanyName,accnum,checkbookno,checkbookType,Branchname)
.requestSubmit()
.getReno("RefNo1")
.clickRequestStatusPage()
.filterRequestStatus("Cheque Book Request",CompanyName,"Pending")
.verifyRequestStatus("Pending")
.logout(LogoutStatus,usertype);

//		getrefnumer="SR-20210225T105741457";
	getnewurl();	
	new	Ajman_HomePage(driver,test)
.enterGroupID(GroupID)
.enterUsernameID(auth1)
.clickLoginButton()
.clickVirtualPad()
.enterPassword(Password)
.clickSecureimage()
.clickLoginButtonFinal()
.submitTokenXpath(Otp)
.clickAccountMenu()

.clickDateline()
.filterRequestFromDateline("Cheque Book Request","Pending")
.authorize(Otp)
.filterRequestFromDateline("Cheque Book Request","Accepted")
.verifyDatelineRequest_Status("Acceptfed")
.RequestmenuLink()
.clickRequestStatusPage()
.filterRequestStatus("Cheque Book Request",CompanyName,"Active")
.verifyRequestStatus("Active");
logout(LogoutStatus,usertype);
		}

catch (Exception e) {
	logfailed(testCaseName,testDescription);
	//log.error(e);
	logout(LogoutStatus,usertype);

	throw new Exception();
	
	// TODO: handle exception
}

}
}