package org.paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.paytm.base.BaseClass;

public class MobilePostpaid extends BaseClass{
	
	@FindBy(xpath="//div[@class=\"qvWr\"]")
	WebElement PostPaidTitle;

	@FindBy(xpath="(//*[@id=\"app\"]//label)[2]")
	WebElement PostPaidRadioButton;
	
	@FindBy(xpath="//*[@type=\"tel\"]")
	WebElement PostPaidMobileNumber;
	
	@FindBy(xpath="(//*[@type=\"text\"])[1])")
	WebElement PostPaidProvider;
	
	@FindBy(xpath="(//*[@type=\"text\"])[1]")
	WebElement PostPaidAmount;
	
	@FindBy(className="_1nFl")
	WebElement PostPaidFastForward;

	public WebElement getPostPaidTitle() {
		return PostPaidTitle;
	}

	public WebElement getPostPaidRadioButton() {
		return PostPaidRadioButton;
	}

	public WebElement getPostPaidMobileNumber() {
		return PostPaidMobileNumber;
	}

	public WebElement getPostPaidProvider() {
		return PostPaidProvider;
	}

	public WebElement getPostPaidAmount() {
		return PostPaidAmount;
	}

	public WebElement getPostPaidFastForward() {
		return PostPaidFastForward;
	}

}
