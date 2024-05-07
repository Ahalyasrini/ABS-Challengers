package dsalgoPOM;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_utilities.BaseClass;
import dsalgo_webdriver_manager.DriverManager;

public class StackPage extends BaseClass {
	
   


	By stackGetStarted = By.xpath("//a[@href='stack']");
	By operationsInStack = By.xpath("//a[@href='operations-in-stack']");
	By implementation = By.xpath("//a[@href='implementation']");
	By stackApplications = By.xpath("//a[@href='stack-applications']");
	
	
	public void clickHyperLink(String argument) {
		if(argument.equals("Get Started")) {
		     
		     driver.findElement(stackGetStarted).click();
		}
			else if(argument.equals("Operations in Stack")){
				
				 driver.findElement(operationsInStack).click();
			}
			else if(argument.equals("Implementation")){
				 
				 driver.findElement(implementation).click();
			}
			else if(argument.equals("Applications")){
				 
				 driver.findElement(stackApplications).click();
		    }
			else if(argument.equals("Practice Questions")){
				 
			}
		
	}


	public void clickRun() {
		driver.findElement(trybuttonWE).click();
	}


	public void inputCode() {
		driver.findElement(editTextArea).sendKeys("hello");
		
	}


	public void runnCode() {
		driver.findElement(runItButtonWE).click();
		
	}


	public void ValidCode() {
		//driver.findElement(editTextArea).sendKeys(key.print"hello");
		
	}


	public void clickbutt() {
		driver.findElement(runItButtonWE).click();
		
	}
	
	


}
