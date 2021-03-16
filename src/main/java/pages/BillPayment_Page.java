package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class BillPayment_Page  extends ProjectWrapp{
	public  BillPayment_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public PaymentReport_Page clickPayment_Report_link() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.payment.reports.link.xpath"));
		
		return new PaymentReport_Page(driver, test);
		
	}
	
	public BillPayment_Page clickBillPaymentInquiry_link() throws InterruptedException{
		Thread.sleep(4000);
		
	clickByXpathExplict(prop.getProperty("click.billpayment.inquiey.xpath"));
		
		return this;
		
	}
	
	
public BillPayment_Page SelectBill(String corp,String accno) throws InterruptedException{
		
		locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("select.singlebill.xpath"));
		clickByXpathExplict(prop.getProperty("click.billpayment.paybill.xpath"));
		dropdownSelection(prop.getProperty("billpayment.corp.dropdown"), corp);
		dropdownSelection(prop.getProperty("billpayment.account.dropdown"), accno);
		clickByXpathExplict(prop.getProperty("billpayment.submit.xpath"));
		clickByXpath(prop.getProperty("click.confirm.button.xpath"));
			return this;
			
		}
	


public PaymentReport_Page verifyBillpaysucess(){	
	//verifyTextContainsByXpath(prop.getProperty("verify.submit.sucess.xpath"),"uccessfully");
	getrefnumer=getTextByXpath(prop.getProperty("billpayment.getref.xpath"));
	defaultcontent();
return new PaymentReport_Page(driver, test);	
	}

public BillPayment_Page SelectMultipleBill(String corp,String accno) throws InterruptedException{
		
	locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("select.singlebill.xpath"));
		clickByXpathExplict(prop.getProperty("select.multiplebill.xpath"));
		clickByXpathExplict(prop.getProperty("click.billpayment.paybill.xpath"));
		pageScroll();
		//clickByXpathExplict("//div[@id='corporate_chosen']");
		//clickByXpathExplict("//li[contains(@class,'active-result')][contains(text(),'"+corp+"')]");
		dropdownSelection(prop.getProperty("billpayment.corp.dropdown"),corp);
		dropdownSelection(prop.getProperty("billpayment.account.dropdown"),accno);
		clickByXpathExplict(prop.getProperty("billpayment.submit.xpath"));
		clickByXpath(prop.getProperty("click.confirm.button.xpath"));
			return this;
			
		}
	
	
	public BillPayment_Page clickOneTimepay_link() throws InterruptedException{
		Thread.sleep(4000);
		
	clickByXpathExplict(prop.getProperty("click.onetimepayment.xpath"));
		
		return this;
		
	}
	
	
	
	public BillPayment_Page FillOneTimepayForm(String corp,String accno,String category,String Biller,String serviceType,String consno,String Remarks) throws InterruptedException{
		Thread.sleep(3000);
		
		locateFrame("icanvas");

		dropdownSelection(prop.getProperty("select.onetime.corporate.xpath"), corp);
		
		dropdownSelection(prop.getProperty("select.onetime.account.xpath"), accno);
		Thread.sleep(2000);
		dropdownSelection(prop.getProperty("select.onetime.category.xpath"),category);
		pageScroll();
		dropdownSelection(prop.getProperty("select.onetime.biller.xpath"),Biller);
		dropdownSelection(prop.getProperty("select.onetime.serviceType.xpath"),serviceType);
		enterByXpathExplict(prop.getProperty("enter.onetime.consno.xpath"),consno);
		pageScroll();
		enterByXpathExplict(prop.getProperty("enter.onetime.remark.xpath"),Remarks);
		
		clickByXpathExplict(prop.getProperty("click.onetime.paynow.xpath"));
		
		clickByXpath(prop.getProperty("click.confirm.button.xpath"));

		return this;
			}
	

	public PaymentReport_Page verifysucessmsg(){	
		verifyTextContainsByXpath(prop.getProperty("verify.submit.sucess.xpath"),"uccessfully");
		getrefnumer=getTextByXpath(prop.getProperty("getrefnumber.xpath"));
		
		defaultcontent();
	return new PaymentReport_Page(driver, test);	
		}
}
