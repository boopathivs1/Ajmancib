package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Request_Page extends ProjectWrapp{
	public  Request_Page (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	
	public BalanceRequestForm clickBalanceRequestMenuLinks(){
		clickByXpathExplict(prop.getProperty("click.BalanceReq.xpath"));
		return new BalanceRequestForm(driver, test);
	}
	
	

	public Checkbook_Request_Page clickcheckbookRequest() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.checkbookreq.xpath"));

		return new Checkbook_Request_Page(driver, test);
	}
		

	
	public Liablity_Request_Page clickLiabilityRequestMenuLinks(){
		clickByXpathExplict(prop.getProperty("click.liablitycover.link.xpath"));
		return new Liablity_Request_Page(driver, test);

	}
	
	public Request_Page clickRequestPage() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("clickRequestMenu.xpath"));

		return this;
		
		
	}

	public Request_Page RequestmenuLink() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("clickRequestMenu.xpath"));

		return new Request_Page(driver, test);
		
	}
	
	public Request_Page clickRequestStatusPage() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.requeststatus.xpath"));

		return this;
		
	}	

	
	
		public Request_Page filterRequestStatus(String RequetType,String CompanyName,String Status) throws InterruptedException{
			locateFrame("icanvas");	
//		dropdownSelection(".//div[@id='requestId_chosen']","Balance Certificate");
	
		dropdownSelection(".//div[@id='requestId_chosen']",RequetType);
		
		
		clickByXpathExplict("(.//button[@class='ws-popover-opener']/span)[1]");
		
		clickByXpathExplict("(.//button[@aria-label='Today'])[1]");
		
		
		clickByXpathExplict("(.//button[@class='ws-popover-opener']/span)[2]");

		clickByXpathExplict("(.//button[text()='Today'])[2]");
//		clickByXpathExplict("(.//button[@aria-selected='true'])[2]");
//		clickByXpathExplict("(.//button[@aria-selected='true'])[2]//following::td[1]");
clickByXpathExplict(".//button[text()='More']");
//dropdownSelection(".//div[@id='corporateId_chosen']","SALEH OMAR ALI BIN HAIDER ALHARTHI");
		dropdownSelection(".//div[@id='corporateId_chosen']",CompanyName);

//dropdownSelection(".//div[@id='statusId_chosen']","Pending");

dropdownSelection(".//div[@id='statusId_chosen']",Status);

clickByXpathExplict(".//button[@id='filter']");

	//	Pending
		//Active




		return this;
		
	}	
	
		public Request_Page verifyRequestStatus(String Status) throws InterruptedException{
	verifyTextContainsByXpath("(.//p[text()='"+Status+"'])[1]",Status);
	//Thread.sleep(4000);

	verifyTextcontainslistByXpath(".//li[@class='list-group-item']//p[@class='prime']/span[2]",getrefnumer);
	//Thread.sleep(4000);

	verifyTextMatchlistByXpath("(.//p[text()='"+Status+"'])",Status);

	return this;
	
}	
	
	
	
	
}
