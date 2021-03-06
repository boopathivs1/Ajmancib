package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_54_Delete_Deassign_Access_Rights  extends ProjectWrapp
{
@BeforeClass(groups={"common"})
public void setDatag() {
	testCaseName="TC54 Delete/Deassign Access Rights";

	testDescription="Delete/Deassign Access Rights";	
	browserName="Chrome";
	dataSheetName="AjmanCIBPom";
	category="Sanity";
	authors="Boopathi";
	testKeyword="TC54";
	LogoutStatus=true;
	usertype="CIBUser";

}

@Test(groups={"sanity"},dataProvider="fetch")
public void deleteDeassignAccessRights(String casename,String GroupID ,String Username,String Password,String Otp,String userid,String auth1,String auth2,String groupname,String rightsname,String data11,String data12,String data13,String data14,String data15,String data16,String data17,String data18,String data19,String data20,String data21) throws Exception{	
	
	try{
		/*
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
	.verifyeditUserIdpresent(userid,"(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[contains(text(),'Corporates')])")
.clickAssignAccessRights()
.clickEditAssignAccessRights(rightsname)
.clickDeleteAssignAccessRights()

.clickDatelinemenu()
.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")

.verifyAdminbuzz(auth1,auth2, "Users Corporate Access Right Deletion Request")
	.logout(true,usertype);	
*/
	
//	getrefnumer="DT-26194382";
//AuthUsername="sridhar03";
	
	AuthUsername=auth1;

	//getnewurl();
	new	Ajman_HomePage(driver,test)
	.enterGroupID(GroupID)
	.enterUsernameID(auth1)
	.clickLoginButton()
	.clickVirtualPad()
	.enterPassword(Password)
	.clickSecureimage()
	.clickLoginButtonFinal()
	.submitTokenXpath(Otp)
	.clickAdminpage()
/*
	.datelinefilter("paymentdd.selecttype.xpath","Users Corporate Access Right Request","payment.status.xpath","Pending", getrefnumer, "Pending")
	.authorizationDateline()
	.datelinefilter("paymentdd.selecttype.xpath","Users Corporate Access Right Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
*/
	.clickUsersMenu()
.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
	

.createUsersFilter("UserId","Active",userid,"true")
	.verifyeditUserIdpresent(userid,"(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[contains(text(),'Corporates')])")
.clickAssignAccessRights()
.verifyCorporateAccessAssignedStatus("Un-Assigned").logout(LogoutStatus,usertype);
	
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
