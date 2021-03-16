package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class AdminDatelinePage extends ProjectWrapp{
	public  AdminDatelinePage(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public AdminDatelinePage datelinefilter(String filtertype,String filtervalue,String filterstatustype,String FilterStatusvalue,String refno,String status) throws InterruptedException{
	//	Thread.sleep(15000);
		locateFrame("icanvas");

	FilterSelectVerification(filtertype,filtervalue,filterstatustype,FilterStatusvalue, refno,status);
return this;
	}
	
	public Users_Dashboard clickUsersMenu(){
		defaultcontent();
		clickByXpathExplict(".//p[text()='Users']");
		return new Users_Dashboard(driver, test);
		
	}

	
	public AdminDatelinePage authorizationDateline() throws InterruptedException{
		//authorizeRequest();
			
			authorizefromDatelineRequest();
			defaultcontent();
			Thread.sleep(20000);

			return this;
		}
	public AdminDatelinePage verifyAdminbuzz(String auth1,String auth2,String datelinekeyword) throws InterruptedException{
		Thread.sleep(3000);
		
		AdminDatelinePageBuzz(auth1, auth2,datelinekeyword);
		return this;


}
}