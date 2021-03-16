package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Account_Page extends ProjectWrapp{
	public  Account_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public AjmanStats_Page clickStatementMenuLink() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.stats.menu.xpath"));
		//locateFrame("icanvas");
		return new AjmanStats_Page(driver, test);
		
	}

	public Account_DateLine clickDateline() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.ajman.dateline.link.xpath"));
		//locateFrame("icanvas");
		return new Account_DateLine(driver, test);
		
	}	
	public Account_Page VerifyAccount_Summary() throws InterruptedException{
		locateFrame("icanvas");	
		VerifyElementPresent(prop.getProperty("Click.accountbalance.xpath"),"Account Summary has been displaying","Account Summary has not been displaying");
	return new Account_Page(driver, test);
		
	}
	public Request_Page clickRequestPage() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("clickRequestMenu.xpath"));

		return new Request_Page(driver, test);
		
	}
	
	public Statement_Page clickStatementMenu() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("Click.Menu.Statement.xpath"));
	
		
		return new Statement_Page(driver, test);
	}	

public Detail_Page clickDetailMenu(){

	clickByXpathExplict(prop.getProperty("Click.Menu.Details.xpath"));
	return new Detail_Page(driver, test);
}	



public Consolidated_Statement_Page ClickConsolidatedstatMenu()
{
	clickByXpathExplict(prop.getProperty("click.consolidatedMenu.xpath"));
	return new Consolidated_Statement_Page(driver, test);
}


	
}

	
	
	
	
	
