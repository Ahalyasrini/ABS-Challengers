package dsalgo_stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import dsalgoPOM.LinkedListPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoLinkedListPage extends DriverManager {
	LinkedListPage linkedlistPage=new LinkedListPage(threadDriver.get());
	
	
	@When("The user clicks  Get Started button below the LinkedList and verify pagetitle")
	public void the_user_clicks_get_started_button_below_the_linked_list() {
	   linkedlistPage.clicklinkedlistGetStartedBtn();
	   linkedlistPage.getLinkedListtitle();
	}

	@Then("validate LinkedListPage links")
	public void validate_linked_list_page_links(io.cucumber.datatable.DataTable dataTable) {
	  linkedlistPage.validatelinkedListLinks();
	}

	@Given("User is on Introduction page and verify the pagetitle")
	public void user_is_on_introduction_page_and_verify_the_pagetitle() {
		linkedlistPage.introductionbtn();
	    
	}

	@When("The user clicks Try Here button of Introduction  Page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_introduction_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		linkedlistPage.tryHere();
		String actualpageurl = linkedlistPage.getcurrentpage();
		Assert.assertEquals(actualpageurl, expectedurl);
	}
	    	

	@When("^The  user is on python editor and User write the invalid code in Editor (.*) and (.*) and click run button and the user should able to see an (.*) in alert window$")
	public void the_user_is_on_python_editor_and_user_write_the_invalid_code_in_editor_and_text_try_editor_and_click_run_button_and_the_user_should_able_to_see_an_name_error_name_is_not_defined_on_line_in_alert_window(Integer rowNumber, String sheetName,String expectedpopupmsg) throws IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(sheetName);
		String invalidtext = excelData.get(rowNumber).get("invalid_text");
		
		String validtext = excelData.get(rowNumber).get("valid_text");
		
		System.out.println("invalidtext is "+ invalidtext);		
		linkedlistPage.validateTextEditorBox(invalidtext);
		linkedlistPage.clickrun();
		String actualpopupmsg = linkedlistPage.alertpopup();
		System.out.println(actualpopupmsg);
		Assert.assertEquals(actualpopupmsg, expectedpopupmsg);
	     linkedlistPage.acceptalert();
	     linkedlistPage.cleartextarea();
	}
	

	@Then("^The User write the valid code in Editor (.*) and (.*) and click run button and the user should able to see output in the console$")
	public void the_user_write_the_valid_code_in_editor_and_text_try_editor_and_click_run_button_and_the_user_should_able_to_see_output_in_the_console(int rowNumber,String SheetName) throws InterruptedException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetFortexteditor(SheetName);
		String validtext = excelData.get(rowNumber).get("valid_text");
		System.out.println("validtext is "+ validtext);		
		linkedlistPage.validatetexteditor1(validtext);
		linkedlistPage.clickrun();
	
		String actualconsolemsg = linkedlistPage.getconsolemsg();
		System.out.println("console msg:" + actualconsolemsg);
		linkedlistPage.navigateback();
	}

	@Given("User is on Creating Linked List page and verify the pagetitle")
	public void user_is_on_creating_linked_list_page_and_verify_the_pagetitle() {
	  linkedlistPage.clickcreatelinkedlistbtn();
	}

	@When("The user clicks Try Here button of  Creating Linked List page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_creating_linked_list_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
	    linkedlistPage.tryHere();
	    String actualpageurl = linkedlistPage.getcurrentpage();
		Assert.assertEquals(actualpageurl, expectedurl);
	}

	@Given("User is on Types Of Linked List page and verify the pagetitle")
	public void user_is_on_types_of_linked_list_page_and_verify_the_pagetitle() {
		
	    	}

	@When("The user clicks Try Here button of Types Of Linked List  Page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_types_of_linked_list_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		 linkedlistPage.tryHere();
		    String actualpageurl = linkedlistPage.getcurrentpage();
			Assert.assertEquals(actualpageurl, expectedurl);
	}

	@Given("User is on Types Of Implement Linked List In Python page and verify the pagetitle")
	public void user_is_on_types_of_implement_linked_list_in_python_page_and_verify_the_pagetitle() {
		linkedlistPage.implementLinkedListbtn();
	   	}

	@When("The user clicks Try Here button of Implement Linked List In Python and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_implement_linked_list_in_python_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		 linkedlistPage.tryHere();
		    String actualpageurl = linkedlistPage.getcurrentpage();
			Assert.assertEquals(actualpageurl, expectedurl);
	
	}

	@Given("User is on Types Of Traversal page and verify the pagetitle")
	public void user_is_on_types_of_traversal_page_and_verify_the_pagetitle() {
	   linkedlistPage.traversalbtn();
	}

	@When("The user clicks Try Here button of Traversal page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_traversal_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		linkedlistPage.tryHere();
	    String actualpageurl = linkedlistPage.getcurrentpage();
		Assert.assertEquals(actualpageurl, expectedurl);
	}

	@Given("User is on Types Of Insertion page and verify the pagetitle")
	public void user_is_on_types_of_insertion_page_and_verify_the_pagetitle() {
	   linkedlistPage.insertionbtn();
	}

	@When("The user clicks Try Here button of Insertion page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_insertion_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		linkedlistPage.tryHere();
	    String actualpageurl = linkedlistPage.getcurrentpage();
		Assert.assertEquals(actualpageurl, expectedurl);
	}

	@Given("User is on Types Of Deletion page and verify the pagetitle")
	public void user_is_on_types_of_deletion_page_and_verify_the_pagetitle() {
		linkedlistPage.deletionbtn();
	   	}

	@When("The user clicks Try Here button of Deletion page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_deletion_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expectedurl) {
		linkedlistPage.tryHere();
	    String actualpageurl = linkedlistPage.getcurrentpage();
		Assert.assertEquals(actualpageurl, expectedurl);
	}
	
	@Given("User is on Types Of PractionQuestion page and verify the url{string}")
	public void method(String expectedurl) {
		linkedlistPage.clickpracticeQuestionbtn();
		 String actualpageurl = linkedlistPage.getcurrentpage();
			Assert.assertEquals(actualpageurl, expectedurl);
	}	
			
   @Then("User navigate back to DsalgohomePage")
   public void method2() {
	   linkedlistPage.navigatetohomePage();
			
	}

}
