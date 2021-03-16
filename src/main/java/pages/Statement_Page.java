package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Statement_Page extends ProjectWrapp{
	public  Statement_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	
	
	public Statement_Page  verifystatementpage(String statAccno) throws InterruptedException{
		
		
		locateFrame("icanvas");	
		clickByXpathExplict(prop.getProperty("Click.Statement.Account.dropdown.xpath"));

		clickByXpathExplict(".//li[contains(@class,'active-result')][contains(text(),'"+statAccno+"')]");	


		VerifyElementPresent(prop.getProperty("verify.StatementPage.result.xpath"),"Statement details has been displaying" ,"Statement details has not been displaying");
	
return this;
	}	
	
	public	Statement_Page getbalanceamnt() throws InterruptedException{
		Thread.sleep(5000);

		
		StatementBalanceAmount=getTextByXpath("(.//span[contains(@class,'lead')]/span)[2]");

	defaultcontent();

			return this;
		}
	
	public Ajman_Dashboard clicktooltip(){
		clickByXpathExplict(prop.getProperty("click.home.tooltip.xpath"));
	return new Ajman_Dashboard(driver, test); 
	}

	
	
	public Statement_Page  statementTabVerify(String statement) throws InterruptedException{
		if(statement.contains("Mini Statement")){
			
			verifybyAttributesPreselectxpath(prop.getProperty("Statement.VerifyMiniStatement.Tab.xpath"), "class", "active","Mini statement tab is now active","Mini statement tab is not active");
			
			
			
			
		}
		else if (statement.contains("Current Month")) {
			

			clickByXpathExplict(prop.getProperty("Statement.clickcurrentMonth.Tab.xpath"));
		

			verifybyAttributesPreselectxpath(prop.getProperty("Statement.VerifycurrentMonth.Tab.xpath"), "class", "active","Current Month tab is now active","Current Month tab is not active");
			
			
			
		}
		else if (statement.contains("Previous Month")) {
						
			clickByXpathExplict(prop.getProperty("click.previousmonth.xpath"));
		Thread.sleep(5000);
			verifybyAttributesPreselectxpath(prop.getProperty("verify.previousmonth.tab.xpath"), "class", "active","Previous Month tab is now active","Previous Month tab is not active");

		}			
			
		else if (statement.contains("Last Three Month")) {
clickByXpathExplict(prop.getProperty("click.LastThreemonth.xpath"));

			verifybyAttributesPreselectxpath(prop.getProperty("verify.LastThreemonth.tab.xpath"), "class", "active","Previous Month tab is now active","Previous Month tab is not active");
		}			
		else if (statement.contains("More")) {
			
			clickByXpathExplict(prop.getProperty("click.morebutton.xpath"));
			
			verifybyAttributesPreselectxpath(prop.getProperty("verify.morelink.active.xpath"), "class", "active","More tab is now active","More tab is not active");
			enterByXpathExplict(prop.getProperty("enter.fromamount.xpath"),"10");
			enterByXpathExplict(prop.getProperty("enter.toamount.xpath"),"1000");
			enterByXpathExplict(prop.getProperty("enter.fromDate.xpath"),"01/11/2020");

enterByXpathExplict(prop.getProperty("enter.toDate.xpath"),"08/01/2021");
clickByXpath(prop.getProperty("click.morefilter.button.xpath"));

		VerifyElementPresent(prop.getProperty("verify.filterresult.xpath"), "Filter Working Properly in statement page", "Filter Working not  Properly in statement page");	
		
		}
		return this;

}
	
}

	
	
