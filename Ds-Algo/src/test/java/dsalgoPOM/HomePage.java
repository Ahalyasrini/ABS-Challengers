package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dsalgo_webdriver_manager.DriverManager;

public class HomePage{
	private WebDriver driver;    
	By home_msg = By.xpath("//div[@class='content']/p");
	By startBtn = By.xpath("//button[@class='btn']");
	private String msg;
    
 public HomePage(WebDriver driver)
 {
	 this.driver=driver;
	 	 
 }
 
 public void goTo()
 {
//	 driver.get("https://dsportalapp.herokuapp.com/");
	 driver.get(DriverManager.url);
 }
 
 public String LoadPage()
 {	
	return msg = driver.findElement(home_msg).getText();
	
	 
 }
 public WebElement clickButton()
 {
	return driver.findElement(startBtn); 
 }
 public String getTitle()
 {
	 return driver.getTitle();
 }
 

}