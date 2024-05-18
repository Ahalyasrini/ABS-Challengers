package dsalgo_stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import dsalgoPOM.GetStartedPage;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoGetStartedPage extends DriverManager
{
//	WebDriver driver = initializeDriver();
	public DSalgoGetStartedPage() {
		
	}
	
public GetStartedPage getStartedPage = new GetStartedPage(driver);
public WebElement dropdown;


	@Given("User is on the Get Started Page")
	public void user_is_on_the_get_started_page() {
		getStartedPage.getpageTitle();
	}

	
	@Then("User clicks on Data Structures dropddown and validates all the <options> in  pane")
	public void user_should_see_the_list_of_six_options_in_data_structures_dropdown_pane(DataTable data) {
	
		List<String> options = data.asList();
		for(String option : options) {
			getStartedPage.clickDropdown().click();		
			getStartedPage.selectDropDownValue(option);
			getStartedPage.validateAlertMessage();
			getStartedPage.refreshPage();
		}
	}
	
	@Given("user is on the Get Started Page")
	public void user_is_on_the_Get_started_page() {
		getStartedPage.getpageTitle();
	}
	
	 @When("User clicks on Get Started button of any Data Structures section and verify the error message \"You are not logged in\"")
	public void user_clicks_on_get_started_button_of_any_data_structures_section() {
    	
    	getStartedPage.datastructureGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
		getStartedPage.refreshPage();
    	getStartedPage.arrayGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
		getStartedPage.refreshPage();
    	getStartedPage.linkedlistGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
		getStartedPage.refreshPage();
    	getStartedPage.stackGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
		getStartedPage.refreshPage();
    	getStartedPage.queueGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
		getStartedPage.refreshPage();
    	getStartedPage.treeGetStartedClick().click();
    	getStartedPage.validateAlertMessage();
	//	getStartedPage.refreshPage();
    	
    	
	   
	}

	
}
