package dsalgo_stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dsalgoPOM.HomePage;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class DSalgoHomePage extends DriverManager{	
	
	public class DSalgoHomePage extends BaseTest{	
		public HomePage homepage ;
		String landingpageMsg;
		String homepageTitle;
		WebElement getstartedBtn;

	public  DSalgoHomePage() {
		homepage = new HomePage(getDriver());
		System.out.println(getDriver() + " driver instance for parallel execution in DsalgoHomePage");
	}
	
	@Given("The user should open the browser and enters the DS_Algo Portal")
	public void open_the_browser()
	{
//		driverInitializer();
		}	
	@Then("The user should be landed on the DS_Algo Get Started page with message {string}")
	public void the_user_should_be_landed_on_the_ds_algo_get_started_page_with_message(String expectedmsg) {
//		homepage  = new HomePage(getDriver()) ;
		String landingpageMsg;
		try {
			landingpageMsg = homepage.getmessage();
			System.out.println(landingpageMsg);
			Assert.assertEquals(landingpageMsg, expectedmsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("User clicks on get started button")
	public void user_clicks_on_get_started_button() {
		homepage.clickButton();
	}

	@Then("User should be landed on the data structure page with title {string}")
	public void user_should_be_landed_on_the_data_structure_page(String expectedpageTitle) {
//		homepage  = new HomePage(getDriver()) ;
		homepageTitle=homepage.getTitle();
		System.out.println(homepageTitle);
		Assert.assertEquals(homepageTitle, expectedpageTitle);
	    //Log.info("Title of the homepage:"+homepageTitle+ "and"+expectedpageTitle);
	}

}
