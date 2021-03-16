package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_25_Ajman_Delete_Biller  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC25 Delete Biller";

		testDescription="Delete Biller";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Boopathi";
		testKeyword="TC25";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

		public void sadadDeleteBiller(String casename,String GroupID ,String Username,String Password,String Otp,String CorpBillname,String CategoryName,
				String billcomp,String NickName,String auth1,String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data10,String data11,String data12,String data14) throws Exception{

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
.addMangebillsFilter(CorpBillname,CategoryName,billcomp)

.deleteManageBills(NickName)
		.otphandling("click",prop.getProperty("click.confirmbutton.xpath"), null,null)
		//.otphandling("enter",prop.getProperty("Newdepost.otpenter.xpath"),Otp,null)
		//.otphandling("click",prop.getProperty("click.confirmbutton.xpath"), null,null)
		.otphandling("getrefno",prop.getProperty("getref.number.beneficiary.xpath"), null,null)
		//.otphandling("verify",prop.getProperty("addbiller.verify.submit.xpath"), null,"Successfully")
//		.NavigationSADADpage()
	//	.clickAddManegBills()
		//.addMangebillsFilter(CorpBillname,CategoryName,billcomp)
	
	//	.verifyDeleteBiller(NickName)
		.logout(LogoutStatus,usertype);
		
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
.clickAddManageBills()

		
.addMangebillsFilter(CorpBillname,CategoryName,billcomp);

		
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
