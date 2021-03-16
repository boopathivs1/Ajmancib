package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class SI_Page  extends ProjectWrapp{
	public  SI_Page(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		

	}
	
	

	public SI_Page VerifySI(String fromcomp,String sourceaccno,String tocomp,String toAccno) throws InterruptedException{
		locateFrame("icanvas");

												
dropdownSelection(prop.getProperty("owntransfer.fromcorp.xpath"),fromcomp);

dropdownSelection(prop.getProperty("owntransfer.fromaccount.xpath"),sourceaccno);
dropdownSelectionindex(prop.getProperty("owntransfer.tocorpchoosen.xpath"),tocomp,2);

pageScroll();
dropdownSelectionindex(prop.getProperty("owntransfer.tocorpaccount.xpath"),toAccno,2);
clickByXpathExplict(prop.getProperty("click.history.xpath"));
clickByXpathExplict(prop.getProperty("click.scheduled.xpath"));
VerifyElementPresent(prop.getProperty("verify.scheduled.xpath"),"scheduled statement is active", "scheduled statement is not active");
clickByXpathExplict(prop.getProperty("click.pastpayment.xpath"));
VerifyElementPresent(prop.getProperty("verify.pastpayment.xpath"),"past payments is active", "past payments is not active");

return this;
}
}

