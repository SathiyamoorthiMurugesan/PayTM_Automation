package org.paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.paytm.base.BaseClass;

public class MobilePrepaid extends BaseClass{
	
	@FindBy(linkText="Mobile Prepaid") 
	WebElement Mobile_Prepaid_link;
	
	@FindBy(xpath="//input[@type='tel']") 
	WebElement MobileNumber_Prepaid;
	
	@FindBy(xpath="(//input[@type='text'])[1]") 
	WebElement Operator_Prepaid;
	
	@FindBy(xpath="(//input[@type='text'])[2]") 
	WebElement Amount_Prepaid;
	
	@FindBy(className="shPe") 
	WebElement FastForward_Prepaid;
	
	@FindBy(linkText="Proceed to Recharge") 
	WebElement Proceed_Prepaid;
	
	@FindBy(xpath="//label[text()=\"Circle\"]") 
	WebElement Circle_Prepaid;
	

	public WebElement getMobile_Prepaid_link() {
		return Mobile_Prepaid_link;
	}
	
	public WebElement getMobileNumber_Prepaid() {
		return MobileNumber_Prepaid;
	}
	
	public WebElement getOperator_Prepaid() {
		return Operator_Prepaid;
	}
	
	public WebElement getAmount_Prepaid() {
		return Amount_Prepaid;
	}
	
	public WebElement getFastForward_Prepaid() {
		return FastForward_Prepaid;
	}
	
	public WebElement getProceed_Prepaid() {
		return Proceed_Prepaid;
	}
	
	public WebElement getCircle_Prepaid() {
		return Circle_Prepaid;
	}
	
}
