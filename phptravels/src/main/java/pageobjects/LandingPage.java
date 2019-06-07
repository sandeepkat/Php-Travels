package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Browser;

public class LandingPage extends PagesInitialization {
	
	/*
	 * Define a unique element of a page, useful to verify that the user is one
	 * landing page
	 */

	public void navigateToPhpLandingPage() {
		Browser.open(PhpTravelsGlobal.PHP_TRAVELS_LANDING_URL);
	}

	@FindBy(css = "ul.nav.navbar-nav.go-right > li:nth-child(1) > a")
	public WebElement blogElm;
	
	@FindBy(css = "ul.nav.navbar-nav.go-right > li:nth-child(2) > a")
	public WebElement offersElm;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")
	public WebElement myAccountElm;
	    
	@FindBy(css = "div.collapse.navbar-collapse li#li_myaccount > ul > li:nth-child(1) > a")
	public WebElement loginOptionElm;
	
	@FindBy(css = "#li_myaccount > ul > li:nth-child(2) > a")
	public WebElement signupOptionElm;
	
	@FindBy(css = "ul.nav.navbar-nav.navbar-right.hidden-sm.go-left > ul > ul > li")
	public WebElement languageOptionsElm;
	
	@FindBy(xpath = "//*[@id='body-section']/div[5]/div/div/h2")
	public WebElement landingPageTextElm;
			
}
