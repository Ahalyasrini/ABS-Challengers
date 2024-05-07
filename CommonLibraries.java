package dsalgo_commonlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.DriverManager;

public class CommonLibraries{
	public static Properties prop;
	public static void TextIndentation(WebDriver driver, WebElement pythonElement, int row, int space,boolean flag) {
		Actions action = new Actions(driver);
	       // Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		for(int i=1;i<=row;i++) {
		      action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
		       for(int j=1;j<=space;j++) {
	            if(i==1 && flag) action.sendKeys(Keys.BACK_SPACE).perform();
	            else action.sendKeys(Keys.DELETE).perform();
			   }
		}
	}
	
	public static void addtext1()
	{		
			try {
			 prop = new Properties();
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config//globaldata.properties");
			FileInputStream fis = new FileInputStream("/Users/omkku/Desktop/Bhuvana_Selenium/Ds-Algo/"
					+ "src/test/resources/config/textfile");			
			prop.load(fis);			
			} catch (IOException e) {
				e.getMessage();
			}
			prop.getProperty("txt1");
		}
	
public static void addtext2()
{		
		try {
		 prop = new Properties();
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config//globaldata.properties");
		FileInputStream fis = new FileInputStream("/Users/omkku/Desktop/Bhuvana_Selenium/Ds-Algo/"
				+ "src/test/resources/config/textfile");			
		prop.load(fis);			
		} catch (IOException e) {
			e.getMessage();
		}
		prop.getProperty("txt2");
	   
	}


}	