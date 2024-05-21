package dsalgo_stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;

import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoRegisterPage extends BaseTest {
	
//	RegisterPage registerPage = new RegisterPage();
//	public HomePage homepage;
//	ExcelReader excelreader = new ExcelReader();
	
	public RegisterPage registerPage;
	public HomePage homepage;
	public ExcelReader excelreader;
	
	public DSalgoRegisterPage() {
		registerPage = new RegisterPage(getDriver());
		homepage = new HomePage(getDriver());
		excelreader = new ExcelReader();
		System.out.println(getDriver() + " driver instance for parallel execution in DSalgoRegisterPage");
	}
	
	@Given("The User opens Register Page")
	public void the_user_opens_register_page() {
//		DriverManager.initializeDriver();
		System.out.println(url);
		registerPage.registerPageUrl( url);
//		
	}

	@When("The User clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
		registerPage.clickRegisterButton();
		
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
	   registerPage.verifyUserNameError(string);
	}


	@When("The User clicks {string} button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) {
		String userName = "numpy";
		String password= "ninja";
		String confirmPassword = "selenium";
		registerPage.setUserName(userName);
		registerPage.setpassword(password);
		registerPage.setConfirmPassword(confirmPassword);
		registerPage.clickRegisterButton(); 
	}

	@Then("The User should able to see an pwd warning message {string}")
	public void the_user_should_able_to_see_an_pwd_warning_message(String string) {
		 registerPage.verifyErrorMessage(string);
	   
	}
	
	//@When("^User enters valid (.+) (.+) (.+) and clicks Register button$")
	//public void user_enters_valid_username_password_confirm_password_and_clicks_register_button(String string1,String string2,String string3) throws IOException {
	
	@When("User enters valid username, password,confirm_password and clicks Register button from row {int}")
	public void user_enters_valid_username_password_confirm_password_and_clicks_register_button_from_row(Integer int1) throws IOException {
	   int randomNumber;
		Random random = new Random();
		randomNumber = random.nextInt(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheet();
		    String username = excelData.get(int1).get("username");
	        System.out.println("username is "+ username);
	        String password = excelData.get(int1).get("password");
	        System.out.println("password is "+ password);
	        String confirm_password = excelData.get(int1).get("confirm_password");
	         System.out.println("confirm_password is "+ confirm_password);
	
	    
	    registerPage.setUserName(username + randomNumber);
		registerPage.setpassword(password + randomNumber);
		registerPage.setConfirmPassword(confirm_password + randomNumber);
		registerPage.clickRegisterButton(); 
	}


	
	@Then("The User should be redirected to HomePage of DS_Algo")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo() {
//		homepage = new HomePage();
		
	}
	
	@Then("The User should able to see successful message {string}  on the DS_Algo HomePage")
	public void the_user_should_able_to_see_successful_message_on_the_ds_algo_home_page(String string) {
		System.out.println(homepage.RegisterSuccess());
		Assert.assertTrue(homepage.RegisterSuccess().contains(string));
	   
	}

	@Then("user clicks on signout")
	public void user_clicks_on_signout() {
		registerPage.clickSignOut();
	}



}
