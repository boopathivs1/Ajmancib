package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class BillPay_Dateline extends ProjectWrapp{
	public  BillPay_Dateline (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public BillPay_Dateline authorization() throws InterruptedException{
		authorizeRequest();
			
//			authorizefromDatelineRequest();
			defaultcontent();
			Thread.sleep(4000);
			return this;
		}
	
	public BillPay_Dateline datelinefilter(String filtertype,String filtervalue,String filterstatustype,String FilterStatusvalue,String refno,String status) throws InterruptedException{
		Thread.sleep(8000);
		locateFrame("icanvas");

	FilterSelectVerification(filtertype,filtervalue,filterstatustype,FilterStatusvalue, refno,status);
return this;
	}
public BillPayment navigatebillpay(){
	
	return new BillPayment(driver, test);
}

}
