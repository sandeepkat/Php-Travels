package steps;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.PhpTravelsGlobal;
import utils.Browser;

public class LoginPageValidInvalidPasswordTestSteps {
	
	private LoginPage login = new LoginPage();
	
	 @Given("^user is landed on Login Page$")
	 public void user_is_landed_on_login_page()  throws TimeoutException {
			 login.navigateToLoginPage();	 
	 }
	
	 @When("^user enters valid username and invalid password on login page$")
	 public void user_enters_valid_username_and_invalid_password()  throws TimeoutException {
		 Browser.sleep(1000);
		 login.emailIdElm.sendKeys(PhpTravelsGlobal.USER_NAME);
		 login.passwordElm.sendKeys(PhpTravelsGlobal.INVALID_PASSWORD);
	 }
	 
	 @When("^the user clicks sign in or login button$")
	 public void user_clicks_sign_in_or_login_button() throws TimeoutException {
	 login.logInButtonElm.click();
	 }
		
	 @Then("^user gets a invalid credential message$")
	 public void user_gets_invalid_credential_message() throws TimeoutException {
	 String message = login.wrongCredentialsErrorMessageElm.getText();
	 Assert.assertEquals("Invalid Email or Password", message);
	 }
}
