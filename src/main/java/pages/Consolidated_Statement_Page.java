package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Consolidated_Statement_Page extends ProjectWrapp{
	public  Consolidated_Statement_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	public Consolidated_Statement_Page VerifyConsolidated_Statement(String Company,String stataccno,String Month) throws InterruptedException{
		locateFrame("icanvas");	
		clickByXpathExplict(prop.getProperty("click.company.dropdown.xpath"));
		Thread.sleep(3000);
		clickByXpathExplict(".//li[contains(@class,'active-result')][contains(text(),'"+Company+"')]");
		clickByXpathExplict(prop.getProperty("click.consolidated.fromacc.dropdown.xpath"));
		Thread.sleep(3000);
		clickByXpathExplict(".//li[contains(@class,'active-result')][contains(text(),'"+stataccno+"')]");
		
		clickByXpathExplict(prop.getProperty("click.month.dropdown.xpath"));
		Thread.sleep(3000);
		clickByXpathExplict(".//li[contains(@class,'active-result')][contains(text(),'"+Month+"')]");
		clickByXpathExplict(prop.getProperty("click.comsolidated.stat.submit.xpath"));
		
		//VerifyElementPresent(prop.getProperty("Click.accountbalance.xpath"),"Account Summary has been displaying","Account Summary has not been displaying");
	return this;
		
	}
	
	
	
	
	}
