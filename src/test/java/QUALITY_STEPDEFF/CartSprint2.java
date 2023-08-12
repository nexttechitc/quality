package QUALITY_STEPDEFF;

import QUALITY_PAGE_ACTIONS.Quality_CartPageActions;
import QUALITY_PAGE_ACTIONS.Quality_HomePageActions;
import QUALITY_PAGE_ACTIONS.Quality_ProductPageActions;
import QUALITY_UTILITY.Quality_Base;
import cucumber.api.java.en.Then;

public class CartSprint2 extends Quality_Base{
	Quality_CartPageActions quality_CartPageActions = new Quality_CartPageActions();
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_ProductPageActions quality_ProductPageActions = new Quality_ProductPageActions();
	
	@Then("^Click Samsung GalaxyS(\\d+)$")
	public void click_Samsung_GalaxyS(int arg1) throws Throwable {
		quality_HomePageActions.ClickSamsungGalaxyS6(); 
	}
	
	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		quality_ProductPageActions.Clickaddtocart();
	}

	@Then("^Click Cart Link$")
	public void click_Cart_Link() throws Throwable {
		quality_ProductPageActions.ClickCartLink();
	}

	@Then("^Verify user can add item in cart$")
	public void verify_user_can_add_item_in_cart() throws Throwable {
		quality_CartPageActions.Verifyusercanadditemincart();
	}


}
