package dsalgo_stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import dsalgoPOM.GraphPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoGraphPage extends DriverManager{
	
	GraphPage graphPage = new GraphPage();
	


	@When("User clicks {string} link")
	public void user_clicks_link(String argument) {
		graphPage.clickHyperLink(argument);
	}

	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_page(String expectedpageurl) {
		String actualpageurl = graphPage.getcurrentpage();
		System.out.println("actualpageurl is" + actualpageurl);
		Assert.assertEquals(actualpageurl, expectedpageurl);
	   
	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) {
	   
	}

	@Then("User clicks {string} button")
	public void user_clicks_button(String string) {
		graphPage.clickRun();
	}

	@When("^User enters inValid python (.+) in text editor from the excel sheet (.+)$")
	public void user_enters_in_valid_python_in_text_editor_from_the_excel_sheet(int rowNumber,String SheetName) throws IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String invalidtext = excelData.get(rowNumber).get("invalid_text");
		System.out.println("invalidtext is "+ invalidtext);		
		graphPage.validatetexteditor1(invalidtext);
	}

	@When("clicks on the Run button")
	public void clicks_on_the_run_button() {
		graphPage.clickbutton(); 
	}

	@Then("The user is able to see error msg in pop up window")
	public void the_user_is_able_to_see_error_msg_in_pop_up_window(String expectedpopupmsg) {
		String actualpopupmsg = graphPage.alertpopup();
		System.out.println(actualpopupmsg);
		Assert.assertEquals(actualpopupmsg, expectedpopupmsg);
	}

	@Then("User click ok button in alert window")
	public void user_click_ok_button_in_alert_window() {
		graphPage.clickAlertButton();
	}

	@Then("user clears text editor screen")
	public void user_clears_text_editor_screen() {
		graphPage.cleartextarea();
	}

	@When("^User enters Valid python (.+) in text editor from the excel sheet (.+)$")
	public void user_enters_valid_python_in_text_editor_from_the_excel_sheet(int rowNumber,String SheetName) throws IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String validtext = excelData.get(rowNumber).get("valid_text");
		System.out.println("validtext is "+ validtext);		
		graphPage.validatetexteditor1(validtext);
	}

	@Then("User is able to see output in console")
	public void user_is_able_to_see_output_in_console() {
		String actualconsolemsg = graphPage.getconsolemsg();
		System.out.println("console msg:" + actualconsolemsg);
	}

	@Then("The User navigates back")
	public void the_user_navigates_back() {
		graphPage.navigateback();
	}
	
	@Then("The user clicks on signout")
	public void the_user_clicks_on_signout() {
		graphPage.clickSignOut();
		System.out.println("logged out successful");
	}


}
