package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import dsalgo_webdriver_manager.DriverManager;

public class HomePage extends DriverManager{
      
	By home_msg = By.xpath("//div[@class='content']/p");
	By startBtn = By.xpath("//button[@class='btn']");
	private String msg;
    
 public HomePage()
 {
	 	 	 
 }
 
 public String getmessage()
 {	
	return msg = driver.findElement(home_msg).getText();	 
 }
 public void clickButton()
 {
	 driver.findElement(startBtn).click(); 
 }
 public String getTitle()
 {
	 return driver.getTitle();
 }
 

}
