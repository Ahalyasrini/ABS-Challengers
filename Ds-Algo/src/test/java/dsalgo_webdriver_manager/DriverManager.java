package dsalgo_webdriver_manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsalgoPOM.HomePage;
import dsalgo_utilities.LoggerLoad;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public static WebDriver driver;
	/*private driverManager() {
		//this.driver=driver;
	}
	private  static WebDriver driver = new ChromeDriver();
	public static String url = "https://dsportalapp.herokuapp.com";
	
	public static WebDriver getdriver() {
		return driver;
	}*/
	
	public DriverManager() {
		
	}
	
	
	public WebDriver initializeDriver() throws IOException
	{
		//properties class
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\globaldata.properties");
		prop.load(fis);
		String url = prop.getProperty("Url");
	//	String browserName =prop.getProperty("browser");
		
		if(driver==null)
	    {
	    if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	    {
	    	driver = new FirefoxDriver();
	    }
	    else if(prop.getProperty("browser").equalsIgnoreCase("Edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    driver.get(url);
	    
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
			return driver;
		}
	
	
	public HomePage LaunchApplication() throws IOException
	{
		driver = initializeDriver();
		HomePage homepage=new HomePage(driver);
		homepage.goTo();
		return homepage;
	}
	}

