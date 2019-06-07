package pageobjects;

import org.openqa.selenium.support.PageFactory;

import utils.Browser;

public abstract class PagesInitialization {

	public PagesInitialization()
	{
		PageFactory.initElements(Browser.getDriver(), this);
	}
}
