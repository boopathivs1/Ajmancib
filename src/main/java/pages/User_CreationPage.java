package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class User_CreationPage extends ProjectWrapp{
	public  User_CreationPage(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}


}
