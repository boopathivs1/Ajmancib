package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_37_Other_Transfer_PayLater  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC37 Other_Transfer_PayLater";

		testDescription="Other_Transfer_PayLater";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Sreejith";
		testKeyword="TC37";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

	public void ownaccount_PayNow(String casename,String GroupID ,String Username,String Password,String Otp,
			String fromaccno,String fromcomp,String tobene,String nickname,String currency,String amount,
			String Purpose,String auth1,String auth2,String frequency,String timesofpay,String data3,String data4,String data5,String data6,String data7) throws Exception{
String fromaccnum=regvalue(fromaccno);
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
.clickStatementMenu()
.verifystatementpage(fromaccno)
.getbalanceamnt()
.clicktooltip()
.clickPayment_link()
.clickvendor()
.Other_Transerpage("Tomorrow","Pay Later",fromcomp,tobene,fromaccnum,nickname,currency,
		amount,Purpose,frequency,timesofpay)
.fillOtp("OwnAccountOtpSubmit")
.verifysucessmsg()
.clickPayment_Report_link()
.OwnPaymentStatusCheck(prop.getProperty("localtransfer.xpath"), "Pending Authorization","Pending Authorization","Tomorrow")

.logout(true,usertype);
AuthUsername=auth1;
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
.clickpaymentMenu()
.navigatepaymentDateline()
.datelinefilter("paymentdd.selecttype.xpath","Local Bank Transfer Request","payment.status.xpath","Pending", getrefnumer, "Pending")
.authorize(auth2)
.datelinefilter("paymentdd.selecttype.xpath","Local Bank Transfer Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
.navigatepayreport()
.clickPayment_Report_link()
//.PaymentStatus("Own Account Transfer", "Pending Authorization","Pending")

//.OwnPaymentStatus(prop.getProperty("own.acc.payreports.xpath"), "Success","Success","Today")

.OwnPaymentStatusCheck(prop.getProperty("localtransfer.xpath"), "Success","Success","Tomorrow")


.navigateStatementpage()
.clicktooltip()
.clickAccount()
.clickStatementMenu()
.verifystatementpage(fromaccno)
.logout(LogoutStatus,usertype);
loginfoSuccess(testCaseName,testDescription);

		}

	catch (Exception e) {

		logout(LogoutStatus,usertype);
	throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

