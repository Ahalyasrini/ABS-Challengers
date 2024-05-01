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
import dsalgo_utilities.TestContextSetup;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;

public class DSalgoHomePage extends DriverManager {	
	
	
	
	public WebDriver driver;
	public HomePage homepage;
	String landingpageMsg;
	String homepageTitle;
	WebElement getstartedBtn;
	
	public DSalgoHomePage() {
		
	}
	
	@Given("The user should open the browser and enters the DS_Algo Portal")
	public void open_the_browser() throws IOException
	{
	homepage = LaunchApplication();		
	}	
	
	
	@Then("The user should be landed on the DS_Algo Get Started page with message")
	public void the_user_should_be_landed_on_the_ds_algo_get_started_page_with_message() throws IOException {
		homepage.LoadPage();
		System.out.println(homepage.LoadPage());
		
		Assert.assertTrue(homepage.LoadPage().contains("You are at the right place"));
		//Log.info("Message on the landing page:"+homepage.LoadPage());
		
	
	}

	@When("User clicks on get started button")
	public void user_clicks_on_get_started_button() {
		
		homepage.clickButton().click();
	}

	@Then("User should be landed on the data structure page with title {string}")
	public void user_should_be_landed_on_the_data_structure_page(String expectedpageTitle) {
		homepageTitle=homepage.getTitle();
		System.out.println(homepage.getTitle());
		Assert.assertTrue(homepageTitle.contains(expectedpageTitle));
//	    Log.info("Title of the homepage:"+homepageTitle+ "and"+expectedpageTitle);
	}

}