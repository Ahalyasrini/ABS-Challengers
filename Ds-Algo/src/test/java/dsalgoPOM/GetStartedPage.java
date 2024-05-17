package dsalgoPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetStartedPage {
	WebDriver driver;
	 By dropdown = By.xpath("//*[text()='Data Structures']");
	 By dropDownValue = By.xpath("//*[text()='Data Structures']/following-sibling::div/a");
	 By alertMessage = By.xpath("//div[@class='alert alert-primary']");
     By datastructureGetStarted=By.xpath("//a[@href=\"data-structures-introduction\"]");
     By arrayGetStarted=By.xpath("//a[@href=\"array\"]");
     By linkedlistGetStarted=By.xpath("//a[@href=\"linked-list\"]");
     By stackGetStarted=By.xpath("//a[@href=\"stack\"]");
     By queueGetStarted=By.xpath("//a[@href=\"queue\"]");
     By treeGetStarted=By.xpath("//a[@href=\"tree\"]");
public GetStartedPage(WebDriver driver)
{
	 this.driver=driver;
	 	 	 
}

public String getpageTitle()
{
	return driver.getTitle();	 
}
public WebElement clickDropdown() {

	return driver.findElement(dropdown);
}

public void selectDropDownValue(String option) {
	List <WebElement> elements = driver.findElements(dropDownValue);
	
	for (WebElement elm : elements) {
		if(elm.getText().contains(option)) {
			elm.click();
			break;
		}
	}
}

public void validateAlertMessage() {
	System.out.println(driver.findElement(alertMessage).getText());
	
}

public void refreshPage() {
	driver.navigate().refresh();
}

public WebElement datastructureGetStartedClick() {

	return driver.findElement(datastructureGetStarted);
}

public WebElement arrayGetStartedClick() {

	return driver.findElement(arrayGetStarted);
}

public WebElement linkedlistGetStartedClick() {

	return driver.findElement(linkedlistGetStarted);
}

public WebElement stackGetStartedClick() {

	return driver.findElement(stackGetStarted);
}

public WebElement queueGetStartedClick() {

	return driver.findElement(queueGetStarted);
}

public WebElement treeGetStartedClick() {

	return driver.findElement(treeGetStarted);
}
}