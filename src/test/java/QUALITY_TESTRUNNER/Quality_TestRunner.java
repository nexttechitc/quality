package QUALITY_TESTRUNNER;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import QUALITY_UTILITY.Quality_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/QUALITY_FEATURES"},
plugin = {"json:target/cucumber.json"},// HTML report/test result 
glue = "QUALITY_STEPDEFF", tags = {"@Jahan4"})



public class Quality_TestRunner extends AbstractTestNGCucumberTests{
	
	
	@BeforeTest
	public void QualityStartURL() {
		Quality_Base startURL = new Quality_Base();
		startURL.Quality_Browser();
	}
	
	@AfterTest
	public void QualityCloseURL() {
		Quality_Base startURL = new Quality_Base();	
		startURL.driver.quit();
	}

}
