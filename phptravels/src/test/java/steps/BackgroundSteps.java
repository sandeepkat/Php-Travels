package steps;

import org.openqa.selenium.NoSuchElementException;
import cucumber.api.java.Before;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.PhpTravelsGlobal;
import utils.Browser;

public class BackgroundSteps {

	@Before("@Login")	
	public void loginToPHPTravels() {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		
		// Check for Logout or signup button	
		try {
				if (homePage.myAccountBtnElm.isDisplayed()) {
				}
		
		    } catch (NoSuchElementException ex) {	
				Browser.open(PhpTravelsGlobal.PHP_TRAVELS_LOGIN_URL);
				loginPage.emailIdElm.sendKeys(PhpTravelsGlobal.USER_NAME);
				loginPage.passwordElm.sendKeys(PhpTravelsGlobal.PASSWORD);	
				loginPage.logInButtonElm.click();
		    }
}
	
	@Before("@CheckForUserLogin")
	public void checkUserIsLoggedIn() {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		
		if (homePage.myAccountBtnElm.isDisplayed()) {
				homePage.myAccountBtnElm.click();
		}
		
		// Check for Logout or signup button	
		try {
			if (homePage.myAccountLogoutBtnElm.isDisplayed()) {
				homePage.myAccountLogoutBtnElm.click();	
			}
			
			} catch (NoSuchElementException ne) {
				loginPage.myAccountBtnElm.click();
			}
		} 
} 
		
