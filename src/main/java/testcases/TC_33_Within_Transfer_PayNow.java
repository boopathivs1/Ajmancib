package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_33_Within_Transfer_PayNow  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC33 Within_Transfer_PayNow";

		testDescription="Within_Transfer_PayNow";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Boopathi";
		testKeyword="TC33";
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
.verifystatementpage(fromaccnum)
.getbalanceamnt()
.clicktooltip()
.clickPayment_link()
.clickvendor()
.within_Transerpage("Today","Pay Now",fromcomp,tobene,fromaccnum,nickname,currency,
		amount,Purpose,frequency,timesofpay)
.fillOtp("WithinAccountOtpSubmit")
.verifysucessmsg()
.clickPayment_Report_link()
.OwnPaymentStatusCheck(prop.getProperty("payment.req.type.value"), "Pending Authorization","Pending Authorization","Tomorrow")

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
.clickpaymentMenu()
.navigatepaymentDateline()
.datelinefilter("paymentdd.selecttype.xpath","Within Ajman Bank Transfer Request","payment.status.xpath","Pending", getrefnumer, "Pending")
.authorization()
.datelinefilter("paymentdd.selecttype.xpath","Within Ajman Bank Transfer Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
.navigatepayreport()
.clickPayment_Report_link()
//.PaymentStatus("Own Account Transfer", "Pending Authorization","Pending")

//.OwnPaymentStatus(prop.getProperty("own.acc.payreports.xpath"), "Success","Success","Today")

.OwnPaymentStatusCheck(prop.getProperty("payment.req.type.value"), "Success","Success","Tomorrow")


.navigateStatementpage()
.clicktooltip()
.clickAccount()
.clickStatementMenu()
.verifystatementpage(fromaccnum)
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

