package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;
public class TC_09_Verify_Balance_Cerificate_Request  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC09 Balance Certificate Request";
		testDescription="Verify Balance Certificate Request";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC09";
		LogoutStatus=true;	
		usertype="CIBUser";
		}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String GroupID ,String Username,String Password,String Otp,
			String CompanyName,String Accno,String auth1,String data1,String Data5,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
String accnum=regvalue(Accno);
		
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
.clickBalanceRequestMenuLinks()
.fillBalance_RequestForm(CompanyName,accnum)
.requestSubmit()
.getReno("RefNo1")
.clickRequestStatusPage()
.filterRequestStatus("Balance Certificate",CompanyName,"Pending")
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
//.filterRequestFromDateline("Balance Certificate","Pending")
//.authorize(Otp)
//.filterRequestFromDateline("Balance Certificate","Accepted")
.verifyDatelineRequest_Status("Acceptfed")
.RequestmenuLink()
.clickRequestStatusPage()
.filterRequestStatus("Balance Certificate",CompanyName,"Active")
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

