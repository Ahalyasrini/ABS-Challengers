package dsalgo_stepdefinition;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Ahalya123.html"}, //reporting purpose
		monochrome=false,  //console output colour
				tags = "@graph or  @loginPage or @DataStructure or @arrayPage",
	//	tags = "@stack or @queue or @homePage or @register or @loginPage or @DataStructure or @arrayPage or @LinkedlistPage ",
//	tags = "@homePage or @homePage14 or @register or @loginPage or @DataStructure or @arrayPage or @LinkedlistPage or @stack or @queue or "
//			+ "  @treePage or @graph or @homePage14 ", //tags from feature file
//	tags ="@treePage  or @register or  @DataStructure or @homePage or @graph ", //tags from feature file
//			
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"dsalgo_stepdefinition","dsAlgo_hooks"}) //location of step definition files

public class TestRunner2 extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = true )
    public Object[][] scenarios() {
				
		return super.scenarios();	
}
	

}