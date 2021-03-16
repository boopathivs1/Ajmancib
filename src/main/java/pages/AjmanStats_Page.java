package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class AjmanStats_Page extends ProjectWrapp{
	public  AjmanStats_Page(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	
	public AjmanStats_Page selectAccount(String accno) throws InterruptedException{
		locateFrame("icanvas");
		dropdownSelection(prop.getProperty("click.statatement.accno.xpath"),accno);
		
//		011048408016
		
		
		
		return this;
	}
	public AjmanStats_Page clickLastThree(){

clickByXpathExplict(prop.getProperty("click.lastthreemonth.xpath"));

VerifyElementPresent(prop.getProperty("verify.lastthree.month.xpath"), "Last Three Month Staement has been dispalying","Last Three Month Staement has not been dispalying");
		return this;
	}
	
	
	public AjmanStats_Page verifyMoreTab(String fromDate,String toDate){

clickByXpathExplict(prop.getProperty("click.more.tab.xpath"));
enterByXpathExplict(prop.getProperty("enter.fromdate.xpath"),fromDate);
enterByXpathExplict(prop.getProperty("enter.todate.xpath"),toDate);
clickByXpathExplict(prop.getProperty("click.more.button.filter.xpath"));
VerifyElementPresent(prop.getProperty("verify.lastthree.month.xpath"), " Staement has been dispalying","Staement has not been dispalying");
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
}
