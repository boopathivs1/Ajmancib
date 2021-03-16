package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class Ajman_Dashboard extends ProjectWrapp{
	public  Ajman_Dashboard (RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
		this.test = test;

	}
	public Users_Dashboard clickAdmin(){
		clickByXpathExplict(prop.getProperty("click.admin.link.xpath"));
		return new Users_Dashboard(driver, test);
		
	}
	public BillPay_Dateline clickBillPayDateline(){
		clickByXpathExplict(prop.getProperty("click.billpayment.xpath"));
		return new BillPay_Dateline(driver, test);
		
	}

	public BillPayment clickBillPay(){
		clickByXpathExplict(prop.getProperty("click.billpayment.xpath"));
		return new BillPayment(driver, test);
		
	}
	
	
	public AdminDatelinePage clickAdminpage(){
		clickByXpathExplict(prop.getProperty("click.admin.link.xpath"));
		return new AdminDatelinePage(driver, test);
		
	}
	
	
	public DateLine clickAccount(){
		clickByXpathExplict(prop.getProperty("Click.AccountMenu.xpath"));
		return new DateLine(driver, test);
		
	}

	public MyProfile clickProfileIcon() throws InterruptedException{
		//Thread.sleep(20000);	
		
		clickByXpathExplict(prop.getProperty("click.profile.icon.xpath"));
		clickByXpathExplict(prop.getProperty("click.viewprofile.icon.xpath"));
		
return new MyProfile(driver, test);
	}
	
	public Payment_Page clickpaymentMenu(){
		clickByXpathExplict(prop.getProperty("Click.payment.Menu.xpath"));
		//locateFrame("icanvas");
		return new Payment_Page(driver, test);
	}
	
	
	public Statement_Page navigateStatementpage(){
		
		return new Statement_Page(driver, test);
	}

	
	
	

	public BillPayment_Page clickBillPaymentMenu() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.billpayment.xpath"));
		
		return new BillPayment_Page(driver, test);
		
	}
	
	
	
	
	
	
	public Account_Page clickAccountMenu() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("Click.AccountMenu.xpath"));
		//locateFrame("icanvas");
		return new Account_Page(driver, test);
		
	}
	public Loan_Page clickloan_link() throws InterruptedException{
		//Thread.sleep(20000);
		

		clickByXpathExplict(prop.getProperty("click.loan.menu.xpath"));
		//locateFrame("icanvas");
		return new Loan_Page (driver, test);
		
	}
	public Bulk_Upload payment_link() throws InterruptedException{
		Thread.sleep(4000);
		
	clickByXpathExplict(prop.getProperty("click.payment.xpath"));
		//locateFrame("icanvas");
		return new Bulk_Upload(driver, test);
		
	}
	
	public Payment_Page clickPayment_link() throws InterruptedException{
		Thread.sleep(4000);
		
	clickByXpathExplict(prop.getProperty("click.payment.xpath"));
		//locateFrame("icanvas");
		return new Payment_Page (driver, test);
		
	}
	
	public BillPayment_Page clickBillPayment_link() throws InterruptedException{
		Thread.sleep(4000);
		
	clickByXpathExplict(prop.getProperty("click.billpayment.xpath"));
		//locateFrame("icanvas");
		return new BillPayment_Page (driver, test);
		
	}
		
	
	
	

}

