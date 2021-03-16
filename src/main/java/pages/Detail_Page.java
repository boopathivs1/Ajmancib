package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Detail_Page extends ProjectWrapp{
	public  Detail_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	

	
	public Detail_Page verifyDetailPage(String detailAccno) throws InterruptedException{
		locateFrame("icanvas");	
		clickByXpathExplict(prop.getProperty("Click.Statement.Account.dropdown.xpath"));
		Thread.sleep(3000);
		clickByXpathExplict(".//li[contains(@class,'active-result')][contains(text(),'"+detailAccno+"')]");		
VerifyElementPresent(prop.getProperty("detail.content.verify.xpath"),"Details page has been displaying" ,"Details Page has not been displaying");

//Thread.sleep(20000);

defaultcontent();		
return this;
	}	
	
	
	
	

	
	
	
	}
