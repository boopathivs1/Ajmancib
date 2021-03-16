package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Loan_Page extends ProjectWrapp{
	public  Loan_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	//click.loan.statements.link.xpath	
	public Loan_Page selectAccount(String accno) throws InterruptedException{
		locateFrame("icanvas");
		dropdownSelection(prop.getProperty("click.statatement.accno.xpath"),accno);
		
		return this;
	}
	public Loan_Detail_page clickloan_details_link() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.loan.details.link.xpath"));
		//locateFrame("icanvas");
		return new Loan_Detail_page(driver, test);
		}
	
	
	
	public Loan_Page clickloan_Statement_link() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.loan.statements.link.xpath"));
		//locateFrame("icanvas");
		return new Loan_Page (driver, test);
		}
	
	
	public Loan_Repayment_page clickloan_Repay_link() throws InterruptedException{
	
		clickByXpathExplict(prop.getProperty("click.loan.repaylink.xpath"));
	
	return new Loan_Repayment_page(driver, test);

	}

	
	
	
	public Loan_Page VerifyLoan_Summary() throws InterruptedException{
		locateFrame("icanvas");	
		VerifyElementPresent(prop.getProperty("Click.accountbalance.xpath"),"Loan Summary has been displaying","Loan Summary has not been displaying");
	return new Loan_Page(driver, test);
		
	}
	
	}
