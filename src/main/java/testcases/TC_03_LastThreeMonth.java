package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;
public class TC_03_LastThreeMonth  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC03-Last Three Months statement";
		testDescription="Account Statement - Last Three Months statement";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC03";
		LogoutStatus=true;	
		usertype="CIBUser";
		

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String GroupID ,String Username,String Password,String Otp,String accno,String Data2,String Data3,String Data4,String Data5,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
String accnum=regvalue(accno);
	

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
	.clickStatementMenuLink()
	.selectAccount(accnum)
	.clickLastThree();
		logout(LogoutStatus,usertype);	
	
	
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

