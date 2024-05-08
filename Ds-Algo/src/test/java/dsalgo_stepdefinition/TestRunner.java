package dsalgo_stepdefinition;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Ahalya123.html"}, //reporting purpose
		monochrome=false,  //console output colour
		tags = "@homePage or @DataStructure", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"dsalgo_stepdefinition"}) //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();	
}
}