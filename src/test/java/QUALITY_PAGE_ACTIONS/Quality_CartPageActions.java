package QUALITY_PAGE_ACTIONS;

import org.testng.Assert;

import QUALITY_PAGE_LOCATORS.Quality_CartPageLocator;
import QUALITY_UTILITY.Quality_Base;
import QUALITY_UTILITY.Quality_Utility;

public class Quality_CartPageActions extends Quality_Base{
	Quality_CartPageLocator quality_CartPageLocator = new Quality_CartPageLocator();
	
	public void Verifyusercanadditemincart() throws Exception {
		
		Thread.sleep(5000);
		boolean cartVerification =  quality_CartPageLocator.CartVerify.isDisplayed();
		Assert.assertTrue(cartVerification);
		Quality_Utility.takeMyScreenshot(driver, "Cart Page");
	}

}
