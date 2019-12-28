package org.paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.paytm.base.BaseClass;

public class PayTMWallet extends BaseClass{
	
	@FindBy(className="_2fJJr _26XlN")
	WebElement PayTMWallet;
	
	@FindBy(xpath="(//*[@href=\"/paytmwallet\"])[1]")
	WebElement PayTMWalletAddMoney;
	
	@FindBy(xpath="(//*[@href=\"/paytmwallet\"])[2]")
	WebElement PayTMWalletPassbook;
	
	@FindBy(xpath="href=\"/redeemcash\"")
	WebElement PayTMWalletRedeemVoucher;

	public WebElement getPayTMWallet() {
		return PayTMWallet;
	}

	public WebElement getPayTMWalletAddMoney() {
		return PayTMWalletAddMoney;
	}

	public WebElement getPayTMWalletPassbook() {
		return PayTMWalletPassbook;
	}

	public WebElement getPayTMWalletRedeemVoucher() {
		return PayTMWalletRedeemVoucher;
	}

}
