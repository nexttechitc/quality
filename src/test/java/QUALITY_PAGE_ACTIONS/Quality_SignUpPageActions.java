package QUALITY_PAGE_ACTIONS;

import QUALITY_PAGE_LOCATORS.Quality_SignUpPageLocator;
import QUALITY_TESTDATA.Quality_TestData;

public class Quality_SignUpPageActions extends Quality_ProductPageActions {
	Quality_SignUpPageLocator quality_SignUpPageLocator = new Quality_SignUpPageLocator();
	
	public void EnterusernamePassword() throws Exception {
		
		quality_SignUpPageLocator.Q_UserName.sendKeys(Quality_TestData.User5);
		Thread.sleep(3000);
		quality_SignUpPageLocator.Q_Passweord.sendKeys(Quality_TestData.Password5);
		
	}
	public void ClickSignUPbutton() throws Exception {
		quality_SignUpPageLocator.Q_SignUpButton.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
	}

}
