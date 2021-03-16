package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class BalanceRequestForm extends ProjectWrapp{
	public  BalanceRequestForm(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	
public BalanceRequestForm fillBalance_RequestForm(String companyName,String Accno) throws InterruptedException{	
	locateFrame("icanvas");	
	dropdownSelection(prop.getProperty("selectCompany.balance.xpath"),companyName);
	dropdownSelection(prop.getProperty("select.accnum.balance.xpath"),Accno);
	clickByXpathExplict(prop.getProperty("click.balance.date.button.xpath"));
	clickByXpathExplict(prop.getProperty("click.balance.today.date.xpath"));
	clickByXpathExplict(prop.getProperty("click.delivery.mode.xpath"));

	return this;
}


public SuccessPage requestSubmit() throws InterruptedException{	

	clickByXpathExplict(prop.getProperty("click.servicereq.submit.xpath"));
	clickByXpathExplict(prop.getProperty("click.servicereq.confirm.xpath"));
return new SuccessPage(driver, test);
}




}
