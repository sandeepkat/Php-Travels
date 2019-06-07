package steps;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.PhpTravelsGlobal;
import utils.Browser;

public class HomePageTestSteps {
	
	private HomePage home_page = new HomePage();
	
	@Given("^user is navigated to home Page$")
	 public void user_navigated_to_home_page() throws TimeoutException{
		home_page.navigateToHomePage();		
	 }
	
	@When("^user clicks on hotels link on home page$")
	public void user_click_on_hotels_link_on_home_page() throws TimeoutException {
		home_page.hotelsTabOptionElm.click();
	}
	
	@When("^the user clicks on search by hotel or city name text field$")
	public void user_click_on_search_by_hotel_or_city_name_text_field() throws TimeoutException {
		home_page.cityOrHotelNameElm.click();
	}
	
	@When("^the user enters city name and selects the city name from dropdown$")
	public void user_enters_city_name_and_selects_from_dropdown() throws TimeoutException {
		home_page.cityOrHotelNameElm.sendKeys(PhpTravelsGlobal.CITY_NAME);
		home_page.specificHotelNameElm.click();
	}
	
	@When("^the user enters check in and check out dates$")
	public void user_enters_check_in_check_out_dates() throws TimeoutException {
		home_page.checkInDateElm.sendKeys(PhpTravelsGlobal.CHECKIN_DATE);
		home_page.checkOutDateElm.sendKeys(PhpTravelsGlobal.CHECKOUT_DATE);
	}
	
	@When("^the user enters personal count and clicks on search button$")
	public void user_enters_personal_count_and_clicks_search_button() throws TimeoutException {
		home_page.travelorsElm.click();
		home_page.adultMinusBtnElm.click();
		home_page.childPlusBtnElm.click();
		home_page.searchBtnElm.click();
	}
	
	@Then("^user is landed on the search list page$")
	public void user_landed_on_search_list_page() throws TimeoutException {
		String title = Browser.getDriver().getTitle();
		Assert.assertEquals("Search Results", title);
	}
}
