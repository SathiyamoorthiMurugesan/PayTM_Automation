package org.paytm.base;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass{
	public static WebDriver driver;
	public static String browser;
	public static String url;
	public static Properties prop;
	public static String screenshot_path;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest (alwaysRun = true)
	public  static void initiateReport() {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		reporter = new ExtentHtmlReporter("C://Users//sathy//git//repository2//POMPattern//Reports//MyReport"+dateformat.format(date)+".html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
/*	@BeforeMethod (alwaysRun = true)
	public static void beforeMethod() {
		logger = extent.createTest("PayTM Report"); 
		}
*/	
	@AfterTest(alwaysRun= true)
	public static void closeReport() {
		extent.flush();
	}
			
	@BeforeSuite
	public void browserSelection() throws Exception {
		reporter = new ExtentHtmlReporter("myreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		propertyReader();
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromergetDriver().exe");
			driver = new ChromeDriver();
			
		case "firefox":
			System.setProperty("webdriver.firefox.marionette", "C:\\geckogetDriver().exe");
			driver = new FirefoxDriver();
		}
		logger = extent.createTest("Browser selection and Launching");
		logger.info("Browser and url completed");
		logger.pass("browser launched");
		maximizeWindow();
		implicitWait();
		loadURL();
		}
	

	@AfterSuite 
	public void tearDown() {
		getDriver().quit();
	}
	
	
	public void propertyReader() throws Exception {
		FileReader reader = new FileReader("config.properties");
		 prop = new Properties();
		prop.load(reader);
	}
	
	
	public void takeScreenshot() throws Exception {
		screenshot_path = prop.getProperty("screeshot_path");
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File file = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(screenshot_path+""+dateformat.format(date)+".png"));
	}
	
	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}
	
	public void makeFullScreen() {
		getDriver().manage().window().fullscreen();
	}
		
	public void deleteAllCookies() {
		getDriver().manage().deleteAllCookies();
	}
	
	public void getWindowSize() {
		System.out.println(getDriver().manage().window().getSize());
	}
	
	public void getWindowPosition() {
		System.out.println(getDriver().manage().window().getPosition());
	}
	
	public void setWindowSize() {
		getDriver().manage().window().setSize(new Dimension(300,500));
	}
	
	public void setWindowPosition() {
		getDriver().manage().window().setPosition(new Point(50,200));
	}
	
	public void getPositionX() {
		getDriver().manage().window().getPosition().getX();
	}
	
	public void getPositionY() {
		getDriver().manage().window().getPosition().getY();
	}

	public void getWindowHeight() {
		getDriver().manage().window().getSize().getHeight();
	}
	
	public void getWindowWidth() {
		getDriver().manage().window().getSize().getWidth();
	}
	
	public void textToBeSent(WebElement sendText, String Text) { 
		sendText.sendKeys(Text);
	}

	public void clearText(WebElement clear) {
		clear.click();
	}
	
	public String getAttributeofElement (WebElement getAttribute, String Text) {
		return getAttribute.getAttribute(Text);
	}
	
	public void elemenToBeClicked(WebElement clickElement) {
		clickElement.click();
	}
	
	public void titleOfThePage() {
		System.out.println(getDriver().getTitle());
		logger.info("Title of the page is: "+getDriver().getTitle());
	}
	
	public void currentTitle() {
		System.out.println(getDriver().getCurrentUrl());
		logger.info("The Current URL is: "+getDriver().getCurrentUrl());
	}
	
	public void navigateForward() {
		getDriver().navigate().forward();
	}
	
	public void navigateBack() {
		getDriver().navigate().back();
	}
	
	public void closeCurrentWindow() {
		getDriver().close();
	}
	
	public void loadURL() {
		getDriver().get(url);
	}
	
	public void getPageSource() {
		getDriver().getPageSource();
	}
	
	public void currentWindowHandle() {
		getDriver().getWindowHandle();
	}
	
	public void getAllWindowHandles() {
		getDriver().getWindowHandles();
	}
	
	public void implicitWait() {
		getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWaitTime")), TimeUnit.SECONDS);
	}
	
	public void ClickElementWait(WebElement WaitClickElement) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Integer.parseInt(prop.getProperty("explicitWaitTime")));
		wait.until(ExpectedConditions.elementToBeClickable(WaitClickElement));
	}
	
	public void SelectElementWait(WebElement WaitSelectElement) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Integer.parseInt(prop.getProperty("explicitWaitTime")));
		wait.until(ExpectedConditions.elementToBeSelected(WaitSelectElement));
	}
	
	public void AlertPresentWait() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Integer.parseInt(prop.getProperty("explicitWaitTime")));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void switchWindow() {
		String parentWindow = getDriver().getWindowHandle();
		Set<String> allWindowHandles =getDriver().getWindowHandles();
	 for(String eachwindow: allWindowHandles) {
		 if(parentWindow.equalsIgnoreCase(eachwindow))
		 getDriver().switchTo().window(eachwindow);
	 }
	}
	
	public void switchToLastWindow() {
		Set<String> allWindowHandles =getDriver().getWindowHandles();
	 for(String eachwindow: allWindowHandles) {
		 getDriver().switchTo().window(eachwindow);
	 }
	}
	
	public void acceptAlert() {
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() {
		Alert alert = getDriver().switchTo().alert();
		alert.dismiss();
	}
	
	public void sendTextToAlert(String text) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(text);
	}
	
	public void selectByIndex(WebElement byIndex, int indexnumber) {
		Select dropdown = new Select(byIndex);
		dropdown.selectByIndex(indexnumber);
	}
	
	public void selectByValue(WebElement byIndex, String value) {
		Select dropdown = new Select(byIndex);
		dropdown.selectByValue(value);
	}
	
	public void selectByVisibleText(WebElement byIndex, String VisibleText) {
		Select dropdown = new Select(byIndex);
		dropdown.selectByVisibleText(VisibleText);
	}
	
	public void deselectByIndex(WebElement byIndex, int indexnumber) {
		Select dropdown = new Select(byIndex);
		dropdown.deselectByIndex(indexnumber);
	}
	
	public void deselectByValue(WebElement byIndex, String value) {
		Select dropdown = new Select(byIndex);
		dropdown.deselectByValue(value);
	}
	
	public void deselectByVisibleText(WebElement byIndex, String VisibleText) {
		Select dropdown = new Select(byIndex);
		dropdown.deselectByVisibleText(VisibleText);
	}
	
	public void getAllDropDownOptions(WebElement allOptions) {
		Select dropdown = new Select(allOptions);
		List<WebElement> options = dropdown.getOptions();
			for(WebElement eachOptions: options) {
				System.out.println(eachOptions.getText());
			}
	}
	
	public void deselectAll(WebElement byIndex) {
		Select dropdown = new Select(byIndex);
		dropdown.deselectAll();
	}
	
	public void getAllselected(WebElement byIndex) {
		Select dropdown = new Select(byIndex);
		List<WebElement>allSelected =dropdown.getAllSelectedOptions();
			for(WebElement eachSelected:allSelected) {
				System.out.println(eachSelected);
			}
	}
	
	public void mouseHover(WebElement mouseHoverElement) {
		Actions action = new Actions(getDriver());
		action.moveToElement(mouseHoverElement).build().perform();
	}
	
	public void mouseHoverClick(WebElement mouseClickElement) {
		Actions action = new Actions(getDriver());
		action.moveToElement(mouseClickElement).build().perform();
	}
	
	public void doubleClick(WebElement doubleClickElement) {
		Actions action = new Actions(getDriver());
		action.doubleClick(doubleClickElement).perform();
	}
	
	public void rightClick(WebElement rightClickElement) {
		Actions action = new Actions(getDriver());
		action.contextClick(rightClickElement).perform();
//		action.clickAndHold(rightClickElement);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}