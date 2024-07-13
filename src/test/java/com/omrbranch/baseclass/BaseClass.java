package com.omrbranch.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	Select select;
	Actions actions;
	Navigation navigate;
	static Alert alert;
	
	public byte[] screenshot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}
	
	public String getProjectPath() {
		return System.getProperty("user.dir");
	}
	
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
		String value=(String) properties.get(key);
		return value;
	}
	
	public static void browserLaunch(String browserType) {
		switch(browserType) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firfox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
		
	}
	
	public void robotEnterKey(WebElement element) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
	}
	
	public void elementMosuseOverActions(WebElement element) {
		actions = new Actions(driver);
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			actions.moveToElement(element).perform();
		}
	}

	public void elementDragAndDrop(WebElement sourceElement, WebElement destElement) {
		visibilityOfElement(destElement);
		visibilityOfElement(sourceElement);
		if (elementIsDisplayed(destElement) && elementIsDisplayed(sourceElement)) {

			actions = new Actions(driver);
			actions.dragAndDrop(sourceElement, destElement).perform();
		}
	}

	public void elementContextClick(WebElement element) {
		actions = new Actions(driver);
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			actions.contextClick(element).perform();
		}

	}

	public void elementDoubleClick(WebElement element) {
		actions = new Actions(driver);
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			actions.doubleClick().perform();
		}
	}

	public void elementClear(WebElement element) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			element.clear();
		}
	}

	public void screenshot(String sName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AM\\screenshots\\" + sName + ".png"));
	}

	public void screenshot(WebElement element, String sName) throws IOException {
		File f = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AM\\screenshots\\" + sName + ".png"));
	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void implictWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	public static void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void selectOptionByText(WebElement element, String text) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByValue(WebElement element, String text) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByValue(text);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByIndex(index);
	}

	public List<String> dropdownGetAllOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		List<String> allOPtionsText = new ArrayList<>();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			allOPtionsText.add(text);

		}
		return allOPtionsText;
	}

	public String dropDownFirstSelectedOption(WebElement element) {
		visibilityOfElement(element);
		select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}

	public boolean dropDownIsMultiSelect(WebElement element) {
		visibilityOfElement(element);
		select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}

	public boolean elementIsDisplayed(WebElement element) {
		visibilityOfElement(element);
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean elementIsEnabled(WebElement element) {
		visibilityOfElement(element);
		boolean displayed = element.isEnabled();
		return displayed;
	}

	public boolean elementIsSelected(WebElement element) {
		visibilityOfElement(element);
		boolean selected = element.isSelected();
		return selected;
	}

	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.sendKeys(data);
		}
	}

	public void elementSendKeysEnter(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.sendKeys(data, Keys.ENTER);
		}
	}

	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.click();
		}
	}

	public void elementJavaScriptClick(WebElement element) {
		visibilityOfElement(element);
		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}
	}

	public void elementJavaScriptScrolIntoView(WebElement element) {
		visibilityOfElement(element);
		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
	}

	public WebElement findLocatorBycssSelector(String attributeValue) {
		WebElement element = driver.findElement(By.cssSelector(attributeValue));
		return element;
	}
		
		public List<WebElement> findLocatorElements(String attributeValue) {
			List<WebElement> element = driver.findElements(By.xpath(attributeValue));
			return element;
		}

	public String elementGetText(WebElement element) {
		visibilityOfElement(element);
		String text = "";

		if (elementIsDisplayed(element)) {
			text = element.getText();
		}
		return text;
	}
	
//	public List<WebElement> findLocatorByElements(String attributevalue) {
//		List<WebElement> element = driver.findElements(By.xpath(attributeValue));
//		return element;
//	}

	// 99% value is fixed
	public String elementGetAttribute(WebElement element) {
		visibilityOfElement(element);
		String attribute = "";
		if (elementIsDisplayed(element)) {
			attribute = element.getAttribute("value");
		}
		return attribute;
	}

	// 1% value is NOT fixed
	public String elementGetAttribute(WebElement element, String attributename) {
		visibilityOfElement(element);
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	public void natigateRefresh() {
		navigate.refresh();
	}

	public static void closeCurrentWindow() {
		driver.close();
	}

	public static void swithFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void swithFrameByName(String val) {
		driver.switchTo().frame(val);
	}

	public static void swithFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static void closeAllWindow() {
		driver.quit();
	}

	public List<String> findLocatorselementsList(String xpath) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		List<String> allList=new ArrayList<>();
		for(WebElement element:elements) {
			String text = element.getText();
			allList.add(text);
			
		}
		return allList;

	}
	
	
	public static void clickOkInAlert() {
		alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public static void clickCancelAlert() {
		alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
