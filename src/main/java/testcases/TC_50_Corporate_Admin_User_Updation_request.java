package testcases;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.Ajman_HomePage;
import wrappers.ProjectWrapp;

public class TC_50_Corporate_Admin_User_Updation_request  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC50 Corporate_Admin_User_Updation";

		testDescription="TC50 Corporate_Admin_User_Updation";
		browserName="Chrome";
		dataSheetName="AjmanCIBPom";
		category="Sanity";
		authors="Boopathi";
		testKeyword="TC50";
		LogoutStatus=true;
		usertype="CIBUser";

	}

	@Test(groups={"sanity"},dataProvider="fetch")

	public void editUser(String casename,String GroupID ,String Username,String Password,String Otp,String userid,String firstname,String phonenumber,String emailid,String Country,String City,String corporateChannels,String idIssuingCountry,String idtype,String PassportNumber,String Securitychoosen,String TransactionSecurityChoosen,String auth1,String auth2,String groupname,String data2) throws Exception{


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
			.verifyUseIdpresent(userid)
			.clickUsersEditLink(userid)
			.filleditUsersForm(firstname, Country, City, corporateChannels, idIssuingCountry, idtype, PassportNumber,Securitychoosen, TransactionSecurityChoosen)
			.clickDatelinemenu()
			.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")
			.verifyAdminbuzz(auth1,auth2, "Corporate User Profile Updation Request")

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

		.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Pending", getrefnumer, "Pending")
		//.authorization()
			.authorizationDateline()
			.datelinefilter("paymentdd.selecttype.xpath","Corporate User Profile Request","payment.status.xpath","Accepted", getrefnumer, "Accepted")
			.clickUsersMenu()

			.clickAssignUsers("(.//h4[text()='"+groupname+"']//following::span[contains(text(),'Assign Users')])[1]")
			.createUsersFilter("UserId","Active",userid,"true")
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
