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
	public static Properties prop;
	public static String url;
	public DriverManager()
	{	
		try {
		 prop = new Properties();
		 System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config//globaldata.properties");
//		FileInputStream fis = new FileInputStream("/Users/omkku/Desktop/Bhuvana_Selenium/Ds-Algo/"
//				+ "src/test/resources/config/globaldata.properties");			
		prop.load(fis);			
		} catch (IOException e) {
			e.getMessage();
		}
	}
	public static void initializeDriver() 
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
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			url = prop.getProperty("Url");
			driver.get(url);
			}
		} 
}
	
	/*public HomePage LaunchApplication() throws IOException
	{
		driver = initializeDriver();
		HomePage homepage=new HomePage(driver);
		homepage.goTo();
		return homepage;
	}
*/
	
