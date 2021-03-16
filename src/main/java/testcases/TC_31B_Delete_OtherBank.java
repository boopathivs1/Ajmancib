package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_31B_Delete_OtherBank  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC_31B_Delete_OtherBank";

		testDescription="Delete Beneficiary - OtherBank";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Sreejith";
		testKeyword="TC31B";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

	public void createBeneficiaryLocalTransfer(String casename,String GroupID ,
			String Username,String Password,String Otp,String beneficiaryname,
			String auth1,String auth2,
			String phoneno,String country,String city,String paymentType,String accno,String currency,String translimit,String dailylimit,String Monthlylimit,String initiator,String sourceacc,String data,String datas) throws Exception{

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

.clickpaymentMenu()
.clickvendor()
.clickvendorMaintain()


.deleteBeneficiary(beneficiaryname)


.otphandlingNavigationPayDATELINE()
.clickDatelinemenu()
.Filterdateline("paymentdd.selecttype.xpath","Vendor Management Request","payment.status.xpath","Pending", getrefnumer,"Pending")
.verifyAdminbuzz(auth1,auth2,"Vendor Management Request")

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
.datelinefilter("paymentdd.selecttype.xpath","Vendor Management Request","payment.status.xpath","Pending", getrefnumer, "Pending")
//.authorization()
.authorizationfromDateline()

.datelinefilter("paymentdd.selecttype.xpath","Vendor Management Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")


.navigatevendorPaymentspage()

.clickvendor()

.clickvendorMaintain()
.deleteBeneficiaryaccNotpresent(beneficiaryname)
.logout(LogoutStatus,usertype);

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