package dsalgo_stepdefinition;

import java.util.List;

import dsalgoPOM.ArrayPage;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoArrayPage extends DriverManager {
	
	ArrayPage arraypage=new ArrayPage(driver);
	@Given("User is on Dalgo homepage  and verify the page title <rowNumber>")
	public void user_is_on_dalgo_homepage_and_verify_the_page_title_row_number() {
	    arraypage.getpageTitle();
	}

	@When("The user clicks  Get Started button below the array")
	public void the_user_clicks_get_started_button_below_the_array() {
	   arraypage.clickArraygetStartedBtn();
	}

	@Then("The user should be redirected to the Array Page verify the pagetitle <rowNumber>")
	public void the_user_should_be_redirected_to_the_array_page_verify_the_pagetitle_row_number() {
	   arraypage.getarraytitle();
	}

	@Then("The links should be displayed under topics covered")
	public void the_links_should_be_displayed_under_topics_covered(DataTable dataTable) {
		arraypage.validatingLinks();
	}

	@Given("User is on Arrays in python page and verify the pagetitle <rowNumber>")
	public void user_is_on_arrays_in_python_page_and_verify_the_pagetitle_row_number() {
		 arraypage.arrayInpython();
	}

	@When("The user clicks Try Here button of Array in Python Page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_array_in_python_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	    arraypage.tryHerebtn();
	    
	}

	@And("The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message\"NameError: name 'hello' is not defined on line 1\" in alert window")
	public void the_user_write_the_invalid_code_in_editor_and_click_run_button_and_the_user_should_able_to_see_an_error_message_name_error_name_is_not_defined_on_line_in_alert_window(String string, Integer int1) {
	    
	}

	@Then("The user write the valid code in Editor and click run button and the user should able to see output in the console")
	public void the_user_write_the_valid_code_in_editor_and_click_run_button_and_the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Arrays using list  page  and verify the pagetitle <rowNumber>")
	public void user_is_on_arrays_using_list_page_and_verify_the_pagetitle_row_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button of Array using list  Page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_array_using_list_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on  Basic operations in list  page  and verify the pagetitle <rowNumber>")
	public void user_is_on_basic_operations_in_list_page_and_verify_the_pagetitle_row_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button of Basic operations in list Page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_basic_operations_in_list_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message\"NameError: name 'hello' is not defined on line 1\" in alert window")
	public void the_user_write_the_invalid_code_in_editor_and_click_run_button_and_the_user_should_able_to_see_an_error_message_in_alert_window(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on  Applications of array page  and verify the pagetitle <rowNumber>")
	public void user_is_on_applications_of_array_page_and_verify_the_pagetitle_row_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button of  Applications of array page and the user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_clicks_try_here_button_of_applications_of_array_page_and_the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message\"NameError: name 'hello' is not defined on line 1\" in alert window")
	public void The_user_write_the_invalid_code_in_editor_and_click_run_button_and_the_user_should_able_to_see_an_error_message_name_error_name_is_not_defined_on_line_in_alert_window(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks Practice questions biutton  and user should be navigated to {string}")
	public void user_clicks_practice_questions_biutton_and_user_should_be_navigated_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user verify the links")
	public void the_user_verify_the_links(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user verify the link Search the array and user should be navigated to {string}")
	public void the_user_verify_the_link_search_the_array_and_user_should_be_navigated_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user write the invalid code in Editor and click run button and the user should able to see an error message\"SyntaxError: bad input on line {int}\" in alert window")
	public void the_user_write_the_invalid_code_in_editor_and_click_run_button_and_the_user_should_able_to_see_an_error_message_syntax_error_bad_input_on_line_in_alert_window(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is verifying  the link Max consecutive Ones and user should be navigated to {string}")
	public void the_user_is_verifying_the_link_max_consecutive_ones_and_user_should_be_navigated_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is verifying the link Find Numbers With Even Numbers Of Digits and user should be navigated to {string}")
	public void the_user_is_verifying_the_link_find_numbers_with_even_numbers_of_digits_and_user_should_be_navigated_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is verifying the link Squares Of a Sorted Array and user should be navigated to {string}")
	public void the_user_is_verifying_the_link_squares_of_a_sorted_array_and_user_should_be_navigated_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





	 
}
