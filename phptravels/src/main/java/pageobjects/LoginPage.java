package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Browser;

public class LoginPage extends PagesInitialization{

	/*
	 * Define a unique element of a page, useful to verify that the user is one
	 * login page
	 */

	public void navigateToLoginPage() {
		Browser.open(PhpTravelsGlobal.PHP_TRAVELS_LOGIN_URL);
	}

	@FindBy(css = "#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > div > div:nth-child(1) > input")
	public WebElement emailIdElm;
	    
	@FindBy(css = "#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > div > div:nth-child(2) > input")
	public WebElement passwordElm;
	
	@FindBy(id = "remember-me")
	public WebElement rememberMeElm;

	@FindBy(css = "form#loginfrm button")
	public WebElement logInButtonElm;
	
	@FindBy(css = "body > nav > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.navbar-right.hidden-sm.go-left > ul > li:nth-child(1) > a")
	public WebElement myAccountBtnElm;
	
	@FindBy(xpath = "//ul[2]/ul/li[1]/ul/li[2]/a[contains(text(),'Sign Up')]")
	public WebElement signUpBtnElm;
	
	@FindBy(css = "div.resultlogin > div")
	public WebElement wrongCredentialsErrorMessageElm;
	
}
