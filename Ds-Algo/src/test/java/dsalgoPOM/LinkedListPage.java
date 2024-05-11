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

public class LinkedListPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	WebElement txtarea;
	Alert alert ;
	By GetStartedBtn=By.xpath("//a[@href=\"linked-list\"]");
	By LinkedlistTitle=By.xpath("//h4[@class=\"bg-secondary text-white\"]");
	By introduction=By.xpath("//a[@href=\"introduction\"]");
	By CreatingLinkedList=By.xpath("//a[@href=\"creating-linked-list\"]");
	By typesOfLinkedList =By.xpath("//a[@href=\"types-of-linked-list\"]");
	By implementLinkedList=By.xpath("//a[@href=\"implement-linked-list-in-python\"]");
	By traversal=By.xpath("//a[@href=\"traversal\"]");
	By insertion=By.xpath("//a[@href=\"insertion-in-linked-list\"]");
	By deletion=By.xpath("//a[@href=\"deletion-in-linked-list\"]");
	By tryherebtn=By.xpath("//a[@href=\"/tryEditor\"]");
	By editorbox=By.xpath("//div[@class=\"CodeMirror-scroll\"]");
	By txteditorarea_1 = By.xpath("//form[@id='answer_form']//pre[@class=' CodeMirror-line ']/span/span");
	By run_btn = By.xpath("//button[text()='Run']");
	By consolemsg = By.xpath("//*[@id='output']");
	By CreatingLinkedList1=By.xpath("//a[@href=\"/linked-list/creating-linked-list/\"]");
	By typesOfLinkedList1=By.xpath("//a[@href=\"/linked-list/types-of-linked-list/\"]");
	By implementLinkedList1=By.xpath("//a[@href=\"/linked-list/implement-linked-list-in-python/\"]");
	By traversal1=By.xpath("//a[@href=\"/linked-list/traversal/\"]");
	By insertion1=By.xpath("//a[@href=\"/linked-list/insertion-in-linked-list/\"]");
	By deletion1=By.xpath("//a[@href=\"/linked-list/deletion-in-linked-list/\"]");
	By practicequestion=By.xpath("//a[@href=\"/linked-list/practice\"]");
	By numpyninjabtn=By.xpath("//a[@class=\"navbar-brand\"]");
	By getstartedbtn1=By.xpath("//a[@href=\"/home\"]");
	
	public LinkedListPage(WebDriver driver) {
		this.driver=driver;
	}
  
	public void clicklinkedlistGetStartedBtn() {
		driver.findElement(GetStartedBtn).click();
	}
	public void getLinkedListtitle() {
		System.out.println(driver.findElement(LinkedlistTitle));
	}
	
	public void validatelinkedListLinks() {
		driver.findElement(introduction).click();
		driver.navigate().back();
		driver.findElement(CreatingLinkedList).click();
		driver.navigate().back();
		driver.findElement(typesOfLinkedList).click();
		driver.navigate().back();
		driver.findElement(implementLinkedList).click();
		driver.navigate().back();
		driver.findElement(traversal).click();
		driver.navigate().back();
		driver.findElement(insertion).click();
		driver.navigate().back();
		driver.findElement(deletion).click();
		driver.navigate().back();
		}
	public void introductionbtn() {
		driver.findElement(introduction).click();
		//System.out.println((driver.findElements(introduction)).get(1).getText().contains("Introduction"));
		
	}
	public void tryHere() {
		driver.findElement(tryherebtn).click();
	}
	public String getcurrentpage()
	{
		System.out.println(driver.getCurrentUrl());
		return(driver.getCurrentUrl());
	}
	public void validateTextEditorBox(String text) {
		txtarea = driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		txtarea.sendKeys(text);		
		}
	public void clickrun()
	{
		driver.findElement(run_btn).click();	
	}
	
	public String alertpopup() {
		 alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		return alert.getText();
	}
	public void acceptalert()
	{
		alert.accept();
	}
	public void cleartextarea()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		CommonLibraries.TextIndentation(driver, txtarea, 0,0 , false);
		txtarea.sendKeys(Keys.CONTROL + "a");
		txtarea.sendKeys(Keys.DELETE);
	
	}
	public void validatetexteditor1(String text) throws InterruptedException
	{
		Thread.sleep(1000);
		 txtarea = driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		txtarea.sendKeys(text);
					
	}
	public String getconsolemsg()
	{
		return(driver.findElement(consolemsg).getText());
	}
	public void navigateback()
	{
		driver.navigate().back();
	}
	
	public void clickcreatelinkedlistbtn() {
		driver.findElement(CreatingLinkedList1).click();
		}
	public void implementLinkedListbtn() {
		driver.findElement(implementLinkedList1).click();
	}
	public void traversalbtn() {
		driver.findElement(traversal1).click();
	}
	public void insertionbtn() {
		driver.findElement(insertion1).click();
	}
	
	
	public void deletionbtn() {
		driver.findElement(deletion1).click();
	}
	public void clickpracticeQuestionbtn() {
		driver.findElement(practicequestion).click();
	}
	
	public void navigatetohomePage() {
		driver.findElement(numpyninjabtn).click();
		driver.findElement(getstartedbtn1).click();
	}
}
