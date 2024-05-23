package dsalgo_stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public Properties prop;
	public static String url;
	
	public void setDriver(WebDriver driver) {
		this. driver.set(driver);
	}
	
	public WebDriver getDriver() {
		return this.driver.get();
	}

	public void setupDriver() {
		if(getDriver()==null){
			String browserType = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browserName");
			System.out.println("BrowserType="+browserType);
			if(browserType.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
				}else if(browserType.equalsIgnoreCase("firefox")){
					WebDriverManager.firefoxdriver().setup();
					setDriver(new FirefoxDriver());
					}else if(browserType.equalsIgnoreCase("Edge")){
						WebDriverManager.edgedriver().setup();
						setDriver(new EdgeDriver());
						}
			}
		}
	
	public void loadProperties() {
		try {
			 prop = new Properties();
			 System.out.println(System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config//globaldata.properties");
			prop.load(fis);			
			} catch (IOException e) {
				e.getMessage();
			}
	}
	
	@BeforeMethod (alwaysRun = true)
	public void driverInitializer() {
		loadProperties();
		setupDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.url = prop.getProperty("Url");
		getDriver().get(url);
	}
}
