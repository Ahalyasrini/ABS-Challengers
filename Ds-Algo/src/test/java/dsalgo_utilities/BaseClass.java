package dsalgo_utilities;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_webdriver_manager.DriverManager;

public class BaseClass extends DriverManager {
	
	//WebDriver driver = WebDriverFactory.getDriver();
   //wait = new WebDriverWait(driver,Duration.ofSeconds(6));
	
	//By submitLoginWE = By.xpath("//input[@type='submit']");
	protected By trybuttonWE = By.linkText("Try here>>>");
	By formPageWE= By.id("answer_form");
	protected By editTextArea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By runItButtonWE =By.xpath("//button[@onclick=\"runit()\"]");
	//By userNameWE = By.name("username");
	//By passwordWE = By.name("password");
	
	private static Logger logger = LogManager.getLogger(BaseClass.class);
	
	
	
	

}
