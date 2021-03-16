package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Account_DateLine  extends ProjectWrapp{
	public  Account_DateLine(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	
	
	
	
	public Account_DateLine filterRequestFromDateline(String selectType,String status) throws InterruptedException{
		

		locateFrame("icanvas");
		try {
readytimes();
			readystate();
			jqueryload();
		} catch (InterruptedException e1) {
		}
		clickByXpathExplict(prop.getProperty("click.filtericon.dateline.xpath"));

		
		
		dropdownSelection(prop.getProperty("paymentdd.selecttype.xpath"),selectType);
		
dropdownSelection(prop.getProperty("payment.status.xpath"),status);
clickByXpathExplict(prop.getProperty("click.filter.admindeateline.xpath"));

defaultcontent();
Thread.sleep(1000);
try {
	
readytimes();
	readystate();
	jqueryload();
} catch (InterruptedException e1) {
}

		return this;
	}
	
	public Request_Page verifyDatelineRequest_Status(String ReferenceNumStatus) throws InterruptedException{
		locateFrame("icanvas");
		
	//verifyTextlistcontainXpath(prop.getProperty("Filter.DepositReferno.xpath"),getrefnumer);
	if(ReferenceNumStatus.equalsIgnoreCase("Accepted")){
	verifyTextcontainslistByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"),ReferenceNumStatus);
//	verifyTextcontainslistByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"),ReferenceNumStatus);
	
		int a=getSizeByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"));
	
		verifyTextsizecontainslistByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"),a);

	
	}
	defaultcontent();
	return new Request_Page(driver, test);

	}

public Account_DateLine authorize(String otp) throws InterruptedException{
	locateFrame("icanvas");
	authorizeRequest(otp);
	defaultcontent();
	return this;
}	


}
