package pages;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.DataLine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class DateLine extends ProjectWrapp{
	public  DateLine (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;
	//	if(!verifyTitle("Corporate Customer Banking  ")){
		//	reportStep("This is not Corporate Customer Banking", "FAIL");
	//	}
	}

	
	
	
	public DateLine defaultContentFrame(){
		defaultcontent();
	
		return this;
	}
	

	
	public Statement_Page clickStatementMenu() throws InterruptedException{
	//	Thread.sleep(4000);
		clickByXpathExplict(prop.getProperty("Click.Menu.Statement.xpath"));
	
		
		return new Statement_Page(driver, test);
	}	

	public DateLine clickFilterButton(String FilterStatus) throws InterruptedException{
		locateFrame("icanvas");
		
		//FilterVerification(prop.getProperty("Click.RequestType.Value.Xpath"),prop.getProperty("Click.RequestStatus.Value.Xpath"),"DT-25941578","Accepted"); 
	clickByXpathExplict(prop.getProperty("click.Filter.xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestType.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestType.Value.Xpath"));	
		clickByXpathExplict(prop.getProperty("Click.RequestStatus.Xpath"));
clickByXpathExplict(prop.getProperty("Click.RequestStatus.Value.Xpath"));
		
		clickByXpathExplict(prop.getProperty("Filter.button.xpath"));
	verifyTextByXpath(prop.getProperty("Filter.First.status.verifyxpath"),FilterStatus);
	//verifyTextMatchlistByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"),FilterStatus);
//  pageScroll400();
		verifyTextcontainslistByXpath(prop.getProperty("Filter.DepositReferno.xpath"),"DT-25973937");	
	verifyTextcontainslistByXpath(prop.getProperty("Filter.Requestnumber.Status.xpath"),"DT-25959228");	
		defaultcontent();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public DateLine clickFilterAuthorizeButton(String FilterStatus) throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.Filter.xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestType.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestType.Value.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestStatus.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestStatusPending.Value.Xpath"));
		clickByXpathExplict(prop.getProperty("Filter.button.xpath"));
	List<String>refno=new ArrayList<>();
	List<WebElement>a=driver.findElements(By.xpath(".//ul[contains(@class,'dateline')]//a[contains(@class,'dtln-info')]"));

	//List<WebElement>a=driver.findElements(By.xpath(".//div[@class='row']/a"));
	for(int i=0;i<a.size();i++){
		String reference=a.get(i).getAttribute("onclick");
	

	refno.add(reference);
	}
	
	Thread.sleep(6000);
	for(int i=0;i<a.size();i++){
String onclickvalue=a.get(i).getAttribute("onclick");
			if(onclickvalue.contains("6999835")){
		
				int j=i+1;
				clickByXpathExplict("(.//a[text()='Authorize'])["+j+"]");				
enterByXpathExplict(".//textarea[@id='comment']", "just testing");
enterByXpathExplict(".//input[@id='txtOTP']", "777777");
clickByXpathExplict(".//button[@id='btn2FAValidate']");				
			
			}
			
		}
		
		defaultcontent();
		return this;
	
	}
	
	
	public DateLine clickFilterAuthorizeButtonReferencenum() throws InterruptedException{
		locateFrame("icanvas");
		clickByXpathExplict(prop.getProperty("click.Filter.xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestType.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestType.Value.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestStatus.Xpath"));
		clickByXpathExplict(prop.getProperty("Click.RequestStatusPending.Value.Xpath"));
		clickByXpathExplict(prop.getProperty("Filter.button.xpath"));
	//List<String>refno=new ArrayList<>();
		Thread.sleep(8000);
		verifyTextcontainslistByXpath(prop.getProperty("Filter.DepositReferno.xpath"),getrefnumer);
		
	
		List<String>a1=new ArrayList<String>();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		List <WebElement>  element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[contains(@class,'text-right')]//span[contains(@class,'text-info')]")));
Thread.sleep(8000);
		for (WebElement webElement : element) {
		String cate=webElement.getText();

		a1.add(cate);
	}	


	for(int i=0;i<element.size();i++){
		Thread.sleep(4000);		
		String refnumber=element.get(i).getText();
			if(refnumber.contains(getrefnumer)){
			
		int j=i+1;
				clickByXpathExplict("(.//a[text()='Authorize'])["+j+"]");				
		enterByXpathExplict(".//textarea[@id='comment']", "just testing");
		enterByXpathExplict(".//input[@id='txtOTP']", "777777");
		clickByXpathExplict(".//button[@id='btn2FAValidate']");				
	break;
		}
			
	}
			

		defaultcontent();
return this;
	
	}

	
	
	
	
	
public DateLine	acceptStatusVerify() throws InterruptedException{
	Thread.sleep(25000);
	clickByXpathExplict(prop.getProperty("click.Filter.xpath"));

	clickByXpathExplict(prop.getProperty("Click.RequestType.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestType.Value.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestStatus.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestStatus.Value.Xpath"));
	clickByXpathExplict(prop.getProperty("Filter.button.xpath"));
verifyTextByXpath(prop.getProperty("Filter.First.status.verifyxpath"),"Accepted");
	verifyTextMatchlistByXpath(prop.getProperty("Filter.status.checkingAccepted.Status.xpath"),"Accepted");
pageScroll400();
	verifyTextcontainslistByXpath(prop.getProperty("Filter.DepositReferno.xpath"),getrefnumer);	
//verifyTextcontainslistByXpath(prop.getProperty("Filter.Requestnumber.Status.xpath"),"DT-25573937");	
	defaultcontent();
return this;
}
	
public DateLine datelineAuthorizeReferencenum() throws InterruptedException{
	locateFrame("icanvas");
	clickByXpathExplict(prop.getProperty("click.Filter.xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestType.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestType.Value.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestStatus.Xpath"));
	clickByXpathExplict(prop.getProperty("Click.RequestStatusPending.Value.Xpath"));
	clickByXpathExplict(prop.getProperty("Filter.button.xpath"));
//List<String>refno=new ArrayList<>();
	Thread.sleep(8000);
	verifyTextcontainslistByXpath(prop.getProperty("Filter.DepositReferno.xpath"),getrefnumer);
	
	
	List<String>a1=new ArrayList<String>();
	WebDriverWait wait= new WebDriverWait(driver, 30);
	List <WebElement>  element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[contains(@class,'text-right')]//span[contains(@class,'text-info')]")));
Thread.sleep(8000);
	for (WebElement webElement : element) {
	String cate=webElement.getText();

	a1.add(cate);
}	


for(int i=0;i<element.size();i++){
	
	String refnumber=element.get(i).getText();
		if(refnumber.contains(getrefnumer)){
		
	int j=i+1;
			clickByXpathExplict("(.//a[text()='Authorize'])["+j+"]");				
	enterByXpathExplict(".//textarea[@id='comment']", "just testing");
	enterByXpathExplict(".//input[@id='txtOTP']", "777777");
	clickByXpathExplict(".//button[@id='btn2FAValidate']");				
break;
	}
		
}
		

return this;

}

	
	}	
	
	
	
	

