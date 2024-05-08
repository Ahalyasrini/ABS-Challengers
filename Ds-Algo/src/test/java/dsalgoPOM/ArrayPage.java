package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
    WebDriver driver;
    By getStartedarraybtn=By.xpath("//a[@href=\"array\"]");
	By arraytitle=By.xpath("//h4[@class=\"bg-secondary text-white\"]");
	By arrayinpython=By.xpath("//a[@href=\"arrays-in-python\"]");
	By arraypythontitle=By.xpath("//p[@class=\"bg-secondary text-white\"]");
	By arrayUsingList=By.xpath("//a[@href=\"arrays-using-list\"]");
	By basicOperation=By.xpath("//a[@href=\"basic-operations-in-lists\"]");
	By applicationsOfarray=By.xpath("//a[@href=\"applications-of-array\"]");
	By tryHere=By.xpath("//a[@href=\"/tryEditor\"]");
	 public ArrayPage(WebDriver driver)
	 {
		  this.driver=driver;
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
}
