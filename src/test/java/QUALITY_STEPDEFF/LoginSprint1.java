package QUALITY_STEPDEFF;

import QUALITY_PAGE_ACTIONS.Quality_HomePageActions;
import QUALITY_PAGE_ACTIONS.Quality_ProfilePageActions;
import QUALITY_PAGE_ACTIONS.Quality_SignUpPageActions;
import QUALITY_PAGE_ACTIONS.Quality_SigninPageActions;

import QUALITY_UTILITY.Quality_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSprint1 extends Quality_Base{
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_SignUpPageActions quality_SignUpPageActions = new Quality_SignUpPageActions();
	Quality_ProfilePageActions quality_ProfilePageActions = new Quality_ProfilePageActions();
	Quality_SigninPageActions quality_SigninPageActions = new Quality_SigninPageActions();
	
	
	
	@Given("^Open \"([^\"]*)\" Application$")
	public void open_Application(String URL) throws Throwable {
		QualityLuanchingURL(URL);
	}

	@Then("^Click SignUp Link$")
	public void click_SignUp_Link() throws Throwable {
		quality_HomePageActions.ClickSignUpLink();
	}

	@Then("^Enter username Password$")
	public void enter_username_Password() throws Throwable {
		quality_SignUpPageActions.EnterusernamePassword();
	}

	@Then("^Click SignUP button$")
	public void click_SignUP_button() throws Throwable {
		quality_SignUpPageActions.ClickSignUPbutton();
	}

	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		quality_HomePageActions.ClickLoginLink();
	}

	@Then("^Enter user Password$")
	public void enter_user_Password() throws Throwable {
		quality_SigninPageActions.Quality_UserCard(QPro.getProperty("QUserName1"), QPro.getProperty("QPassword1"));
	    
	}

	
	@Then("^Verify user can login with valid card$")
	public void verify_user_can_login_with_valid_card() throws Throwable {
		quality_ProfilePageActions.Verifyusercanloginwithvalidcard();
	}


	
}
