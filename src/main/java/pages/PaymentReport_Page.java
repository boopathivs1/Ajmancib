package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class PaymentReport_Page  extends ProjectWrapp{
	public  PaymentReport_Page(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		

	}
	
	
	public PaymentReport_Page clickPayment_Report_link() throws InterruptedException{

	
		Thread.sleep(3000);

	defaultcontent();

		clickByXpathExplict(prop.getProperty("click.payment.reports.link.xpath"));
		
		return this;
		
	}
	
public PaymentReport_Page verifyPaymentStatus(String fromdate,String todate,String status1,String status2) throws InterruptedException{
	locateFrame("icanvas");
enterByXpathExplict(prop.getProperty("enter.fromdate.paymentreport.xpath"),fromdate);
enterByXpathExplict(prop.getProperty("enter.todate.paymentreport.xpath"),todate);
clickByXpathExplict(prop.getProperty("click.payment.report.more.xpath"));
dropdownSelection(prop.getProperty("click.paystatus.xpath"),status1);
clickByXpathExplict(prop.getProperty("click.payment.button.filter.xpath"));
scrolltoelementJs(prop.getProperty("verify.pending.status.record.xpath"));
VerifyElementPresent(prop.getProperty("verify.pending.status.record.xpath"), "Pending authorization record has been displaying","Pending authorization record has not been displaying");


clickByXpathExplict(prop.getProperty("click.payment.report.more.xpath"));


dropdownSelection(prop.getProperty("click.paystatus.xpath"),status2);
clickByXpathExplict(prop.getProperty("click.payment.button.filter.xpath"));

scrolltoelementJs(prop.getProperty("verify.sucess.status.record.xpath"));
VerifyElementPresent(prop.getProperty("verify.sucess.status.record.xpath"), "Success record has been displaying","Pending authorization record has not been displaying");

	defaultcontent();
	return this;
}


public Ajman_Dashboard OwnPaymentStatusCheck(String RequestType,String RequestStatusValue,String status,String day) throws InterruptedException{
	locateFrame("icanvas");
	clickByXpathExplict(prop.getProperty("click.calendar.iconone.xpath"));
	Thread.sleep(3000);
	clickByXpathExplict(prop.getProperty("click.todaycalo.xpath"));
	Thread.sleep(3000);
	
	clickByXpathExplict(prop.getProperty("click.secclandar.icon.xpath"));
	
	if(day=="Today")
	{
//clickByXpathExplict(prop.getProperty("click.day.ownacc.payreport.xpath"));
		clickByXpathExplict(prop.getProperty("click.today.payreport.xpath"));


	}
			else if (day=="Tomorrow") {
		Thread.sleep(3000);

		//clickByXpathExplict(prop.getProperty("click.day.ownacc.payreport.xpath"));
		
		clickByXpathExplict(prop.getProperty("click.paymentreport.twentyear.xpath"));
		clickByXpathExplict(prop.getProperty("select.calendar.month.xpath"));
		clickByXpathExplict(prop.getProperty("select.calendar.days.xpath"));

	
		
		//clickByXpathExplict(prop.getProperty("click.day.ownacc.payreport.xpath"));

	//	Thread.sleep(3000);
//			clickByXpathExplict(prop.getProperty("select.calendar.month.xpath"));
Thread.sleep(3000);
//clickByXpathExplict(prop.getProperty("select.calendar.to.days.xpath"));
				}
	clickByXpathExplict(prop.getProperty("paymentreport.morebutton.xpath"));
//	Thread.sleep(6000);
	dropdownSelection(".//div[@id='transBusinessFun_chosen']",RequestType);
//Thread.sleep(6000);
dropdownSelection(".//div[@id='status_chosen']",RequestStatusValue);
	
//	Thread.sleep(6000);
	clickByXpathExplict(prop.getProperty("click.filter.button.req.xpath"));
//getrefnumer="OWN19672";
	
//Thread.sleep(8000);
pageScroll400();
//enable
//Thread.sleep(6000);


//enable below case if working

verifyTextlistcontainXpath(".//table[@id='data']//tr//td[8]",getrefnumer);
Thread.sleep(2000);
scrolltoelementJs(".//table[@id='data']//tr//td[contains(text(),'"+RequestStatusValue+"')]");
//Thread.sleep(6000);
verifyTextMatchlistByXpath(".//table[@id='data']//tr//td[contains(text(),'"+RequestStatusValue+"')]",status);

defaultcontent();
	return new Ajman_Dashboard(driver, test);
		}



}

