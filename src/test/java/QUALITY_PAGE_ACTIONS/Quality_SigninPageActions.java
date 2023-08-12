package QUALITY_PAGE_ACTIONS;

import QUALITY_PAGE_LOCATORS.Quality_SigninPageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_SigninPageActions extends Quality_Base{
	Quality_SigninPageLocator quality_SigninPageLocator = new Quality_SigninPageLocator();
	
	public void Quality_UserCard(String u, String p) {
		quality_SigninPageLocator.UserName.sendKeys(u);
		quality_SigninPageLocator.Password.sendKeys(p);
		quality_SigninPageLocator.SigninButton2.click();
	
	
	}
	

}
