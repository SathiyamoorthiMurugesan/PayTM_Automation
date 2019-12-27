package org.paytm.testcases;

import org.paytm.base.BaseClass;
import org.paytm.base.MainClass;
import org.testng.annotations.Test;

public class PrePaid extends BaseClass{
	MainClass mc;
@Test
	public void prepaid_recharge() {
	mc =  new MainClass();
		mc.MobilePrepaid_recharge();   
	}
@Test
	public void homepage_playAndWin() {
	mc =  new MainClass();
		mc.HomePage_playWin();
	}

}

