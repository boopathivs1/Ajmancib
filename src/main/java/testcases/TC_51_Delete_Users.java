package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_51_Delete_Users  extends ProjectWrapp
{
@BeforeClass(groups={"common"})
public void setDatag() {
	testCaseName="TC51 Delete Users";

	testDescription="Delete Users";	
	browserName="Chrome";
	dataSheetName="AjmanCIBPom";
	category="Sanity";
	authors="Boopathi";
	testKeyword="TC51";
	LogoutStatus=true;
	usertype="CIBUser";

	
	
}


@Test(groups={"sanity"},dataProvider="fetch")
public void deleteUser(String casename,String GroupID ,String Username,String Password,String Otp,String userid,String auth1,String auth2,String groupname,String Country,String City,String corporateChannels,String idIssuingCountry,String idtype,String PassportNumber,String Securitychoosen,String TransactionSecurityChoosen,String datas,String dataa,String daatss,String data2) throws Exception{
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
		//.verifyeditUserIdpresent(userid,"(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::button/span[2])[1]")

		.clickUsersEditLink(userid)
		.clickUsersDeleteLink()
		.clickDatelinemenu()
		.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")
		.verifyAdminbuzz(auth1,auth2, "Corporate User Profile Deletion Request")
		

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

		.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Deletion Request","payment.status.xpath","Pending", getrefnumer, "Pending")
		.authorizationDateline()
		.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Deletion Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
	
		.clickUsersMenu()

		//.clickUsersPage()	
		.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
		.createUsersFilter("UserId","Active",userid,"true")
		//.verifyUserCreation("userid");
		. verifyUseIdDeletion(userid).logout(LogoutStatus,usertype);
//		.verifyUseIdpresent(userid).logout(LogoutStatus,usertype);

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
