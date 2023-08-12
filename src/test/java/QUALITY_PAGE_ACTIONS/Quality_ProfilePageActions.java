package QUALITY_PAGE_ACTIONS;

import org.testng.Assert;

import QUALITY_PAGE_LOCATORS.Quality_ProfilePageLocator;
import QUALITY_UTILITY.Quality_Base;
import QUALITY_UTILITY.Quality_Utility;

public class Quality_ProfilePageActions extends Quality_Base{
	Quality_ProfilePageLocator quality_ProfilePageLocator = new Quality_ProfilePageLocator();
	public void Verifyusercanloginwithvalidcard() throws Exception {
		
		
		Thread.sleep(5000);
		boolean loginVrify=  quality_ProfilePageLocator.ProfileVerification.isDisplayed();
		Assert.assertTrue(loginVrify);
		Thread.sleep(5000);
		Quality_Utility.takeMyScreenshot(driver, "Profile Page");
		
	}
	

}
