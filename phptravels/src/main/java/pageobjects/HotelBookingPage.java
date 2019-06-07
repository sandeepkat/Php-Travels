package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelBookingPage extends PagesInitialization {
	
	/*
	 * Define a unique element of a page, useful to verify that the user is on HotelBookingPage
	 */
	
	@FindBy(xpath = "//*[@id='ROOMS']/div/button")
	public WebElement bookNowBtnElm;
	
	@FindBy(xpath = "//*[@id='ROOMS']/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div")
	public WebElement tripleRoomsSltElm;
	
	@FindBy(xpath = "//*[@id='ROOMS']/div/table/tbody/tr[2]/td/div[2]/div[2]/div/div[3]/div/label/div")
	public WebElement juniorSuitsSltElm;
	
}
