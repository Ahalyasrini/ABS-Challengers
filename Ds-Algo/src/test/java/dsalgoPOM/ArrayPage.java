package dsalgoPOM;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_commonlibraries.CommonLibraries;
import dsalgo_utilities.ExcelReader;

public class ArrayPage {
    public WebDriver driver;
    By getStartedarraybtn=By.xpath("//a[@href=\"array\"]");
	By arraytitle=By.xpath("//h4[@class=\"bg-secondary text-white\"]");
	By arrayinpython=By.xpath("//a[@href=\"arrays-in-python\"]");
	By arraypythontitle=By.xpath("//p[@class=\"bg-secondary text-white\"]");
	By arrayUsingList=By.xpath("//a[@href=\"arrays-using-list\"]");
	By basicOperation=By.xpath("//a[@href=\"basic-operations-in-lists\"]");
	By applicationsOfarray=By.xpath("//a[@href=\"applications-of-array\"]");
	By tryHere=By.xpath("//a[@href=\"/tryEditor\"]");
	By editorbox=By.xpath("//div[@class=\"CodeMirror-scroll\"]");
	By txteditorarea_1 = By.xpath("//form[@id='answer_form']//pre[@class=' CodeMirror-line ']/span/span");
	By run_btn = By.xpath("//button[text()='Run']");
	By consolemsg = By.xpath("//*[@id='output']");
	By arrayUsingList1=By.xpath("//a[@href=\"/array/arrays-using-list/\"]");
	By basicOperation1=By.xpath("//a[@href=\"/array/basic-operations-in-lists/\"]");
	By applicationsOfarray1=By.xpath("//a[@href=\"/array/applications-of-array/\"]");
	By practicequestion=By.xpath("//a[@href=\"/array/practice\"]");
	By practiceQuestionLinks = By.xpath("//div[@class='list-group']/a");
	By practiceEditor = By.xpath("//div[@class='CodeMirror-code'][@role='presentation']");
	By practiceRunButton = By.xpath("//button[@onclick=\"runit()\"]");
	By numpyninjabtn=By.xpath("//a[@class=\"navbar-brand\"]");
	By getstartedbtn1=By.xpath("//a[@href=\"/home\"]");
	
	
	public WebDriverWait wait ;

WebElement txtarea;
Alert alert ;

	 public ArrayPage(WebDriver driver)
	 {
		  this.driver=driver;
		  this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  wait = new WebDriverWait(this.driver,Duration.ofSeconds(10));
	 }
	 
	 public void getpageTitle()
	 {
		 System.out.println(driver.getTitle());	
	 }
	 
	public void clickArraygetStartedBtn() {
		driver.findElement(getStartedarraybtn).click();
		}
	
	public void getarraytitle() {
		System.out.println(driver.findElement(arraytitle).getText());
	}
	
	public void validatingLinks() {
		driver.findElement( arrayinpython).click();
		driver.navigate().back();
		driver.findElement(arrayUsingList).click();
		driver.navigate().back();
		driver.findElement(basicOperation).click();
		driver.navigate().back();
		driver.findElement(applicationsOfarray).click();
		driver.navigate().back();
		System.out.println("closed");
		}
	public void arrayInpython() {
		driver.findElement( arrayinpython).click();
		System.out.println((driver.findElements(arraypythontitle)).get(1).getText().contains("Arrays in Python"));
		}
	public void tryHerebtn() {
		driver.findElement(tryHere).click();
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
	public void arrayusinglist() {
		driver.findElement( arrayUsingList1).click();
		System.out.println((driver.findElements(arraypythontitle)).get(1).getText().contains("Arrays Using List"));
		}
	public void basicoperation() {
		driver.findElement( basicOperation1).click();
		System.out.println((driver.findElements(arraypythontitle)).get(1).getText().contains("Basic Operations in Lists"));
		}
	public void applicationofarray() {
		driver.findElement( applicationsOfarray1).click();
		System.out.println((driver.findElements(arraypythontitle)).get(1).getText().contains("Applications of Array"));
		}
	public void practiceQuestionarray() {
		driver.findElement(practicequestion ).click();
	}
	
	public void enterValueEditorBox(String text) {
		txtarea = driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		txtarea.sendKeys(text);	
	}
	
	public void enterValueEditorClear() {
		txtarea = driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		actions.moveToElement(txtarea).click().perform();
		txtarea.clear();
	}
	
	public void getActiveMessage() {
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
	}
	
	public void validatepracticeQuestionLinks(String sheetName) throws IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> excelData = reader.readExcelSheetForPracticeLinks(sheetName);
		
		List<WebElement> practiceQuestionList = driver.findElements(practiceQuestionLinks);
		for(WebElement practiceQuestion: practiceQuestionList) {
			for( Map testData :excelData) {
				System.out.println(practiceQuestion.getText());
				System.out.println(testData.get("Links").toString());
				if(practiceQuestion.getText().contains(testData.get("Links").toString())) {
					practiceQuestion.click();

					
//					enterValueEditorBox(testData.get("validText").toString());
//					driver.findElement(practiceRunButton).click();
//					getActiveMessage();
//					
//					enterValueEditorClear();
					
					enterValueEditorBox(testData.get("invalidText").toString());
					driver.findElement(practiceRunButton).click();
					getActiveMessage();
					
					driver.navigate().back();
					break;
				}
			}
		}
	}
	public void navigatetohomePage() {
		driver.findElement(numpyninjabtn).click();
		driver.findElement(getstartedbtn1).click();
	}
	
}


