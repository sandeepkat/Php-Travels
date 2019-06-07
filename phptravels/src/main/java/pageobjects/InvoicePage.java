package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicePage extends PagesInitialization{
	
	/*
	 * Define a unique element of a page, useful to verify that the user is on InvoicePage
	 */

	@FindBy(xpath = "//*[@id='body-section']/div[1]/div[2]/div[2]/center/button[2]")
	public WebElement payNowBtnElm;
	
	@FindBy(xpath = "//*[@id='invoiceTable']/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")
	public WebElement invoiceElm;
	
	@FindBy(id = "downloadInvoice")
	public WebElement downloadInvoiceBtnElm;
	
	@FindBy(xpath = "/html/body/nav/div/div[1]/a/img")
	public WebElement homePageImageElm;
	
}
