package org.paytm.base;

import org.openqa.selenium.support.PageFactory;
import org.paytm.pages.HomePage;
import org.paytm.pages.MobilePrepaid;

public class MainClass extends BaseClass {
	
	MobilePrepaid mPrePaidPage;
	HomePage homePage;
	
	public MainClass(){
	 
	 mPrePaidPage = PageFactory.initElements(driver, MobilePrepaid.class);
	 homePage = PageFactory.initElements(driver, HomePage.class);	 
	}
	public void MobilePrepaid_recharge() {
		logger = extent.createTest("MobilePrepaid_recharge");
		titleOfThePage();
		elemenToBeClicked(mPrePaidPage.getMobile_Prepaid_link());
		textToBeSent(mPrePaidPage.getMobileNumber_Prepaid(), "9500448151");
		textToBeSent(mPrePaidPage.getOperator_Prepaid(), "Airtel");
		/*textToBeSent(mPrePaidPage.getCircle_Prepaid(), "Tamil Nadu");
		textToBeSent(mPrePaidPage.getAmount_Prepaid(), "100");
		elemenToBeClicked(mPrePaidPage.getFastForward_Prepaid());
		elemenToBeClicked(mPrePaidPage.getProceed_Prepaid());*/

	}
	
	public void HomePage_playWin() {
		logger = extent.createTest("HomePage_playWin button check");
		elemenToBeClicked(homePage.getHomePage_Play_Win());
	}
		
}
