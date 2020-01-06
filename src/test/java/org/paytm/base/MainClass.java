package org.paytm.base;

import org.openqa.selenium.support.PageFactory;
import org.paytm.pages.HomePage;
import org.paytm.pages.MobilePostpaid;
import org.paytm.pages.MobilePrepaid;
import org.testng.Assert;

public class MainClass extends BaseClass {
	
	MobilePrepaid mPrePaidPage;
	HomePage homePage;
	MobilePostpaid mPostPaidPage;
	public MainClass(){
	 
	 mPrePaidPage = PageFactory.initElements(driver, MobilePrepaid.class);
	 homePage = PageFactory.initElements(driver, HomePage.class);	 
	 mPostPaidPage = PageFactory.initElements(driver, MobilePostpaid.class);
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
		
	
	public void verify_PostPaidPage_texts() throws Exception {
		logger=extent.createTest("Verifying Texts in Mobile PostPaid page");
		ReadExcel();
		/*elemenToBeClicked(mPostPaidPage.getPostPaidLink());
		Assert.assertEquals(getWebElementText(mPostPaidPage.getPostPaidTitle()), "Mobile Recharge or Bill Payment");
		iselementSelected(mPostPaidPage.getPostPaidRadioButton());
		textToBeSent(mPostPaidPage.getPostPaidMobileNumber(), "9500448151");
		logger.getStatus();
		//textToBeSent(mPostPaidPage.getPostPaidProvider(), "Airtel");
		//pressEnterKeyAfterWebElement(mPostPaidPage.getPostPaidProvider());
		textToBeSent(mPostPaidPage.getPostPaidAmount(), "100");
		logger.addScreenCaptureFromBase64String("amount entered");
		elemenToBeClicked(mPostPaidPage.getPostPaidFastForward());*/
		
		
	}
}
