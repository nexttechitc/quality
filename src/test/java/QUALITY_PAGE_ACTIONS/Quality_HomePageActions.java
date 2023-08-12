package QUALITY_PAGE_ACTIONS;

import QUALITY_PAGE_LOCATORS.Quality_HomePageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_HomePageActions extends Quality_Base{
	Quality_HomePageLocator quality_HomePageLocator = new Quality_HomePageLocator();
	
	public void ClickSignUpLink() {
		quality_HomePageLocator.SignUPLink.click();
		
	}
	public void ClickLoginLink() {
		
		quality_HomePageLocator.Q_LoginLink.click();
		
	}
	public void ClickSamsungGalaxyS6() {
		
		quality_HomePageLocator.Q_Samsung6Phone.click();
		
	}
	
	

}
