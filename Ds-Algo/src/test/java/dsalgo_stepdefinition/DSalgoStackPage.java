package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgoPOM.StackPage;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoStackPage extends DriverManager{
	
	//WebDriver driver = WebDriverFactory.getDriver();
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	StackPage stackPage = new StackPage();
	
	
	
	@Given("The user is on homepage")
	public void the_user_is_on_homepage() {
	
		DriverManager.initializeDriver();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	   
	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String argument) {
		stackPage.clickHyperLink(argument);
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		
		stackPage.clickRun();
	  
	}


	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	  
	}
	
	@When("The user writes Valid python {string}")
	public void the_user_writes_valid_python(String string2) {
		stackPage.ValidCode();
		stackPage.runnCode();
	   
	}

	@When("clicks Run button")
	public void clicks_run_button() {
		stackPage.clickbutt();
	}

	@Then("user is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
	
	}

	@When("The user writes invalid python {string}")
	public void the_user_writes_invalid_python(String string1) {
		stackPage.inputCode();
		stackPage.runnCode();
	   
	}

	@Then("user is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
	   
	}

	@Given("The user is on the editor page with Alert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
	  
	}

	@When("The user click ok button in the alert window")
	public void the_user_click_ok_button_in_the_alert_window() {

	}

	@Then("the user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
	   
	}


	
	
}
