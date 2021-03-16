package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Loan_Repayment_page extends ProjectWrapp{
	public  Loan_Repayment_page(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	
	public Loan_Repayment_page selectAccount(String accno) throws InterruptedException{
		locateFrame("icanvas");
		dropdownSelection(prop.getProperty("click.statatement.accno.xpath"),accno);
		
//		011048408016
		
		
		
		return new Loan_Repayment_page(driver, test);
	}
	
	public Loan_Repayment_page filterLoanRepayment() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.loan.repaylink.xpath"));
	
	return new Loan_Repayment_page(driver, test);

	}
	
	
	public Loan_Repayment_page verifyloanrepayLinks() throws InterruptedException{
		
		//enter.loan.repay.fromdate.xpath=(.//input[contains(@class,'ws-date')])[1]
			//	enter.loan.repay.todate.xpath=(.//input[contains(@class,'ws-date')])[2]
				//click.repayloan.download.link.xpath=.//button[@id='btnDownload']
	VerifyElementPresent(prop.getProperty("verify.repayschedule.xpath"), "Repay Shedule has displaying records", "Repay Shedule has not displaying records");
	
	
	return new Loan_Repayment_page(driver, test);

	}

	
	

	
	
	
	
	
	
//			enter.loan.repay.fromdate.xpath=(.//input[contains(@class,'ws-date')])[1]
//			enter.loan.repay.todate.xpath=(.//input[contains(@class,'ws-date')])[2]
//			click.repayloan.download.link.xpath=.//button[@id='btnDownload']


	
	
	
	

}