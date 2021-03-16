package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_52_Assign_Corporates  extends ProjectWrapp
{
@BeforeClass(groups={"common"})
public void setDatag() {
	testCaseName="TC79 Assign Corporates";

	testDescription="Assign Corporates";	
	browserName="Chrome";
	dataSheetName="AjmanCIBPom";
	category="Sanity";
	authors="Boopathi";
	testKeyword="TC52";
	LogoutStatus=true;
	usertype="CIBUser";

}

@Test(groups={"sanity"},dataProvider="fetch")
public void SADADPaymentReports(String casename,String GroupID ,String Username,String Password,String Otp,String userid,String auth1,String auth2,String groupname,String data1,String data11,String data12,String data13,String data14,String data15,String data16,String data17,String data18,String data19,String data20,String data21) throws Exception{	
	
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

	.createUsersFilter("UserId","Active",userid,"true")
	.clickAssignCorporates(userid)
	
	
//	.verifyeditUserIdpresent(userid,"(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::button/span[text()='Assign Corporates'])[1]")
.clickNewAssignCorporate()
.corporateSelectionoptions()
	.clickDatelinemenu()
	.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")
	.verifyAdminbuzz(auth1,auth2, "User Corporate Assign Request")
	//.logout(true);
	.logout(true,usertype);	

	
	
	AuthUsername=auth1;

	
	//getnewurl();
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

	.datelinefilter("paymentdd.selecttype.xpath","User Corporate Request","payment.status.xpath","Pending", getrefnumer, "Pending")
	.authorizationDateline()

	.datelinefilter("paymentdd.selecttype.xpath","User Corporate Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")

.clickUsersMenu()
.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
	.createUsersFilter("UserId","Active",userid,"true")
	.verifyeditUserIdpresent(userid,"(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[contains(text(),'Corporates')])")
	//.verifyCorporateAssigned()
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
