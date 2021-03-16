package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrapp;

public class OtP_Page 	 extends ProjectWrapp{
			public  OtP_Page(RemoteWebDriver driver, ExtentTest test){
				this.driver = driver;
				this.test = test;
				

			}

			public OtP_Page otphandling(String actions,String xpath,String entertext,String verifymsg) throws InterruptedException{
				Thread.sleep(4000);
				if(actions.equalsIgnoreCase("click")){
					
					clickByXpathExplict(xpath);
//					Thread.sleep(3000);
				}
				else if(actions.equalsIgnoreCase("enter")){
					enterByXpathExplict(xpath,entertext);
				}
				else if (actions.equalsIgnoreCase("verify")) {
			verifyTextContainsByXpath(xpath,verifymsg);
			//		verifyTextByXpathExplicitwait(xpath, verifymsg);
					
				}
				else if (actions.equalsIgnoreCase("getrefno")) {
					getrefnumer=ReturnXpathtext(xpath);
					
				}
				
				return this;
			}

		
			public Bulk_Upload NavigationWPS(){
				//	defaultcontent();
				return new Bulk_Upload(driver, test);
				
				}
				
			public OtP_Page FillBeneForm(String paymentType,String name,String accno,String currency,String translimit,String dailylimit,String Monthlylimit,String initiator,String sourceacc) throws InterruptedException{
				Thread.sleep(3000);
			
		clickByXpathExplict(prop.getProperty("click.addnewVendor.xpath"));
		dropdownSelection(prop.getProperty("select.dropdown.xpath"),paymentType);
		enterByXpathExplict(prop.getProperty("enter.nickname.xpath"),name);
		enterByXpathExplict(prop.getProperty("enter.accnumber.xpath"),accno);
		enterByXpathExplict(prop.getProperty("enter.confirm.accno.xpath"),accno);
		clickByXpathExplict(prop.getProperty("click.save.button.xpath"));
Thread.sleep(3000);
		//dropdownSelection(prop.getProperty("select.currency.dropdown.xpath"),currency);
		pageScroll();
		enterByXpathExplict(prop.getProperty("enter.transactionlimit.xpath"),translimit);
		enterByXpathExplict(prop.getProperty("enter.daily.limit.xpath"),dailylimit);
		enterByXpathExplict(prop.getProperty("enter.monthly.limit.xpath"),Monthlylimit);
		clickByXpathExplict(prop.getProperty("click.calendaricon.xpath"));
		clickByXpathExplict(prop.getProperty("clicktoday.reports.button.xpath"));
		dropdownSelection(prop.getProperty("select.initiator.dropdown.xpath"),initiator);
		dropdownSelection(prop.getProperty("select.bene.account.dropdown.xpath"),sourceacc);
		clickByXpathExplict(prop.getProperty("click.bene.save.btn.xpath"));

		//Boolean a=VerifyElementpresentreturn(prop.getProperty("beneficiary.error.xpath"));
		//booleanResult(a, "Account number has exists already");	
		return this;
			}

			
			
			public Ajman_Dashboard submitTokenXpath(String token) throws InterruptedException{
//				enterByXpathExplict(prop.getProperty("Enter.token.xpath"),token);
//				Thread.sleep(1000);
//					clickByXpathExplict(prop.getProperty("click.submitButton.xpath"));
		log.info("Otp has been submitted");
			//
//					
					return new Ajman_Dashboard(driver, test);
				}
			
			
			
			public OtP_Page fillOtp(String otp) throws InterruptedException{
				
				Thread.sleep(4000);
				clickByXpath(prop.getProperty("click.confirm.button.xpath"));	
//				if(otp.equalsIgnoreCase("OwnAccountOtpSubmit")){
//				enterByXpathExplict((prop.getProperty("enter.otp.xpath")),otpcode);
//				clickByXpath(prop.getProperty("click.finalconfirm.button.xpath"));
//				}
				return this;
			}
			
			
			
			
			
			
			public Paymentdateline otphandlingNavigationPayDATELINE(){
				defaultcontent();
			return new Paymentdateline(driver, test);
			
			}	
			public PaymentReport_Page verifysucessmsg(){	
				verifyTextContainsByXpath(prop.getProperty("verify.submit.sucess.xpath"),"uccessfully");
				getrefnumer=getTextByXpath(prop.getProperty("getrefnumber.xpath"));
				
				defaultcontent();
			return new PaymentReport_Page(driver, test);	
				}

			
			
			
			
			
}
