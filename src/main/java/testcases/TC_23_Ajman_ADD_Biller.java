package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_23_Ajman_ADD_Biller  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC23 ADD Biller";

		testDescription="SADAD - ADD Biller";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Boopathi";
		testKeyword="TC23";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")


		public void sadadAddBiller(String casename,String GroupID ,String Username,String Password,String Otp,
				String CorpBillname,String Categoryname,
				String billcomp,String servicetype,String BillAccNo,	String NickName,String auth1,String data3,String data4,String data4a,String data5,String data6,String data7,String data8,String data10,String data11) throws Exception{
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
	.clickBillPay()
	.clickAddManageBills()
	.clickAddpay()
	.fillAddBiller(CorpBillname, Categoryname, billcomp, BillAccNo,NickName,servicetype)
	.otphandling("click",prop.getProperty("click.confirmbutton.xpath"), null,null)
	
	//.otphandling("enter",prop.getProperty("Newdepost.otpenter.xpath"),Otp,null)
	//.otphandling("click",prop.getProperty("click.confirmbutton.xpath"), null,null)
	//.verifyServerError()
	.otphandling("getrefno",prop.getProperty("getref.number.beneficiary.xpath"), null,null)

.logout(LogoutStatus,usertype);
		


			//getrefnumer="DT-67741";

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
		.clickBillPayDateline()

		
		.datelinefilter("paymentdd.selecttype.xpath","Biller Management Request","payment.status.xpath","Pending", getrefnumer, "Pending")
		.authorization()
		.datelinefilter("paymentdd.selecttype.xpath","Biller Management Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
.navigatebillpay()
.clickAddManageBills();

		
		logout(LogoutStatus,usertype);
		
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
