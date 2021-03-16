package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class SuccessPage extends ProjectWrapp{


	public  SuccessPage(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	
	public	Request_Page getReno(String RefnoName) throws InterruptedException{

		switch(RefnoName)
		{
		   case "RefNo1" :
			   String input=ReturnXpathtext(prop.getProperty("refno.get.deposit.xpath"));
			    String[] splitArray = input.split("\\s+");
	getrefnumer=splitArray[2];
			   break; // break is optional
		  case "RefNo2" :
		  
		      break; 
	 
		   default : 
		   
		}
		
		
		defaultcontent();
		return new Request_Page(driver, test);
		
	}		
}	
		
		
/*		
		if(menuname.equalsIgnoreCase("interim month")||menuname.equalsIgnoreCase("Previous month")){
		//	verifyTextContainsByXpath(prop.getProperty("verify.previousinterimSucess.xpath"), "Request initiated successfully");
		//	Thread.sleep(6000);
			String input=ReturnXpathtext("(.//div[contains(@class,'alert-success')]//span)[2]");
		    String[] splitArray = input.split("\\s+");

getrefnumer=splitArray[2];
		}
		else if (menuname.equalsIgnoreCase("New Deposit Request")) {
	//		verifyTextContainsByXpath("(.//div[contains(@class,'alert-success')]//span)[2]", "Deposit request initiated successfully ");
//		Thread.sleep(6000);
			getrefnumer=ReturnXpathtext("(.//div[contains(@class,'alert-success')]//span)[3]");
		}
		else if (menuname.equalsIgnoreCase("update maturity")) {
		verifyTextContainsByXpath("(.//div[contains(@class,'alert-success')]//p)", "request initiated successfully ");
	//	Thread.sleep(6000);
		
		getrefnumer=ReturnXpathtext("(.//div[contains(@class,'alert-success')]//b)");
		}
		ReferenceNo(getrefnumer," Reference Number is");
		
		defaultcontent();
		
//		logout(true);

		
	return new RequestsStatus(driver, test);
	}

*/
	
	

