package dsalgo_stepdefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import dsalgoPOM.LoginInpage;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoLoginInpage extends DriverManager {
	
	public  LoginInpage login= new  LoginInpage(driver);

	
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
	   login.clicksign_in();
	}

	@When("The user clicks login button after leaving the <username> textbox and <password> textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_username_textbox_and_password_textbox_blank() {
		login.clicklogin();
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox2(String string) {
	    login.verifyContextMessage();
	}

	@Given("user is on the DS Algo Sign in Page")
	public void user_is_on_the_ds_algo_sign_in_page2() {
	   login.clicksign_in();
	}

@And("^The user clicks login button after entering the (.*) and leaves (.*) textbox blank$")
	public void the_user_clicks_login_button_after_entering_the_abschallengers_and_leaves_textbox_blank(String userName, String password) {
	
		login.enterUserName(userName);
	login.clicklogin();
		
	}

	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String string) {
	 String contextmsg=  login.verifyContextMessage1();
	 System.out.println(contextmsg);
	   Assert.assertEquals(contextmsg, string);
	}

	@Given("user is on  DS Algo Sign in Page")
	public void user_is_on_ds_algo_sign_in_page3() {
	    login.clicksign_in();
	}

	@When("^The user clicks login button after entering the (.*) only$")
	public void the_user_clicks_login_button_after_entering_the_numpyninja17_only(String passWord) {
		login.enterPassWord(passWord);
		login.clicklogin();
	   }
	@Then("The error message {string} appears below username textbox")
	public void the_error_message_appears_below_username_textbox(String string) {
	  login.verifyContextMessage();
	}

	@Given("user lands on DS Algo Sign in page")
	public void user_lands_on_ds_algo_dign_in_page() {
		login.clicksign_in();
	    }

	@When("^The user clicks login button after entering invalid (.*) and invalid (.*)$")
	public void the_user_clicks_login_button_after_entering_invalid_abs_and_invalid_numpy17(String UserName,String PassWord) {
		login.enterUserNamePassWrd(UserName, PassWord);
		login.clicklogin();
	   
	}

	@Then("The error message {string}. appears below Username textbox")
	public void the_error_message_appears_below_username_textbox1(String string) {
		login.AlertMsg();
	    
	}

	@Given("The  user land on DS Algo Sign in page")
	public void the_user_lands_on_ds_algo_dign_in_page() {
	    login.clicksign_in();
	}

	@When("^The user clicks login button after entering valid (.*)and valid (.*)$")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password(String UserName, String PassWord ) {
		login.ValidenterUserNamePassWrd(UserName, PassWord);
		login.clicklogin();
	}

	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_land_in_data_structure_home_page() {
	    login.validatemessage();
	  
	}




}
