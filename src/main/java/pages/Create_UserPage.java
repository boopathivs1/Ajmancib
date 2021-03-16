package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Create_UserPage extends ProjectWrapp{
	public  Create_UserPage(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}

	
	
	
	
	
	

	public Create_UserPage fillCreateUsersForm(String userid,String firstname,String phonenumber,String emailid,String Country,String City,String corporateChannels,String idIssuingCountry,String idtype,String PassportNumber,String Securitychoosen,String TransactionSecurityChoosen) throws InterruptedException{
Thread.sleep(4000);

enterByXpathExplict(prop.getProperty("Enter.createUsers.form.userid.xpath"),userid);
		enterByXpathExplict(prop.getProperty("Enter.createUsers.form.firstname.xpath"),firstname);
		
		String mobileno= phonenumber;   
		mobileno = mobileno.replaceAll("[^a-zA-Z0-9]", " ");  
		
		String phnum = mobileno.replaceAll("\\s", "");
		
		
		
		enterByXpathExplict(prop.getProperty("Enter.createUsers.form.telephone.xpath"),phnum);

		Thread.sleep(4000);
		dropdownSelection(prop.getProperty("Enter.createUsers.form.country.xpath"),Country);
		
		
		Thread.sleep(4000);
		pageScroll();
				enterByXpathExplict(prop.getProperty("Enter.createUsers.form.email.xpath"),emailid);		
				Thread.sleep(4000);

				
		
		enterByXpathExplict(prop.getProperty("Enter.createUsers.form.designation.xpath"),"testk");		
		Thread.sleep(4000);

		dropdownSelection(prop.getProperty("Enter.createUsers.form.city.xpath"),City);


//		dropdownSelection(prop.getProperty("Enter.createUsers.form.corporatechannels.xpath"),corporateChannels);
		//clickByXpathExplict(prop.getProperty("click.calendar.icon.xpath"));
		//clickByXpathExplict(prop.getProperty("click.today.calendar.xpath"));
//		pageScroll400();
	scrolltoelementJs(prop.getProperty("id.issuing.idtype.xpath"));	
	
	dropdownSelectionindex(prop.getProperty("id.issuing.idtype.xpath"),idtype,1);

		String userpassport= PassportNumber;   
		userpassport = userpassport.replaceAll("[^a-zA-Z0-9]", " ");  
		
		String userPassportNum = userpassport .replaceAll("\\s", "");
		
		
		enterByXpathExplict(prop.getProperty("passport.id.number.xpath"),userPassportNum);		
		Thread.sleep(4000);
		
//		dropdownSelectionindex(prop.getProperty("id.issuing.country.xpath"),idIssuingCountry,2);
//		Thread.sleep(4000);	
//		dropdownSelectionindex(prop.getProperty("id.issuing.idtype.xpath"),idtype,2);
		
		Thread.sleep(4000);
		
		dropdownSelection(prop.getProperty("login.security.choosen.xpath"),Securitychoosen);
		Thread.sleep(4000);
		dropdownSelectionindex(prop.getProperty("transaction.security.choosen.xpath"),TransactionSecurityChoosen,2);
		
	//	dropdownSelection(prop.getProperty("transaction.security.choosen.xpath"),TransactionSecurityChoosen);
		clickByXpathExplict(prop.getProperty("button.create.button.xpath"));
		
		
				
				
		return this;
	}

	
	public AdminDatelinePage clickDatelinemenu() throws InterruptedException{

		defaultcontent();
		Thread.sleep(4000);
		clickByXpathExplict(prop.getProperty("click.payment.dateline.menu.xpath"));
		//locateFrame("icanvas");

	
	
	return new AdminDatelinePage(driver, test);
	}

	
	
}
