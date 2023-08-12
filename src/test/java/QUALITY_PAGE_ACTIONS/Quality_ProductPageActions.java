package QUALITY_PAGE_ACTIONS;

import QUALITY_PAGE_LOCATORS.Quality_ProductPageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_ProductPageActions extends Quality_Base {
	Quality_ProductPageLocator quality_ProductPageLocator = new Quality_ProductPageLocator();
	
	public void Clickaddtocart() {
		quality_ProductPageLocator.Q_AddToCartButton.click();	
		
	}
	public void ClickCartLink() throws Exception {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		quality_ProductPageLocator.Q_CartLink.click();
		
		
	}

}
