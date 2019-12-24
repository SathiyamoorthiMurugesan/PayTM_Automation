package org.paytm.extentReport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest (alwaysRun = true)
	public  static void initiateReport() {
		reporter = new ExtentHtmlReporter("C:\\Users\\sathy\\git\\repository2\\POMPattern\\Reports\\myreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	
	
	@AfterTest(alwaysRun= true)
	public static void closeReport() {
		extent.flush();
	}
	
}
