package dsalgo_webdriver_manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerParallel {
	protected ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
		public  WebDriver driver;
		public static Properties prop;
		public static String url;
		 public  final ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();
		public DriverManagerParallel()
		{	
			try {
			 prop = new Properties();
			 System.out.println(System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config//globaldata.properties");
//			FileInputStream fis = new FileInputStream("/Users/omkku/Desktop/Bhuvana_Selenium/Ds-Algo/"
//					+ "src/test/resources/config/globaldata.properties");			
			prop.load(fis);			
			} catch (IOException e) {
				e.getMessage();
			}
		}
		public   void initializeDriver() 
		{			   	    	
		    
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
				
				driverThread.set(Objects.requireNonNull(driver));
				System.out.println(driverThread);
				getDriver().manage().window().maximize();
				getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				url = prop.getProperty("Url");
				getDriver().get(url);
				}
			} 
		
		public void navigateHome()
		{
			driver.get(url + "home");
		}
		
	     public  WebDriver getDriver(){
	         return Objects.requireNonNull(driverThread.get());
	     }
	}
