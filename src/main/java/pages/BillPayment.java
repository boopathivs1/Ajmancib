package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class BillPayment extends ProjectWrapp{
	public BillPayment (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	public BillPayment clickAddManageBills(){
		defaultcontent();
		clickByXpathExplict(".//p[text()='Add & Manage Bills']");
		return this;
	}
	
	
	public BillPayment addMangebillsFilter(String corpvalue,String category,String billcomp) throws InterruptedException{
		
		locateFrame("icanvas");
pageloading();
		dropdownSelection(prop.getProperty("select.corpaddbill.xpath"),corpvalue);
		dropdownSelection(prop.getProperty("select.categorychoose.xpath"),category);
		dropdownSelection(prop.getProperty("select.billercomp.xpath"),billcomp);

		clickByXpathExplict(prop.getProperty("click.billpay.filter.xpath"));
			

	

	return this;
}

	public OtP_Page editManageBills(String nickname,String updatenickname) throws InterruptedException{
		for(int i=1;i<100;i++){
boolean a=VerifyElementpresentreturn("(.//p[text()='"+nickname+"']//following::span)[2]");
	if(a){
		Thread.sleep(6000);
		
		clickByXpathExplict("(.//p[text()='"+nickname+"']//following::span)[2]");
		
		Thread.sleep(6000);
		clickByXpathExplict("(.//p[text()='"+nickname+"']//following::span)[text()='Edit']");
Thread.sleep(4000);
enterByXpathExplict(prop.getProperty("edit.addbiller.nickname.xpath"),updatenickname);	
clickByXpathExplict(".//label[text()='Nick Name']");
pageScroll400();
		Thread.sleep(4000);
	//verifyTextByXpathExplicitwait(".//table[contains(@class,'cust_table')]//tr//td[1]","testingbeneficiary");
		//clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));
		clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));

		break;
	

	
}
else {
	int c=i+1;
	reportStep("trying to find account number in another page number", "INFO");
	clickByXpathExplict(".//ul[@class='pagination']//a[text()='"+c+"']");
	Thread.sleep(4000);
}
		}
	
	return new OtP_Page(driver, test);
}


	
	public OtP_Page deleteManageBills(String nickname) throws InterruptedException{
		for(int i=1;i<100;i++){
			boolean a=VerifyElementpresentreturn("(.//p[text()='"+nickname+"']//following::span)[2]");
			if(a){
				Thread.sleep(6000);
				
				clickByXpathExplict("(.//p[text()='"+nickname+"']//following::span)[2]");
Thread.sleep(1000);
		clickByXpathExplict("(.//p[text()='"+nickname+"']//following::span)[text()='Delete']");
		pageScroll400();
		Thread.sleep(2000);
	//verifyTextByXpathExplicitwait(".//table[contains(@class,'cust_table')]//tr//td[1]","testingbeneficiary");

//		clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));


		
		break;
}
else {
	int c=i+1;
	reportStep("trying to find account number in another page number", "INFO");
	clickByXpathExplict(".//ul[@class='pagination']//a[text()='"+c+"']");
	Thread.sleep(1000);
}
		}
	
	return new OtP_Page(driver, test);
}

	
	

	public BillPayment clickAddpay(){
		locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("click.addbill.billpay.xpath"));
		
		
		return this;
	}
	public OtP_Page fillAddBiller(String corpbill,String category,String billcomp,String billacnum,String nickname,String servicetype) throws InterruptedException{
		
		String billnumbers=regvalue(billacnum);
		dropdownSelection(prop.getProperty("select.corpaddbill.xpath"),corpbill);
//		Thread.sleep(4000);
		dropdownSelection(prop.getProperty("select.categorychoose.xpath"),category);
	//	Thread.sleep(4000);
		
		
		dropdownSelection(prop.getProperty("select.billercomp.xpath"),billcomp);
		//Thread.sleep(4000);
				
		dropdownSelection(".//div[@id='selectInput0_chosen']",servicetype);
		
		String billnum=regvalue(billnumbers);
		enterByXpathExplict(prop.getProperty("enter.biller.acc.xpath"),billnum);
		enterByXpathExplict(prop.getProperty("enter.biller.nickname.xpath"),nickname);
		
		
		scrolltoelementJs(prop.getProperty("click.submitotp.button.xpath"));
	
		clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));
		clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));
		
//		Boolean a=VerifyElementpresentreturn(prop.getProperty("addbiller.server.error.xpath"));
	//	booleanResult(a, "Add biller server Error has been occuring");	
		
		
		return new OtP_Page(driver, test);
	}


public OtP_Page fillAddBills(String corpbill,String category,String billcomp,String plan,String billacnum,String nickname) throws InterruptedException{
		
		dropdownSelection(prop.getProperty("select.corpaddbill.xpath"),corpbill);
//		Thread.sleep(4000);
		dropdownSelection(prop.getProperty("select.categorychoose.xpath"),category);
	//	Thread.sleep(4000);
		
		
		dropdownSelection(prop.getProperty("select.billercomp.xpath"),billcomp);
		
		clickByXpathExplict(prop.getProperty("click.billsubmit.xpath"));
		return new OtP_Page(driver, test);
		
		
		//Thread.sleep(4000);
		
//		if(plan.equalsIgnoreCase("Postpaid")){
//		dropdownSelection(prop.getProperty("select.billerpan.xpath"),plan);
//		}
//		else if(plan.equalsIgnoreCase("Prepaid")){
//			dropdownSelection(prop.getProperty("select.billerpan.xpath"),plan);
//			
		}

	
	
	
	
	
	
}
