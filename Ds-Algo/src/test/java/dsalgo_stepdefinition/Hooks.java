package dsalgo_stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.apache.commons.io.FileUtils;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

	int stepCounter = 0;
	
	@Before
    public void beforeScenario(Scenario scenario){
        System.out.println(" Code is currently running before scenario : " + scenario.getName());
        driverInitializer();
    }
	
	@BeforeStep
    public void beforeStep(Scenario scenario){
		stepCounter = 1 + stepCounter;
        System.out.println("Step : " + stepCounter+"--------------------------> "+ Thread.currentThread().getName() + " ------> " +getDriver() + " : "+scenario.getName());
    }
	
	@After
    public void afterScenario(Scenario scenario) throws IOException{
        System.out.println("This will run after the Scenario"); 
        if(scenario.isFailed()) {
        	String scenarioName = scenario.getName().replaceFirst(" ","_");
//        	byte[] sourcePath = ((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES);

        	File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        	// Now you can do whatever you need to do with it, for example copy somewhere
        	System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+scenarioName+"_"+System.currentTimeMillis() +".png");
        	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+scenarioName + "_"+System.currentTimeMillis() +".png"));
        	
        	System.out.println("******************************* Before closing the webdriver ***************************");
        	getDriver().close();
        	getDriver().quit();
        	System.out.println("******************************* After closing the webdriver ***************************");
        	
//        	FileUtils.copyFile(sourcePath,  new File("c:\\tmp\\screenshot.png"));
//        	System.out.println(System.getProperty("user.dir")+"image"+scenarioName +".png");
//        	scenario.attach(sourcePath, System.getProperty("user.dir")+"image", scenarioName +".png");
        }
    }
	
	
	@After
    public void tearDown() throws IOException{
 
        	System.out.println("******************************* Before closing the webdriver ***************************");
        	getDriver().close();
        	getDriver().quit();
        	System.out.println("******************************* After closing the webdriver ***************************");
  }
    
	
}
