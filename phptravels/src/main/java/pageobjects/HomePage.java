package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Browser;

public class HomePage extends PagesInitialization{
	
	/*
	 * Define a unique element of a page, useful to verify that the user is on Home page
	 */

	public void navigateToHomePage() {
		Browser.open(PhpTravelsGlobal.PHP_TRAVELS_HOME_PAGE_URL);
	}

	@FindBy(css = "h3.RTL")
	public WebElement userNameElm;
	
	@FindBy(css = "div.collapse.navbar-collapse > ul.nav.navbar-nav.go-right > li:nth-child(1) > a")
	public WebElement hotelsTabOptionElm;

	@FindBy(css = "ul.nav.navbar-nav.go-right > li[data-title='flights'] > a")
	public WebElement flightsTabOptionElm;
	
	// Hotels Search options
	@FindBy(css = "#s2id_autogen3 > a")
	public WebElement cityOrHotelNameElm;
	
	@FindBy(css = "ul.select2-results > li > ul > li:nth-child(1)")
	public WebElement specificHotelNameElm;
	
	@FindBy(css = "input[class='form input-lg dpd1'][name='checkin']")
	public WebElement checkInDateElm;
	
	@FindBy(css = "div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(1)")
	public List<WebElement> variousCheckInDatesElm;
	
	@FindBy(css = "#dpd2 > div > input")
	public WebElement checkOutDateElm;
	
	@FindBy(id = "travellersInput")
	public WebElement travelorsElm;
	
	@FindBy(id = "adultPlusBtn")
	public WebElement adultPlusBtnElm;
	
	@FindBy(id = "adultMinusBtn")
	public WebElement adultMinusBtnElm;
	
	@FindBy(id = "childPlusBtn")
	public WebElement childPlusBtnElm;
	
	@FindBy(id = "childMinusBtn")
	public WebElement childMinusBtnElm;
	
	@FindBy(css = "#hotels > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button")
	public WebElement searchBtnElm;
	
	@FindBy(css = "body > nav > div > div.collapse.navbar-collapse > ul.nav.navbar-nav.navbar-right.hidden-sm.go-left > ul > li:nth-child(1) > a")
	public WebElement myAccountBtnElm;
	
	@FindBy(xpath = "//ul[2]/ul/li[1]/ul/li[2]/a[contains(text(),'Logout')]")
	public WebElement myAccountLogoutBtnElm;

}
