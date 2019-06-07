package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PagesInitialization{
	
	/*
	 * Define a unique element of a page, useful to verify that the user is on
	 * search result page
	 */
	
	@FindBy(css = "div.col-md-9.col-xs-12 > div.row > div > table > tbody > tr")
	public List<WebElement> searchResultsList;
	
	@FindBy(css = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > div:nth-child(1) > div > span > span")
	public WebElement filterBtnElm;
	
	@FindBy(xpath ="//*[contains(text(),' Star Grade ')]")
	public WebElement searchFilterDropDown;
	
	@FindBy(xpath = "//*[@id='body-section']/div[5]/div/div[3]/div[1]/div/table/tbody/tr[3]/td/div[2]/div/h4/a/b")
	public WebElement hotelSelectTxtElm;
}
