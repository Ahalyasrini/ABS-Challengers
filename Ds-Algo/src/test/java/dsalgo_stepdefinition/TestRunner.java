package dsalgo_stepdefinition;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Ahalya123.html"}, //reporting purpose
		monochrome=false,  //console output colour
	//	tags = "@loginPage or @homePage14 or @register ",
	tags = "@stack123", //tags from feature file
//		tags = "@homePage or @DataStructure", //tags from feature file
//				@homePage14 or @register or 
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"dsalgo_stepdefinition"}) //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = true )
    public Object[][] scenarios() {
				
		return super.scenarios();	
}
}