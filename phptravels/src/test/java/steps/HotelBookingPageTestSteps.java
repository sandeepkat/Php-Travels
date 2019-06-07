package steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.HotelBookingPage;
import pageobjects.InvoicePage;
import pageobjects.PersonalDetailsPage;
import pageobjects.PhpTravelsGlobal;
import pageobjects.SearchResultPage;
import utils.Browser;

public class HotelBookingPageTestSteps {
	
	private HomePage home_page = new HomePage();
	private HotelBookingPage hotel_booking_page = new HotelBookingPage();
	private SearchResultPage search_result_page = new SearchResultPage();
	private PersonalDetailsPage personal_details_page = new PersonalDetailsPage();
	private InvoicePage invoice_page = new InvoicePage();
	
	@Given("^user is landed on home Page$")
	 public void user_landed_on_home_page() throws TimeoutException{
		home_page.navigateToHomePage();		
	 }
	
	@When("^the user clicks hotels link on the home page$")
	public void the_user_click_on_hotels_link_on_home_page() throws TimeoutException {
		home_page.hotelsTabOptionElm.click();
	}
	
	@When("^the user enters search details and clicks on search button$")
	public void the_user_enters_search_details_and_clicks_search_button() throws TimeoutException {
		home_page.cityOrHotelNameElm.click();
		home_page.cityOrHotelNameElm.sendKeys(PhpTravelsGlobal.CITY_NAME);
		home_page.specificHotelNameElm.click();
		home_page.checkInDateElm.sendKeys(PhpTravelsGlobal.CHECKIN_DATE);
		home_page.checkOutDateElm.sendKeys(PhpTravelsGlobal.CHECKOUT_DATE);
		home_page.travelorsElm.click();
		home_page.adultMinusBtnElm.click();
		home_page.childPlusBtnElm.click();
		home_page.searchBtnElm.click();
	}
	
	@When("^the user provides hotel selection and clicks on Book now button$")
	public void the_user_provides_hotel_selection_clicks_book_now_button() throws TimeoutException {
		search_result_page.hotelSelectTxtElm.click();
		WebDriver driver = Browser.getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)");
		hotel_booking_page.juniorSuitsSltElm.click();
		hotel_booking_page.bookNowBtnElm.click();
		Browser.sleep(1000);
	}
	
	@When("^user enters personal details and clicks on confirm booking button$")
	public void the_user_enters_personal_details_clicks_confirm_booking_button() throws TimeoutException {
//		personal_details_page.firstNameTxtElm.sendKeys(PhpTravelsGlobal.FIRST_NAME);
//		personal_details_page.lastNameTxtElm.sendKeys(PhpTravelsGlobal.LAST_NAME);
//		personal_details_page.emailTxtElm.sendKeys(PhpTravelsGlobal.EMAIL);
//		personal_details_page.emailConfirmTxtElm.sendKeys(PhpTravelsGlobal.EMAIL);
//		personal_details_page.countryElm.click();
//		personal_details_page.countryElm.sendKeys(PhpTravelsGlobal.COUNTRY_NAME);
//		personal_details_page.countrySpecificElm.click();
		WebDriver driver = Browser.getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", personal_details_page.confirmBookingBtnElm);
		personal_details_page.confirmBookingBtnElm.click();
	}
	
	@Then("^user is on invoice page and navigates to home page$")
	public void the_user_on_invoice_page_and_navigates_to_home_page() throws TimeoutException {
		Boolean element = invoice_page.payNowBtnElm.isDisplayed();
		Assert.assertEquals(true, element);
		invoice_page.homePageImageElm.click();
	}
}
