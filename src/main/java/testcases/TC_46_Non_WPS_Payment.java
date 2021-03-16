package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;
public class TC_46_Non_WPS_Payment  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC46_Verify Non_WPS_Payment";
		testDescription="Checking the Non_WPS_Payment";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC46";
		LogoutStatus=true;	
		usertype="CIBUser";
		

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String GroupID ,String Username,String Password,
			String Otp,String fromcompany,String fromacc,String paymenttype,String filelocation,String auth1,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{

		filelocation="E:/workspacegit/version 2/GitLabWorkSpace/Clayfin_Automation/AjmanCib/data/non-wps-payment.xls";
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
	.payment_link()
	.bulkUploadMenu()
	//.clickBulkUpload()
	.clickfileUploadTab()
	
	.fillFileUploadForm(fromcompany, fromacc, paymenttype, filelocation)
	//.otphandling("click",prop.getProperty("Addbeneficiary.confirm.xpath"), null,null)
	//.otphandling("enter",prop.getProperty("Newdepost.otpenter.xpath"),Otp,null)
//	.otphandling("click",prop.getProperty("click.confirmbutton.xpath"), null,null)
	.otphandling("getrefno",prop.getProperty("getref.number.beneficiary.xpath"), null,null)
.NavigationWPS()
.verifyfileStatusTab("Pending Authorization")
.logout(true,usertype);	
		
		
		
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
		//.verifybellicon()
		.payment_link()
		.bulkUploadMenu()
		.locatingframes()

		.verifyfileStatusTab("Pending Authorization")		
		.authorizationWPS()
		.verifyfileStatusTab("Pending bank Approval")
		.Switch_defaultContent()
		.navigateStatementpage()
		.clicktooltip()
		.clickAccount()
		.clickStatementMenu()
		.verifystatementpage(fromacc)
		.logout(LogoutStatus,usertype);
		loginfoSuccess(testCaseName,testDescription);



	
	
		}

	catch (Exception e) {
		logfailed(testCaseName,testDescription);
		log.error(e);
		logout(LogoutStatus,usertype);

		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}