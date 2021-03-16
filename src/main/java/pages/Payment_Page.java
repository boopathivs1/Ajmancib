package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Payment_Page  extends ProjectWrapp{
	public  Payment_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public PaymentReport_Page clickPayment_Report_link() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.payment.reports.link.xpath"));
		//locateFrame("icanvas");
		return new PaymentReport_Page(driver, test);
		
	}
	
	public Paymentdateline navigatepaymentDateline() throws InterruptedException{
		return new Paymentdateline(driver, test);
			}
	
	
	public SI_Page clickOwnAccounttransfer() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.ownacc.menu.xpath"));
//		clickByXpathExplict(".//p[contains(text(),'Own Accounts')]");
return new SI_Page(driver, test);
	}
	
	
	
	public OwnAccount clickOwnAccount() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.ownacc.menu.xpath"));
//		clickByXpathExplict(".//p[contains(text(),'Own Accounts')]");
return new OwnAccount(driver, test);
	}
	public Vendor_Payments clickvendor() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.vendor.transfer.link.xpath"));
//		clickByXpathExplict(".//p[contains(text(),'Own Accounts')]");
return new Vendor_Payments(driver, test);
	}
		
	
	
	
}
