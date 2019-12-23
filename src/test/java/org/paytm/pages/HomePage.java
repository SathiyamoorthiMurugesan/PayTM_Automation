package org.paytm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//img[@alt='MobileImg']")
	private WebElement HomePage_Play_Win;

	public WebElement getHomePage_Play_Win() {
		return HomePage_Play_Win;
	}

	
	
}
