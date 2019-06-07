package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.TimeoutException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends Global{
	private static Browser browser;
	private static WebDriver driver;
	
	public static Browser getBrowser() {
		return browser;
	}
	
	public static void setBrowser(Browser browser) {
		Browser.browser = browser;
	}
	
	public void setDriver(WebDriver driver) {
		Browser.driver = driver;
		Browser.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	/*
	 * This method will return the driver if exists else by default returns chrome Driver
	 * 
	 */
	public static WebDriver getDriver() {
		if (driver == null) {
			setBrowser(new Browser(Global.CHROME));
			driver.manage ().timeouts().pageLoadTimeout(Global.DEFAULT_IMPLICIT_WAIT, TimeUnit.SECONDS);
		}
		
		return driver;
	}

	public Browser(String browserType) {
		
		switch (browserType) {
		case Global.CHROME:
			WebDriverManager.chromedriver().setup();			
			this.setDriver(new ChromeDriver());
			break;	
		case Global.INTERNET_EXPLORER:
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			this.setDriver(new InternetExplorerDriver(options));
			break;
		case Global.FIREFOX:			
			WebDriverManager.firefoxdriver().setup();
			this.setDriver(new FirefoxDriver());
			break;
		case "":
			return;
		}
	}
	
	public static void open(String url) throws TimeoutException {
//		driver.manage ().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		getDriver().get(url);	
	}

	/*
	 * This method gives time for the browser to sleep
	 * 
	 */
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * This method is useful to find whether element exists on the page within given time
	 * 
	 */
//	public static boolean elementExists(By by, int seconds) {
//		try {
//			(new WebDriverWait(getDriver(), seconds)).until(ExpectedConditions.visibilityOfElementLocated((by)));
//			return true;
//		} catch (TimeoutException ignored) {
//		}
//		return false;
//	}
}
