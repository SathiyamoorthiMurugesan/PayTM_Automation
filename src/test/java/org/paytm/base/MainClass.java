package org.paytm.base;

import org.openqa.selenium.support.PageFactory;
import org.paytm.pages.MobilePrepaid;
import org.testng.annotations.Test;

public class MainClass extends BaseClass{
	
	MobilePrepaid mPrePaidPage;
	//WebDriver driver;
	public MainClass(){
		
	 mPrePaidPage = PageFactory.initElements(driver, MobilePrepaid.class);
	 
	}
	/*public void prepaid_recharge(WebElement Mobile_Prepaid_link, WebElement MobileNumber_Prepaid, WebElement Operator_Prepaid, WebElement Circle_Prepaid, WebElement FastForward_Prepaid, WebElement Proceed_Prepaid) {
		
		elemenToBeClicked(Mobile_Prepaid_link);
		textToBeSent(MobileNumber_Prepaid, "9500448151");
		textToBeSent(Operator_Prepaid, "Airtel");
		textToBeSent(Circle_Prepaid, "Tamil Nadu");
		elemenToBeClicked(FastForward_Prepaid);
		elemenToBeClicked(Proceed_Prepaid);

	}

*/	
	//@Test
	public void click_prepaidlink() {
		elemenToBeClicked(mPrePaidPage.getMobile_Prepaid_link());
	}
	
	
}
