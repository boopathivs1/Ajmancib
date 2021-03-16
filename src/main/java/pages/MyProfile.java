package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class MyProfile  extends ProjectWrapp{
	public MyProfile  (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}	
	
	public MyProfile verifyProfiledata() throws InterruptedException{
		VerifyElementPresent(prop.getProperty("verify.profiledata.xpath"),"Profile Info has been displaying","Profile Info has not been displaying");
		clickByXpathExplict(prop.getProperty("click.profile.close.xpath"));
		
		
		
return new MyProfile(driver, test);
	}
	
	
	
	
	
	}
