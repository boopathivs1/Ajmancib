package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Vendor_Payments extends ProjectWrapp{
	public  Vendor_Payments(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
			this.test = test;
		//	if(!verifyTitle("Corporate Customer Banking  ")){
			//	reportStep("This is not Corporate Customer Banking", "FAIL");
		//	}
		}
	public BeneficiaryMaintainance clickvendorMaintain() throws InterruptedException{
		locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("click.vendor.maintenace.xpath"));
//		clickByXpathExplict(".//p[contains(text(),'Own Accounts')]");
return new BeneficiaryMaintainance(driver, test);
	}
	
	public BeneficiaryMaintainance clickBeneficiaryMenu() throws InterruptedException{
		Thread.sleep(6000);
				locateFrame("icanvas");

				clickByXpathExplict(prop.getProperty("click.Beneficiary.Maintainance.menu.xath"));
		return new BeneficiaryMaintainance(driver, test);
			}
	
	
	
	public OtP_Page within_Transerpage(String paydate,String payday,String fromcomp,String tobene,String fromBeneAccNo,String nickname,String currency,String amount,String purpose,String frequency,String timesofpay) throws InterruptedException{
		locateFrame("icanvas");

//		"Today","Pay Now",fromcomp,sourceAccno,Tocomp,toAccno,currency,amount);
		
		
												
dropdownSelection(prop.getProperty("Click.fromcompany.choose.xpath"),fromcomp);
//Thread.sleep(3000);

//Thread.sleep(10000);
dropdownSelection(prop.getProperty("within.tobene.xpath"),tobene);
dropdownSelection(prop.getProperty("within.frombene.account.xpath"),fromBeneAccNo);


//dropdownSelection(prop.getProperty("within.nickname.intstruction.xpath"),tobene);

scrolltoelementJs(prop.getProperty("within.nickname.intstruction.xpath"));

dropdownSelectionindex(prop.getProperty("within.nickname.intstruction.xpath"),tobene, 2);


//dropdownSelectionindex(prop.getProperty("within.tobene.xpath"),tobene,2);

pageScroll();


//dropdownSelectionindex(".//div[@id='toCorp_chosen']",toAccno,17);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='toAccount_chosen']",toAccno);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='amountCurrencyId_chosen']",currency);
//dropdownSelectionindex(prop.getProperty("owntransfer.currencytype.xpath"),currency,14);
//(.//li[contains(@class,'active-result')][contains(text(),'SAR')])[16]

//enable below foe currency selection
//clickByXpathExplict(prop.getProperty("owntransfer.currencytype.xpath"));
//clickByXpathExplict(prop.getProperty("click.currency.drpdown.ownacc.xpath"));

//Thread.sleep(6000);
enterByXpathExplict(prop.getProperty("owntransfer.currencyamount.xpath"), amount);

//Thread.sleep(10000);

clickByXpathExplict(prop.getProperty("click.calendaricon.xpath"));

//Thread.sleep(8000);

if(paydate.equalsIgnoreCase("Today")){
	//	Thread.sleep(6000);
		
		clickByXpathExplict(prop.getProperty("clicktoday.reports.button.xpath"));

		
		

//enterByXpathExplict(".//input[@id='remarks']","ownaccount paynow remarks");
	
//	clickByXpathExplict(prop.getProperty("today.calendary.buttonone.xpath"));

//	clickByXpathExplict(".//button[text()='Today']");
}else if (paydate.equalsIgnoreCase("Tomorrow")) {
//	Thread.sleep(10000);


		clickByXpathExplict(prop.getProperty("select.twentyyear.xpath"));
	//		Thread.sleep(8000);

	clickByXpathExplict(prop.getProperty("select.calendar.month.xpath"));
	
//	Thread.sleep(3000);

	clickByXpathExplict(prop.getProperty("select.calendar.days.xpath"));
	}

dropdownSelection(prop.getProperty("click.purpose.dropdown.xpath"),"Allowance");


if(payday.equalsIgnoreCase("Pay Now")){
		
clickByXpathExplict(prop.getProperty("click.paynow.button.xpath"));

}else if (payday.equalsIgnoreCase("Pay Later")) {
	clickByXpathExplict(prop.getProperty("click.paylater.xpath"));
}
if(payday.equalsIgnoreCase("Repeat")){
	
	
	clickByXpathExplict(prop.getProperty("click.repeat.button.xpath"));
	Thread.sleep(3000);
	scrolltoelementJs(prop.getProperty("enter.timespay.xpath"));
	
	dropdownSelectionindex(prop.getProperty("click.frequency.button.xpath"),frequency,2);
//selectVisibileTextByXPath(".//select[@id='frequencyId']","Daily");
	Thread.sleep(3000);
	enterByXpathExplict(prop.getProperty("enter.timespay.xpath"),timesofpay);
clickByXpathExplict(prop.getProperty("click.repeatsubmit.button.xpath"));


}



return new OtP_Page(driver, test);



}
	
	
	public OtP_Page Other_Transerpage(String paydate,String payday,String fromcomp,String tobene,String fromBeneAccNo,String nickname,String currency,String amount,String purpose,String frequency,String timesofpay) throws InterruptedException{
		locateFrame("icanvas");

//		"Today","Pay Now",fromcomp,sourceAccno,Tocomp,toAccno,currency,amount);
		
		
												
dropdownSelection(prop.getProperty("Click.fromcompany.choose.xpath"),fromcomp);
//Thread.sleep(3000);

//Thread.sleep(10000);
dropdownSelection(prop.getProperty("within.tobene.xpath"),tobene);
Thread.sleep(2000);
dropdownSelection(prop.getProperty("within.frombene.account.xpath"),fromBeneAccNo);

pageScroll();

dropdownSelectionindex(prop.getProperty("within.nickname.intstruction.xpath"),nickname,2);




//dropdownSelectionindex(prop.getProperty("within.tobene.xpath"),tobene,2);




//dropdownSelectionindex(".//div[@id='toCorp_chosen']",toAccno,17);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='toAccount_chosen']",toAccno);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='amountCurrencyId_chosen']",currency);
//dropdownSelectionindex(prop.getProperty("owntransfer.currencytype.xpath"),currency,14);
//(.//li[contains(@class,'active-result')][contains(text(),'SAR')])[16]

//enable below foe currency selection
//clickByXpathExplict(prop.getProperty("owntransfer.currencytype.xpath"));
//clickByXpathExplict(prop.getProperty("click.currency.drpdown.ownacc.xpath"));

//Thread.sleep(6000);
enterByXpathExplict(prop.getProperty("owntransfer.currencyamount.xpath"), amount);

//Thread.sleep(10000);

clickByXpathExplict(prop.getProperty("click.calendaricon.xpath"));

//Thread.sleep(8000);

if(paydate.equalsIgnoreCase("Today")){
	//	Thread.sleep(6000);
		Thread.sleep(2000);
		clickByXpathExplict(prop.getProperty("clicktoday.reports.button.xpath"));

		
		

//enterByXpathExplict(".//input[@id='remarks']","ownaccount paynow remarks");
	
//	clickByXpathExplict(prop.getProperty("today.calendary.buttonone.xpath"));

//	clickByXpathExplict(".//button[text()='Today']");
}else if (paydate.equalsIgnoreCase("Tomorrow")) {
//	Thread.sleep(10000);


		clickByXpathExplict(prop.getProperty("select.twentyyear.xpath"));
	//		Thread.sleep(8000);

	clickByXpathExplict(prop.getProperty("select.calendar.month.xpath"));
	
//	Thread.sleep(3000);

	clickByXpathExplict(prop.getProperty("select.calendar.days.xpath"));
	}

dropdownSelection(prop.getProperty("click.purpose.dropdown.xpath"),purpose);


if(payday.equalsIgnoreCase("Pay Now")){
		
clickByXpathExplict(prop.getProperty("click.paynow.button.xpath"));

}else if (payday.equalsIgnoreCase("Pay Later")) {
	clickByXpathExplict(prop.getProperty("click.paylater.xpath"));
}
if(payday.equalsIgnoreCase("Repeat")){
	
	
	clickByXpathExplict(prop.getProperty("click.repeat.button.xpath"));
	Thread.sleep(3000);
	dropdownSelection(prop.getProperty("click.frequency.button.xpath"),frequency);
//selectVisibileTextByXPath(".//select[@id='frequencyId']","Daily");
	Thread.sleep(3000);
	enterByXpathExplict(prop.getProperty("enter.timespay.xpath"),timesofpay);
clickByXpathExplict(prop.getProperty("click.repeatsubmit.button.xpath"));


}



return new OtP_Page(driver, test);



}
	

	public OtP_Page Overseas_Transerpage(String paydate,String payday,String fromcomp,String tobene,String fromBeneAccNo,String nickname,String currency,String amount,String purpose,String frequency,String timesofpay) throws InterruptedException{
		locateFrame("icanvas");

//		"Today","Pay Now",fromcomp,sourceAccno,Tocomp,toAccno,currency,amount);
		
		
												
dropdownSelection(prop.getProperty("Click.fromcompany.choose.xpath"),fromcomp);
//Thread.sleep(3000);

//Thread.sleep(10000);
dropdownSelection(prop.getProperty("within.tobene.xpath"),tobene);
dropdownSelection(prop.getProperty("within.frombene.account.xpath"),fromBeneAccNo);

pageScroll();

dropdownSelection(prop.getProperty("within.nickname.intstruction.xpath"),nickname);




//dropdownSelectionindex(prop.getProperty("within.tobene.xpath"),tobene,2);




//dropdownSelectionindex(".//div[@id='toCorp_chosen']",toAccno,17);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='toAccount_chosen']",toAccno);

//Thread.sleep(10000);
//dropdownSelection(".//div[@id='amountCurrencyId_chosen']",currency);
//dropdownSelectionindex(prop.getProperty("owntransfer.currencytype.xpath"),currency,14);
//(.//li[contains(@class,'active-result')][contains(text(),'SAR')])[16]

//enable below foe currency selection
//clickByXpathExplict(prop.getProperty("owntransfer.currencytype.xpath"));
//clickByXpathExplict(prop.getProperty("click.currency.drpdown.ownacc.xpath"));

//Thread.sleep(6000);
enterByXpathExplict(prop.getProperty("owntransfer.currencyamount.xpath"), amount);

//Thread.sleep(10000);

clickByXpathExplict(prop.getProperty("click.calendaricon.xpath"));

//Thread.sleep(8000);

if(paydate.equalsIgnoreCase("Today")){
	//	Thread.sleep(6000);
		
		clickByXpathExplict(prop.getProperty("clicktoday.reports.button.xpath"));

		
		

//enterByXpathExplict(".//input[@id='remarks']","ownaccount paynow remarks");
	
//	clickByXpathExplict(prop.getProperty("today.calendary.buttonone.xpath"));

//	clickByXpathExplict(".//button[text()='Today']");
}else if (paydate.equalsIgnoreCase("Tomorrow")) {
//	Thread.sleep(10000);

		clickByXpathExplict(prop.getProperty("select.twentyyear.xpath"));
	//		Thread.sleep(8000);

	clickByXpathExplict(prop.getProperty("select.calendar.month.xpath"));
	
//	Thread.sleep(3000);

	clickByXpathExplict(prop.getProperty("select.calendar.days.xpath"));
	}

dropdownSelection(prop.getProperty("click.purpose.dropdown.xpath"),"Allowance");


if(payday.equalsIgnoreCase("Pay Now")){
		
clickByXpathExplict(prop.getProperty("click.paynow.button.xpath"));

}else if (payday.equalsIgnoreCase("Pay Later")) {
	clickByXpathExplict(prop.getProperty("click.paylater.xpath"));
}
if(payday.equalsIgnoreCase("Repeat")){
	
	
	clickByXpathExplict(prop.getProperty("click.repeat.button.xpath"));
	Thread.sleep(3000);
	dropdownSelection(prop.getProperty("click.frequency.button.xpath"),frequency);
//selectVisibileTextByXPath(".//select[@id='frequencyId']","Daily");
	Thread.sleep(3000);
	enterByXpathExplict(prop.getProperty("enter.timespay.xpath"),timesofpay);
clickByXpathExplict(prop.getProperty("click.repeatsubmit.button.xpath"));


}



return new OtP_Page(driver, test);



}

	
	
	
	
	
	
}
