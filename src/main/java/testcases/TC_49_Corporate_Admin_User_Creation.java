package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_49_Corporate_Admin_User_Creation  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC49 Corporate_Admin_User_Creation";

		testDescription="TC49 Corporate_Admin_User_Creation";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Boopathi";
		testKeyword="TC49";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

	public void createUser(String casename,String GroupID ,String Username,String Password,String Otp,String userid,String firstname,String phonenumber,String emailid,String Country,String City,String corporateChannels,String idIssuingCountry,String idtype,String PassportNumber,String Securitychoosen,String TransactionSecurityChoosen,String auth1,String auth2,String groupname,String data2) throws Exception{

	
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
			.clickAdmin()
		
		.clickUsersMenu()
			.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
			.clickCreateUsers()
		.fillCreateUsersForm(userid, firstname, phonenumber, emailid, Country, City, corporateChannels, idIssuingCountry, idtype, PassportNumber, Securitychoosen, TransactionSecurityChoosen)

			.clickDatelinemenu()
.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")
.verifyAdminbuzz(auth1,auth2, "Corporate User Profile Creation Request")

.logout(true,usertype);	

			
AuthUsername=auth1;

			
getnewurl();
new	Ajman_HomePage(driver,test)
.enterGroupID(GroupID)
.enterUsernameID(Username)
.clickLoginButton()
.clickVirtualPad()
.enterPassword(Password)
.clickSecureimage()
.clickLoginButtonFinal()
.submitTokenXpath(Otp)
.clickAdminpage()

.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Creation Request","payment.status.xpath","Pending", getrefnumer, "Pending")

.authorizationDateline()
.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Creation Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")

.clickUsersMenu()

//.clickUsersPage()	
.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
.createUsersFilter("UserId","Active",userid,"true")
//.verifyUserCreation("userid");
.verifyUseIdpresent(userid).logout(LogoutStatus,usertype);

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
