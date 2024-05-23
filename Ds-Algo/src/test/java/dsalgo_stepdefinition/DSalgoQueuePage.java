package dsalgo_stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import dsalgoPOM.QueuePage;
import dsalgo_driver.BaseTest;
import dsalgo_utilities.ExcelReader;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoQueuePage extends BaseTest{
	
	public QueuePage queuePage ;

	public DSalgoQueuePage() {
		queuePage = new QueuePage(getDriver());
	}
	
	@Given("The user is on the homepage")
	public void the_user_is_on_the_homepage() {
//		DriverManager.initializeDriver();
//		navigateHome();
	}

	@When("User clicks on {string} link")
	public void User_clicks_on_link(String argument) {
		queuePage.clickHyperLink(argument);
	}

	@Then("User should be navigate to {string} page")
	public void User_should_be_navigate_to_page(String expectedpageurl) {
		String actualpageurl = queuePage.getcurrentpage();
		System.out.println("actualpageurl is" + actualpageurl);
		Assert.assertEquals(actualpageurl, expectedpageurl);
	}
	

	@Given("User is on the {string} page")
	public void User_is_on_the_page(String string) {
	   
	}

	@Then("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		queuePage.clickRun();
	   
	}


	@When("^User enters inValid python (.+) in the text editor from the excel sheet (.+)$")
	public void user_enters_in_valid_python_in_the_text_editor_from_the_excel_sheet(int rowNumber,String SheetName) throws IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String invalidtext = excelData.get(rowNumber).get("invalid_text");
		System.out.println("invalidtext is "+ invalidtext);		
		queuePage.validatetexteditor1(invalidtext);
	 
	}

	@When("clicks on Run button")
	public void clicks_on_Run_button() {
		 queuePage.clickbutton(); 
	}

	@Then("The user is able to see the error msg in pop up window")
	public void the_user_is_able_to_see_the_error_msg_in_pop_up_window(String expectedpopupmsg) {
		String actualpopupmsg = queuePage.alertpopup();
		System.out.println(actualpopupmsg);
		Assert.assertEquals(actualpopupmsg, expectedpopupmsg);
	}

	@Then("User click ok button in the alert window")
	public void user_click_ok_button_in_the_alert_window() {
		queuePage.clickAlertButton();
	}

	@Then("user clears the text editor screen")
	public void user_clears_the_text_editor_screen() {
		queuePage.cleartextarea();
	}

	
	@When("^User enters Valid python (.+) in the text editor from the excel sheet (.+)$")
	public void user_enters_valid_python_in_the_text_editor_from_the_excel_sheetr(int rowNumber,String SheetName) throws InterruptedException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String validtext = excelData.get(rowNumber).get("valid_text");
		System.out.println("validtext is "+ validtext);		
		queuePage.validatetexteditor1(validtext);
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		String actualconsolemsg = queuePage.getconsolemsg();
		System.out.println("console msg:" + actualconsolemsg);
	}

	@Then("User navigates back")
	public void user_navigates_back() {
		queuePage.navigateback();
	}

	
}
