package steps;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.PhpTravelsGlobal;
import utils.Browser;

public class LoginPageTestSteps{
	
	private LoginPage login = new LoginPage();
	
	@Given("^user is navigated to Login Page$")
	 public void user_navigated_to_login_page()  throws TimeoutException {
		login.navigateToLoginPage();
	 }
	
	 @When("^user enters username and password on login page$")
	 public void user_enters_username_and_password()  throws TimeoutException {
		 login.emailIdElm.sendKeys(PhpTravelsGlobal.USER_NAME);
		 login.passwordElm.sendKeys(PhpTravelsGlobal.PASSWORD);
	 }
	 
	 @When("^the user clicks on login button$")
	 public void user_clicks_on_login_button()  throws TimeoutException {
		 login.logInButtonElm.click();
		// Browser.sleep(8000);
	 }
		
	 @Then("^user is landed on the home page$")
	 public void user_landed_on_home_page()  throws TimeoutException {
		 String title = Browser.getDriver().getTitle();
		 Assert.assertEquals("My Account", title);
	 }
	 
}