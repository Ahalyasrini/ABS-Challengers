package dsAlgo_hooks ;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import dsalgoPOM.GraphPage;
import dsalgo_driver.BaseTest;

import org.apache.commons.io.FileUtils;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

	public GraphPage graphPage ;
	
	int stepCounter = 0;
	
	@Before
//	@Parameters("browser")
    public void beforeScenario(Scenario scenario){
		System.out.println(scenario.getStatus());
        System.out.println(" Code is currently running before scenario : " + scenario.getName());
//        System.out.println(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser"));
        driverInitializer(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser"));
        graphPage = new GraphPage(getDriver());
    }
	
	@BeforeStep
    public void beforeStep(Scenario scenario){
		stepCounter = 1 + stepCounter;
        System.out.println("Step : " + stepCounter+"--------------------------> "+ Thread.currentThread().getName() + " ------> " +getDriver() + " : "+scenario.getName());
        System.out.println(Thread.currentThread().getName() + " ------> " +getDriver() + " : "+scenario.getName());
        
	}
	
	@After
    public void afterScenario(Scenario scenario) throws IOException, InterruptedException{
        System.out.println("This will run after the Scenario"); 
        if(scenario.isFailed()) {
        	String scenarioName = scenario.getName().replaceFirst(" ","_");
//        	byte[] sourcePath = ((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES);

        	File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        	// Now you can do whatever you need to do with it, for example copy somewhere
        	System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+scenarioName+"_"+System.currentTimeMillis() +".png");
        	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+scenarioName + "_"+System.currentTimeMillis() +".png"));
        	
        }
        int i = 0;
        do{
        	i = i + 1;
            if(getDriver().findElements(By.xpath("//a[@href='/logout']")).size() > 0) {
            	getDriver().findElement(By.xpath("//a[@href='/logout']")).click();
            	Thread.sleep(5000);
            	System.out.println( scenario.getName() + " singed out ----> counter " + i);
            };
        }while((getDriver().findElements(By.xpath("//a[@href='/logout']")).size() > 0) );
//		getDriver().close();
    	System.out.println(scenario.getStatus());
		System.out.println(" Running from after suite metho in hookssssssssssssss");
//		getDriver().quit();

   }
	
	@AfterSuite
	public void afterSuiteMethod() {
		getDriver().quit();
	}
}
