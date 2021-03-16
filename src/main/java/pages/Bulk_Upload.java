package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Bulk_Upload extends ProjectWrapp{
	public Bulk_Upload (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	public Bulk_Upload verifyStatusTab(String Status) throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.filestatus.tab.xpath"));
		clickByXpathExplict(prop.getProperty("click.filter.icon.xpath"));
		
	dropdownSelection(prop.getProperty("filter.type.choosen.wps.xpath"),"Reference Number");
	dropdownSelection(prop.getProperty("wps.status.tab.xpath"),"Pending Authorization");
	
	
	
		enterByXpathExplict(prop.getProperty("enter.wps.refnumber.xpath"),getrefnumer);
		clickByXpathExplict(prop.getProperty("tag.filter.xpath"));
//	verifyTextcontainslistByXpath(prop.getProperty("Filestatus.verify.xpath"),Status);

		
		verifyTextMatchlistByXpath(prop.getProperty("filestatus.verify.process.xpath"),Status);
		
//		verifyTextMatchlistByXpath(prop.getProperty("Filestatus.verify.xpath"),Status);
return this;
	}	
	public Bulk_Upload clickfileUploadTab() throws InterruptedException{
		locateFrame("icanvas");	
		
	//	Boolean a=VerifyElementpresentreturn(prop.getProperty("wps.server.error.xpath"));
		//booleanResult(a, "Unable to Process your request. Please try after sometime has displaying");						
		clickByXpathExplict(prop.getProperty("click.fileupload.tab.xpath"));
//				clickByXpathExplict(".//p[contains(text(),'Own Accounts')]");
		return this;
			}	

	
	
	public Bulk_Upload clickBulkUpload() throws InterruptedException{
			clickByXpathExplict(prop.getProperty("click.fileupload.tab.xpath"));
		return this;
			}	
	
	public Bulk_Upload bulkUploadMenu() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.bulkupload.menu.xpath"));
	return this;
		}	

	public Bulk_Upload locatingframes() throws InterruptedException{
		locateFrame("icanvas");	
	return this;
}	
	
	
	public OtP_Page fillFileUploadForm(String fromcompany,String fromacc,String paymenttype,String filelocation) throws InterruptedException{
	//locateFrame("icanvas");	

//		Thread.sleep(4000);
		dropdownSelection(prop.getProperty("salary.payments.type.wps.xpath"),paymenttype);		
			dropdownSelection(prop.getProperty("click.fromcompany.xpath"),fromcompany);	
		dropdownSelection(prop.getProperty("click.fromAcc.xpath"),fromacc);	

			//Thread.sleep(4000);



fileUploadByXpathExplict(".//*[@id='uploadFile']",filelocation);



//Thread.sleep(10000);

clickByXpathExplict(prop.getProperty("click.submitotp.button.xpath"));


pageScroll();
return new OtP_Page(driver, test);
			}	


	
	public Bulk_Upload verifyfileStatusTab(String Status) throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.filestatus.tab.xpath"));
		//locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("click.filter.icon.xpath"));
		
	dropdownSelection(prop.getProperty("filter.type.choosen.wps.xpath"),"Reference Number");
		enterByXpathExplict(prop.getProperty("enter.wps.refnumber.xpath"),getrefnumer);
		clickByXpathExplict(prop.getProperty("tag.filter.xpath"));
//	verifyTextcontainslistByXpath(prop.getProperty("Filestatus.verify.xpath"),Status);

		
		verifyTextMatchlistByXpath(prop.getProperty("filestatus.verify.process.xpath"),Status);
		
//		verifyTextMatchlistByXpath(prop.getProperty("Filestatus.verify.xpath"),Status);
return this;
	}	
	public Bulk_Upload  locateframe() {
		
		locateFrame("icanvas");	
		return this;
		}

	public Bulk_Upload  Switch_defaultContent() {
		
defaultcontent();
		return this;
		}

	
	public Statement_Page navigateStatementpage(){
		
		return new Statement_Page(driver, test);
	}
	public Bulk_Upload verifyfilefilterStatusTab() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.filestatus.tab.xpath"));
		clickByXpathExplict(prop.getProperty("click.filter.icon.xpath"));
		
	dropdownSelection(prop.getProperty("filter.type.choosen.wps.xpath"),"Reference Number");
		enterByXpathExplict(prop.getProperty("enter.wps.refnumber.xpath"),getrefnumer);
		clickByXpathExplict(prop.getProperty("tag.filter.xpath"));
return this;
	}	

	public Bulk_Upload authorizationWPS() throws InterruptedException{
		//authorizeRequest();
			
			authorizeWPS(prop.getProperty("wps.refnum.xpath"));
			//defaultcontent();
			Thread.sleep(20000);
		//authorizeWPSFILTER(prop.getProperty("wps.refnum.xpath"));
			return this;
			
		}

	
	
	
	
}
