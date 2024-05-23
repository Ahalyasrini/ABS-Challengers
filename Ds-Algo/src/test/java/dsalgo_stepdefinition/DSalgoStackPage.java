package dsalgo_stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dsalgoPOM.StackPage;
import dsalgo_driver.BaseTest;
import dsalgo_utilities.ExcelReader;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoStackPage extends BaseTest{
	
	public StackPage stackPage;
	
	public DSalgoStackPage() {
		stackPage = new StackPage(getDriver());
	}

	

	@Given("The user is on homepage")
	public void the_user_is_on_homepage() {
	
//		DriverManager.initializeDriver();
//		navigateHome();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String expectedpageurl) {
			String actualpageurl = stackPage.getcurrentpage();
			System.out.println("actualpageurl is" + actualpageurl);
			Assert.assertEquals(actualpageurl, expectedpageurl);
		}
	

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String expectedpagename) {
	
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String argument) {
		stackPage.clickHyperLink(argument);
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		stackPage.clickRun();
	  
	}


	@Then("The user should have a button with text {string} on the page")
	public void the_user_should_have_a_run_button_on_the_page_to_test(String string1) {
		String buttonText = stackPage.getRunButton();
		System.out.println("buttonText is"+ buttonText);
		Assert.assertEquals(string1, buttonText);
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		stackPage.clickRun();
	  
	}
	
	
	@When("^The user enters Valid python (.*) in the text editor from the excel sheet (.*)$")
	public void user_enters_text_in_the_correct_formt_in_the_text_editor(String rowNumber,String SheetName) throws InterruptedException, IOException {	 
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String validtext = excelData.get(Integer.parseInt(rowNumber)).get("valid_text");
		System.out.println("validtext is "+ validtext);		
		stackPage.validatetexteditor1(validtext);
	}
	

	@When("clicks Run button")
	public void clicks_run_button() {
		stackPage.clickbutton();
	}

	@Then("user is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		String actualconsolemsg = stackPage.getconsolemsg();
		System.out.println("console msg:" + actualconsolemsg);
	
	}

	@When("^The user enters inValid python (.*) in the text editor from the excel sheet (.*)$")
	public void user_enters_text_in_the_text_editor(String rowNumber,String SheetName) throws IOException, InterruptedException {	 
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String invalidtext = excelData.get(Integer.parseInt(rowNumber)).get("invalid_text");
		System.out.println("invalidtext is "+ invalidtext);		
		stackPage.validatetexteditor1(invalidtext);
	}

	@Then("user is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window(String expectedpopupmsg) {
		String actualpopupmsg = stackPage.alertpopup();
		System.out.println(actualpopupmsg);
		Assert.assertEquals(actualpopupmsg, expectedpopupmsg);
	   
	}

	@Given("The user is on the editor page with Alert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
	  
	}

	@When("The user click ok button in the alert window")
	public void the_user_click_ok_button_in_the_alert_window() {
		stackPage.clickAlertButton();
			
	}

	@Then("the user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
		
	   
	}
	
	@Then("The user navigates back")
	public void The_user_navigates_back() {
		stackPage.navigateback();
	}

	 @Then("The user clears the text editor screen")
	 public void The_user_clears_the_text_editor_screen() {
		 stackPage.cleartextarea();
	 }

	
	
}
