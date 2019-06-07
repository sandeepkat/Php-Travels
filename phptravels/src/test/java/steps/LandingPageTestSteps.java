package steps;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LandingPage;
import utils.Browser;

public class LandingPageTestSteps {

	private LandingPage landing_page = new LandingPage();
	
	@Given("^user is navigated to Landing Page$")
	 public void user_navigated_to_landing_page() throws TimeoutException{
		landing_page.navigateToPhpLandingPage(); 
	 }
	
	@When("^user clicks on My account drop down button$")
	public void user_click_on_myaccount_drop_down_button() throws TimeoutException {
		landing_page.myAccountElm.click();
	}
	
	@When("^the user clicks on login button of landing page$")
	public void user_click_on_login_button_of_landing_page() throws TimeoutException {
		landing_page.loginOptionElm.click();
	}
	
	@Then("^user is landed on the Login page$")
	public void user_landed_on_login_page() throws TimeoutException {
		String title = Browser.getDriver().getTitle();
		Assert.assertEquals("Login", title);
	}
	
}
