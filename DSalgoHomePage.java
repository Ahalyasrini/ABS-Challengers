package dsalgo_stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dsalgoPOM.HomePage;
import dsalgo_commonlibraries.CommonLibraries;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;

public class DSalgoHomePage extends DriverManager{	
    HomePage homepage = new HomePage() ;
	String landingpageMsg;
	String homepageTitle;
	WebElement getstartedBtn;

	@Given("The user should open the browser and enters the DS_Algo Portal")
	public void open_the_browser()
	{
		DriverManager.initializeDriver();
		}	
	@Then("The user should be landed on the DS_Algo Get Started page with message {string}")
	public void the_user_should_be_landed_on_the_ds_algo_get_started_page_with_message(String expectedmsg){
	
		String landingpageMsg = homepage.getmessage();
		System.out.println(landingpageMsg);
		Assert.assertEquals(landingpageMsg, expectedmsg);
	}

	@When("User clicks on get started button")
	public void user_clicks_on_get_started_button() {
		homepage.clickButton();
	}

	@Then("User should be landed on the data structure page with title {string}")
	public void user_should_be_landed_on_the_data_structure_page(String expectedpageTitle) {
		homepageTitle=homepage.getTitle();
		System.out.println(homepageTitle);
		Assert.assertEquals(homepageTitle, expectedpageTitle);
	    //Log.info("Title of the homepage:"+homepageTitle+ "and"+expectedpageTitle);
	}

}
