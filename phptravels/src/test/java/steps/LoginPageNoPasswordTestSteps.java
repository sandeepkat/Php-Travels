package steps;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.PhpTravelsGlobal;

public class LoginPageNoPasswordTestSteps {

	private LoginPage login = new LoginPage();
	
	 @Given("^user is on Login Page$")
	 public void user_is_on_login_page()  throws TimeoutException {
		 login.navigateToLoginPage();
	 }
	
	 @When("^user enters valid username on login page and clicks on login button$")
	 public void user_enters_valid_username_and_no_password_click_on_login_button()  throws TimeoutException {
		 login.emailIdElm.sendKeys(PhpTravelsGlobal.USER_NAME);
		 login.logInButtonElm.click();
	 }

	 @Then("^user gets a invalid username or password message$")
	 public void user_gets_invalid_username_or_password_message()  throws TimeoutException {
		 String message = login.wrongCredentialsErrorMessageElm.getText();
		 Assert.assertEquals("Invalid Email or Password", message);
	 }
}
