package org.paytm.testcases;

import org.paytm.base.BaseClass;
import org.paytm.base.MainClass;
import org.testng.annotations.Test;

public class PostPaidTest extends BaseClass{
	MainClass mc;
	
	@Test
	public void postPaid_page_verification() throws Exception {
		mc=new MainClass();
		mc.verify_PostPaidPage_texts();
	}
	

}
