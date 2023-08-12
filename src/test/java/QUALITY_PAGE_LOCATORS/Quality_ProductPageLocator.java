package QUALITY_PAGE_LOCATORS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

public class Quality_ProductPageLocator extends Quality_Base{
	
	public Quality_ProductPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath  = "//a[text()= 'Add to cart']")
	public WebElement Q_AddToCartButton;
	
	@FindBy(id   = "cartur")
	public WebElement Q_CartLink;
	
	

}
