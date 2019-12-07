package org.paytm.testcases;

import org.openqa.selenium.WebElement;
import org.paytm.base.BaseClass;
import org.paytm.base.MainClass;
import org.paytm.pages.MobilePrepaid;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PrePaid {
	
	MainClass mc = new MainClass();
	BaseClass bc = new BaseClass();
	MobilePrepaid mPre = new MobilePrepaid();
	
	@BeforeSuite
	public void startUp() throws Exception {
		bc.browserSelection();
	}
	

	@Test
	/*public void Prepaid_recharge() {
		mc.prepaid_recharge(mPre.getMobile_Prepaid_link(),mPre.getMobileNumber_Prepaid();mPre.getOperator_Prepaid(),mPre.getCircle_Prepaid();mPre.getAmount_Prepaid(),mPre.getFastForward_Prepaid(),mPre.getProceed_Prepaid(){
		}*/
	
	public void prepaid() {
		System.out.println("Hiiiii");
		mc.click_prepaidlink(mPre.getMobile_Prepaid_link());
	}
	
}
