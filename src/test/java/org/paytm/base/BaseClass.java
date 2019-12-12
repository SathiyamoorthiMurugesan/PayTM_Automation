package org.paytm.base;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	public static WebDriver driver;
	String browser;
	String url;
	Properties prop;
	String screenshot_path;
	
	
	@BeforeSuite
	public void startUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromerdriver.exe");
		driver = new ChromeDriver();
		//browserSelection();
	}
	
/*	@Test
	public void openWebSite() throws Exception {
		elemenToBeClicked(driver.findElement(By.linkText("Mobile Prepaid")));
		takeScreenshot();
	}*/
	
	@AfterSuite 
	public void tearDown() {
		driver.quit();
	}
	
	public void elemenToBeClicked(WebElement clickEle) {
		clickEle.click();
	}
	
	public void propertyReader() throws Exception {
		FileReader reader = new FileReader("config.properties");
		 prop = new Properties();
		prop.load(reader);
	}
	
	public void browserSelection() throws Exception {
		propertyReader();
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromerdriver.exe");
			driver = new ChromeDriver();
			
		case "firefox":
			System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		//return driver;
		
	}	
	public void takeScreenshot() throws Exception {
		screenshot_path = prop.getProperty("screeshot_path");
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File file = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(screenshot_path+""+dateformat.format(date)+".png"));
	}
	
	
	
	public void textToBeSent(WebElement sendText, String Text) { 
		sendText.sendKeys(Text);
	}
	
	public void titleOfThePage() {
		driver.getTitle();
	}
	
	public void getPageSource() {
		driver.getPageSource();
	}
	
	public void getSingleWindowHandle() {
		driver.getWindowHandle();
	}
	
	public void getAllWindowHandles() {
		driver.getWindowHandles();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
