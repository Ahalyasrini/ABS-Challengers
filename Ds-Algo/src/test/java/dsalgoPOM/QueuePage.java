package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_commonlibraries.CommonLibraries;
import dsalgo_webdriver_manager.DriverManager;

public class QueuePage {
	
	WebDriver driver = DriverManager.getDriver();
	
	By queueGetStarted = By.xpath("//a[@href='queue']");
	By implementationofQinPython = By.xpath("//a[@href='implementation-lists']");
	By implementationCollections = By.xpath("//a[@href='implementation-collections']");
	By implementationArray = By.xpath("//a[@href='Implementation-array']");
	By queueOperations = By.xpath("//a[@href='QueueOp']");
	By practicequestions = By.xpath("//a[@href='/queue/practice']");
	protected By trybuttonWE = By.linkText("Try here>>>");
	By formPageWE= By.id("answer_form");
	By queuepageWE = By.xpath("//h4[@class='bg-secondary text-white']");
	By queuePageWE1 = By.xpath("//p[@class='bg-secondary text-white']");
	By texteditorarea = By.xpath("//div//pre[@class='CodeMirror-line-like']/span");
	By txteditorarea_1 = By.xpath("//form[@id='answer_form']//pre[@class=' CodeMirror-line ']/span/span");
	By tryhere_btn = By.xpath("//a[@href='/tryEditor']");
	protected By editTextArea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By runItButtonWE =By.xpath("//button[@onclick=\"runit()\"]");
	By consolemsg = By.xpath("//*[@id='output']");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	Alert alert;
	WebElement txtarea;
	
	
	
	

	
	public void clickHyperLink(String argument) {
		if(argument.equals("Get Started")) {
		     
		     driver.findElement(queueGetStarted).click();
		}
			else if(argument.equals("Implementation of Queue in Python")){
				
				 driver.findElement(implementationofQinPython).click();
			}
			else if(argument.equals("Implementation using collections.deque")){
				 
				 driver.findElement(implementationCollections).click();
			}
			else if(argument.equals("Implementation using array")){
				 
				 driver.findElement(implementationArray).click();
		    }
			else if(argument.equals("Queue Operations")){
				 
				 driver.findElement(queueOperations).click();
		    }
		   else if(argument.equals("Practice Questions")){
				
				driver.findElement(practicequestions).click();
			}
		
	}


	public void clickRun() {
		
		
		driver.findElement(trybuttonWE).click();
	}
	
	public String getTryButtonText() {
		return driver.findElement(trybuttonWE).getText();
	}

	public void clickbutton() {
		driver.findElement(runItButtonWE).click();
		
	}


	public void validatetexteditor1(String validtext) throws InterruptedException 
		{
			Thread.sleep(1000);
			txtarea = driver.switchTo().activeElement();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtarea).click().perform();
			txtarea.sendKeys(validtext);
						
		}
	
	public String alertpopup()
	{
	    alert = driver.switchTo().alert();
		String alertmsg = driver.switchTo().alert().getText();			
		return alertmsg;
	}


	public void navigateback() {
		
		driver.navigate().back();
		
	}

	public void cleartextarea()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		CommonLibraries.TextIndentation(driver, txtarea, 0,0 , false);
		txtarea.sendKeys(Keys.CONTROL + "a");
		txtarea.sendKeys(Keys.DELETE);
	
	}


	public String getconsolemsg() {
		
		return driver.findElement(consolemsg).getText();
	}


	public String getcurrentpage() {
		 return(driver.getCurrentUrl());
	}


	public String queuepagename(String argument) {
		
		if(argument.equals("Queue")) {
		   return(driver.findElement(queuepageWE).getText());	
		 }
		else if(argument.equals("Implementation of Queue in Python")) {
			return(driver.findElement(queuePageWE1).getText());
		}
		else if(argument.equals("tryEditor")) {
			return(driver.findElement(tryhere_btn).getText());
		}
		else if(argument.equals("Implementation using collections.deque")) {
			return(driver.findElement(queuePageWE1).getText());
		}
		else if(argument.equals("Implementation using array")) {
			return(driver.findElement(queuePageWE1).getText());
		}
		else if(argument.equals("Queue Operations")) {
			return(driver.findElement(queuePageWE1).getText());
		}
		
		

		return null;

		
	}


	public String getRunButton() {
		return driver.findElement(runItButtonWE).getText();
		
	}


	public void clickAlertButton() {
		
		driver.switchTo().alert().dismiss();
	}
	
	
	
}
