package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends PagesInitialization {

	@FindBy(xpath = "//*[@id='guestform']/div[1]/div[2]/input")
	public WebElement firstNameTxtElm;
	
	@FindBy(xpath = "//*[@id='guestform']/div[1]/div[3]/input")
	public WebElement lastNameTxtElm;
	
	@FindBy(xpath = "//*[@id='guestform']/div[2]/div[2]/input")
	public WebElement emailTxtElm;
	
	@FindBy(xpath = "//*[@id='guestform']/div[2]/div[3]/input")
	public WebElement emailConfirmTxtElm;

	@FindBy(xpath = "//*[@id='guestform']/div[3]/div[2]/input")
	public WebElement contactTxtElm;
	
	@FindBy(xpath = "//*[@id='s2id_autogen1']/a")
	public WebElement countryElm;
	
	@FindBy(xpath = "//*[@id='select2-drop']/ul/li/div")
	public WebElement countrySpecificElm;
	
	@FindBy(xpath = "//*[@id='body-section']/div/div/div[1]/div/div[1]/div[2]/div[4]/button")
	public WebElement confirmBookingBtnElm;
		
}
