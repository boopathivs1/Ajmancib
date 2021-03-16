package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Loan_Detail_page extends ProjectWrapp{
	public  Loan_Detail_page(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	public Loan_Detail_page verifyLoan_Details_Page() throws InterruptedException{
	VerifyElementPresent(prop.getProperty("verify.loadndetails.summary.xpath"), "Loan details has been displaying","Loan details has not been displaying");	
		return this;
		
	}


	public Loan_Detail_page selectAccount(String accno) throws InterruptedException{
		locateFrame("icanvas");
		dropdownSelection(prop.getProperty("click.statatement.accno.xpath"),accno);
		
//		011048408016
		
		
		
		return this;
	}

	
	
	
	

}