package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_22_One_Time_Payment  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC22 One_Time_Payment";

		testDescription="One_Time_Payment";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Sreejith";
		testKeyword="TC22";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

	public void ownaccount_PayNow(String casename,String GroupID ,String Username,String Password,String Otp,
			String fromaccno,String corp,String accno,String category,String Biller,String serviceType,
			String consno,String Remarks,String auth1,String auth2,String timesofpay,String data3,String data4,String data5,String data6,String data7) throws Exception{
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
.clickBillPayment_link()
.clickOneTimepay_link()
.FillOneTimepayForm(corp, accno, category, Biller, serviceType, consno, Remarks)

.verifysucessmsg()
.clickPayment_Report_link()
.OwnPaymentStatusCheck(prop.getProperty("onetimepay.xpath"),"Pending Authorization","Pending Authorization","Today")

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
.datelinefilter("paymentdd.selecttype.xpath","Local Bank Transfer Request","payment.status.xpath","Pending", getrefnumer, "Pending")
.authorize(auth2)
.datelinefilter("paymentdd.selecttype.xpath","Local Bank Transfer Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
.navigatepayreport()
.clickPayment_Report_link()
//.PaymentStatus("Own Account Transfer", "Pending Authorization","Pending")

//.OwnPaymentStatus(prop.getProperty("own.acc.payreports.xpath"), "Success","Success","Today")

.OwnPaymentStatusCheck(prop.getProperty("onetimepay.xpath"), "Success","Success","Today")


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

