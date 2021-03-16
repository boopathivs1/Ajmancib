package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Checkbook_Request_Page extends ProjectWrapp{
	public  Checkbook_Request_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	
	public Checkbook_Request_Page fillcheckbook_RequestForm(String companyName,String Accno,String checkbookno,String checkbookType,String Branchname) throws InterruptedException{	
		locateFrame("icanvas");	
		dropdownSelection(prop.getProperty("selectCompany.balance.xpath"),companyName);
		dropdownSelection(prop.getProperty("select.accnum.balance.xpath"),Accno);
		dropdownSelection(prop.getProperty("click.No.of.Checkbook.dropdown.xpath"),checkbookno);
		clickByXpathExplict(prop.getProperty("click.no.of.leaves.xpath"));
		pageScroll();
		dropdownSelection(prop.getProperty("click.Typeof.checkbook.dropdown.xpath"),checkbookType);
	
		clickByXpathExplict(prop.getProperty("click.check.delivey.xpath"));
		pageScroll();
		dropdownSelection(prop.getProperty("click.branchname.xpath"),Branchname);
		return this;
	}
	
	public SuccessPage requestSubmit() throws InterruptedException{	

		clickByXpathExplict(prop.getProperty("click.servicereq.submit.xpath"));
		clickByXpathExplict(prop.getProperty("click.servicereq.confirm.xpath"));
	return new SuccessPage(driver, test);
	}

	
	
	
	}
