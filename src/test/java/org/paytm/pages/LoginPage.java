package org.paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.paytm.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//*[@class=\"signup-points\"]//p")
	WebElement loginPayTMBenefits;
	
/*	@FindAll(xpath="//*[@class=\"signup-points\"]//p", value = { 		@FindBy })
	WebElement loginPayTMBenefits111;*/
	
	@FindBy (xpath="(//*[@class='text'])[1]")
	WebElement LoginPayTMFastAndSecureText;
	
	@FindBy (xpath="(//*[@class='text'])[2]")
	WebElement LoginPayTMUtilityBillCheckText;
	
	@FindBy (xpath="(//*[@class='text'])[3]")
	WebElement LoginPayTMMerchantNetworkText;
	
	@FindBy (xpath="(//*[@class='text'])[4]")
	WebElement LoginPayTMAmazingDealsText;
	
	@FindBy(className="qrcode")
	WebElement LoginPayTMQRCodeCheck;
	
	@FindBy(xpath="//span[@class='head'")
	WebElement LoginPayTMOpenPayTMApp;
	
	@FindBy(xpath="//*[@event-action=\"learn_more_clicked\"]")
	WebElement LoginPayTMLearnMore;
	
	@FindBy(xpath="(//*[@class=\"dontClosePopup\"])[2]")
	WebElement LoginPayTMAppImg;

	@FindBy(xpath="//*[@event-action=\"login_signup_with_mobile_pwd_clicked\"]")
	WebElement LoginPayTMwithMobileNumberLink;
	
	@FindBy(xpath="//*[@title=\"Close\"]")
	WebElement LoginPayTMCloseButton;
	
	@FindBy(xpath="//*[@ng-bind=\"text.loginLink\"]")
	WebElement LoginPayTMSingIn;
	
	@FindBy(name="username")
	WebElement LoginPayTMSingInMobileNumber;
	
	@FindBy(name="password")
	WebElement LoginPayTMSingInPassword;
	
	@FindBy(name="forgotClick")
	WebElement LoginPayTMSignInForgotPassword;
	
	@FindBy(xpath="//*[@ng-click=\"troubleLoggin()\"]")
	WebElement LoginPayTMSingInOtherLoginIssues;
	
	@FindBy(xpath="//*[@event-action=\"login_securely_button_clicked\"]")
	WebElement LoginPayTMSingInSecurely;
	
	@FindBy(xpath="//*[@href=\"https://appfaq.paytm.com/legal/#\"]")
	WebElement LoginPayTMSingInTermsAndConditions;
	
	@FindBy(xpath="//*[@event-action=\"pp_clicked\"]")
	WebElement LoginPayTMSingInPrivacyPolicy;
	
	@FindBy(xpath="//span[text()='Use Paytm QR Code to Login']")
	WebElement LoginPayTMSingInUseQRCode;

	public WebElement getLoginPayTMBenefits() {
		return loginPayTMBenefits;
	}

	public WebElement getLoginPayTMFastAndSecureText() {
		return LoginPayTMFastAndSecureText;
	}

	public WebElement getLoginPayTMUtilityBillCheckText() {
		return LoginPayTMUtilityBillCheckText;
	}

	public WebElement getLoginPayTMMerchantNetworkText() {
		return LoginPayTMMerchantNetworkText;
	}

	public WebElement getLoginPayTMAmazingDealsText() {
		return LoginPayTMAmazingDealsText;
	}

	public WebElement getLoginPayTMQRCodeCheck() {
		return LoginPayTMQRCodeCheck;
	}

	public WebElement getLoginPayTMOpenPayTMApp() {
		return LoginPayTMOpenPayTMApp;
	}

	public WebElement getLoginPayTMLearnMore() {
		return LoginPayTMLearnMore;
	}

	public WebElement getLoginPayTMAppImg() {
		return LoginPayTMAppImg;
	}

	public WebElement getLoginPayTMwithMobileNumberLink() {
		return LoginPayTMwithMobileNumberLink;
	}

	public WebElement getLoginPayTMCloseButton() {
		return LoginPayTMCloseButton;
	}

	public WebElement getLoginPayTMSingIn() {
		return LoginPayTMSingIn;
	}

	public WebElement getLoginPayTMSingInMobileNumber() {
		return LoginPayTMSingInMobileNumber;
	}

	public WebElement getLoginPayTMSingInPassword() {
		return LoginPayTMSingInPassword;
	}

	public WebElement getLoginPayTMSignInForgotPassword() {
		return LoginPayTMSignInForgotPassword;
	}

	public WebElement getLoginPayTMSingInOtherLoginIssues() {
		return LoginPayTMSingInOtherLoginIssues;
	}

	public WebElement getLoginPayTMSingInSecurely() {
		return LoginPayTMSingInSecurely;
	}

	public WebElement getLoginPayTMSingInTermsAndConditions() {
		return LoginPayTMSingInTermsAndConditions;
	}

	public WebElement getLoginPayTMSingInPrivacyPolicy() {
		return LoginPayTMSingInPrivacyPolicy;
	}

	public WebElement getLoginPayTMSingInUseQRCode() {
		return LoginPayTMSingInUseQRCode;
	}
	
	
}
