package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Users_Dashboard  extends ProjectWrapp{
	public  Users_Dashboard(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	
	
	public Create_UserPage clickCreateUsers(){
	clickByXpathExplict(prop.getProperty("click.createusers.link.xpath"));
	return new Create_UserPage(driver, test);
	}

	public Users_Dashboard clickUsersMenu(){
		clickByXpathExplict(".//p[text()='Users']");
		return this;
		
	}
	
	public AdminDatelinePage navigateDateline(){
	return new AdminDatelinePage(driver, test);
	}
	
	

	public Users_Dashboard clickAssignUsers(String xpath) throws InterruptedException{
		Thread.sleep(2000);

	locateFrame("icanvas");
	Thread.sleep(2000);

	clickByXpathExplict(xpath);
	return this;
	}
	public Users_Dashboard createUsersFilter(String userid,String status,String searchKeyword,String searchenable) throws InterruptedException{
	//locateFrame("icanvas");
		
dropdownSelection(prop.getProperty("select.usersearch.xpath"),userid);
dropdownSelection(prop.getProperty("select.usersearchStatus.xpath"),status);
if(searchenable.equalsIgnoreCase("true")){
enterByXpathExplict(prop.getProperty("enter.inputsearchkeyword.xpath"),searchKeyword);
}
clickByXpathExplict(prop.getProperty("click.usersfilter.button.xpath"));

pageScroll400();
Thread.sleep(4000);
	return this;
	}
	public Users_Dashboard submitAssignCorporate(){
	clickByXpathExplict(prop.getProperty("button.create.button.xpath"));
	return this;
	}

	public Users_Dashboard chooseOptionsAssignCorporate() throws InterruptedException{
		clickJs(prop.getProperty("click.select.assigncorporates.checkbox.xpath"));
		Thread.sleep(3000);

		clickJs(prop.getProperty("click.select.assigncorporates.checkboxone.xpath"));

		
		
		
		Thread.sleep(4000);
		
		
		return this;
	}

public Users_Dashboard clickNewAssignCorporate(){
	clickByXpathExplict(prop.getProperty("click.assignnewcorporate.button.xpath"));
	
	return this;
}
public Users_Dashboard corporateSelectionoptions(){
	clickJs(prop.getProperty("click.corporateselection.checkbox.xpath"));
	//clickJs(prop.getProperty("click.corporateselection.xpath"));
	
	//clickByXpathExplict(prop.getProperty("click.corporateselection.xpath"));
	clickByXpathExplict(prop.getProperty("click.corporate.assign.xpath"));
	
	
	return this;
}
public Users_Dashboard verifyCorporateAssigned(){
VerifyElementPresent(prop.getProperty("verify.corporate.assign.xpath"),"Corporate has been assigned to this User","Corporate has not been assigned to this User");	
	
return this;
}
public Users_Dashboard clickAssignAccessRights(){
	clickByXpathExplict(prop.getProperty("click.assign.access.rights.xpath"));
		return this;
}
public Users_Dashboard clickEditAssignAccessRights(String rightsname){
	clickByXpathExplict("(.//h4[text()='"+rightsname+"']//following::button[text()='Edit'])[1]");
		return this;
}
public Users_Dashboard clickDeleteAssignAccessRights(){
	clickByXpathExplict(prop.getProperty("click.delete.assign.rights.xpath"));
	clickByXpathExplict(prop.getProperty("click.delete.yesButton.xpath"));
	
	
	
	
		return this;
}


public Users_Dashboard verifyCorporateAccessAssignedStatus(String Status){
	//verifyTextByXpathExplicitwait(prop.getProperty("verify.corporate.assignacess.status.xpath"),Status);

	verifyTextByXpathExplicitwait(prop.getProperty("verify.corporate.assignacess.GetText.xpath"),Status);


	return this;
	}

public Users_Dashboard fillAccessRights(String checkboxstatus,String rightsname) throws InterruptedException{
	//verifyTextByXpathExplicitwait(prop.getProperty("corporate.assign.status.xpath"),"Un-Assigned");
	clickByXpathExplict("(.//h4[text()='"+rightsname+"']//following::button[text()='Edit'])[1]");
	
	if(checkboxstatus.equalsIgnoreCase("Yes"))
	{
		clickByXpathExplict(prop.getProperty("select.enable.secondary.checkbox.xpath"));		
	}
	clickByXpathExplict(prop.getProperty("click.selectall.assignaccess.xpath"));
	clickByXpathExplict(prop.getProperty("click.submit.button.assignaccess.xpath"));

	Thread.sleep(15000);
	return this;
}

public Users_Dashboard getCorporateid(){

	deAssigncorporateid=getTextByXpath(prop.getProperty("verify.corporateid.xpath"));
	return this;
}
public Users_Dashboard verifyCorporateDeAssigned(){

String currentCorporateid=getTextByXpath(prop.getProperty("verify.corporateid.xpath"));

verifyNottextmatches(deAssigncorporateid, currentCorporateid);
reportStep("Corporate has been deassigned","PASS");
	//VerifyElementnotPresent(prop.getProperty("verify.corporate.assign.xpath"),"Corporate has not been assigned to this User","Corporate has been assigned to this User");	
	
return this;
}

	public Users_Dashboard verifyeditUserIdpresent(String userid,String xpath) throws InterruptedException{
	////edit		
			
			for(int i=1;i<100;i++){
				//Thread.sleep(4000);
	boolean a=VerifyElementpresentreturn("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"'])");
	//reportStep("account number has present in this page", "PASS");
	if(a){
		reportStep("User id  has been displaying in this page", "PASS");
		pageScroll();
		Thread.sleep(4000);
		clickByXpathExplict(xpath);
		
		break;
	}
	else {
		int c=i+1;
		reportStep(""+userid+" User account  has not been diplaying in this page", "INFO");

		reportStep(""+userid+" trying find account number in another page number", "INFO");
		boolean b=VerifyElementpresentreturn(".//ul[@class='pagination']//a[text()='"+c+"']");
		if(b){			
		clickByXpathExplict(".//ul[@class='pagination']//a[text()='"+c+"']");
		Thread.sleep(4000);
		}
		else {
			reportStep(""+userid+" Account number has not diplaying in this page", "FAIL");
			break;
		}
	}
	}
	return this;
	}
public Users_Dashboard deleteuserVerify(String xpath,String validmsg,String errormsg){
		
		VerifyElementnotPresent(xpath,validmsg,errormsg);
		return this;
	}
	



	public Users_Dashboard verifyUseIdpresent(String userid) throws InterruptedException{
	////edit		
			
			for(int i=1;i<100;i++){
	boolean a=VerifyElementpresentreturn("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"'])");
//	reportStep("account number has present in this page", "PASS");
	if(a){
		reportStep("User id  has been diplaying in this page", "PASS");
//		clickByXpathExplict("(.//strong[contains(text(),'User ID')]/following::span[text()='testqa100'])/following::button[text()='Show'][1]");
		
		break;
	}
	else {
		int c=i+1;
		reportStep(""+userid+" User account  has not been diplaying in this page", "INFO");

		reportStep(""+userid+" trying find account number in another page number", "INFO");
		boolean b=VerifyElementpresentreturn(".//ul[@class='pagination']//a[text()='"+c+"']");
		if(b){
		clickByXpathExplict(".//ul[@class='pagination']//a[text()='"+c+"']");
		Thread.sleep(4000);
		}
		else {
			reportStep(""+userid+" Account number has not diplaying in this page", "FAIL");
			break;
		}
	}
	}
	return this;
	}
	

	
	
	public Users_Dashboard verifyUseIdDeletion(String userid) throws InterruptedException{
	////edit		
			
			for(int i=1;i<100;i++){
	boolean a=VerifyElementpresentreturn("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"'])");
//	reportStep("account number has present in this page", "PASS");
	if(a){
		reportStep("User id  has been diplaying in this page", "FAIL");
//		clickByXpathExplict("(.//strong[contains(text(),'User ID')]/following::span[text()='testqa100'])/following::button[text()='Show'][1]");
		
		break;
	}
	else {
		int c=i+1;
		reportStep(""+userid+" User account  has not been diplaying in this page", "INFO");

		reportStep(""+userid+" trying find account number in another page number", "INFO");
		boolean b=VerifyElementpresentreturn(".//ul[@class='pagination']//a[text()='"+c+"']");
		if(b){
		clickByXpathExplict(".//ul[@class='pagination']//a[text()='"+c+"']");
		Thread.sleep(4000);
		}
		else {
			reportStep(""+userid+"  has not diplaying in this page", "PASS");
			break;
		}
	}
	}
	return this;
	}

	public Users_Dashboard clickUsersEditLink(String userid){
		
		clickByXpathExplict("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[text()='More'])[1]");
		
		clickByXpathExplict("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[text()='Edit'])[1]");
		
		return this;
	}
	
public Users_Dashboard clickAssignCorporates(String userid){
		
		clickByXpathExplict("(.//strong[contains(text(),'User ID')]/following::span[text()='"+userid+"']//following::span[contains(text(),'Corporates')])");
		
		return this;
	}
	
	
	
	

	public AdminDatelinePage clickDatelinemenu() throws InterruptedException{

		defaultcontent();
		Thread.sleep(4000);
		clickByXpathExplict(prop.getProperty("click.payment.dateline.menu.xpath"));
	//	locateFrame("icanvas");

	
	
	return new AdminDatelinePage(driver, test);
	}
	public Users_Dashboard clickUsersDeleteLink(){
		clickByXpathExplict(prop.getProperty("editform.deletebutton.xpath"));
		clickByXpathExplict(prop.getProperty("users.yes.button.xpath"));
		
		
		
		return this;
	}


	public Users_Dashboard filleditUsersForm(String firstname,String Country,String City,String CorporateChannels,String idIssuingCountry,String idType,String idNumber,String LoginSecurityChoosen,String TransactionSecurityChoosen) throws InterruptedException{
		
	//	enterByXpathExplict(prop.getProperty("Enter.createUsers.form.userid.xpath"),"testk");
//	enterByXpathExplict(prop.getProperty("Enter.createUsers.form.firstname.xpath"),firstname);
	//	enterByXpathExplict(prop.getProperty("Enter.createUsers.form.telephone.xpath"),"123412341216");
		//enterByXpathExplict(prop.getProperty("Enter.createUsers.form.email.xpath"),"testk@mailinator.com");		
		dropdownSelection(prop.getProperty("Enter.createUsers.form.country.xpath"),Country);
		//enterByXpathExplict(prop.getProperty("Enter.createUsers.form.email.xpath"),"testk@mailinator.com");		
	
		enterByXpathExplict(prop.getProperty("Enter.createUsers.form.designation.xpath"),"testk");		
	
			
		clickByXpathExplict(prop.getProperty("click.edituser.update.button.xpath"));
		
		Thread.sleep(10000);
				
				
		return this;
	}

	
	
	
	

	
	
	
	
}


