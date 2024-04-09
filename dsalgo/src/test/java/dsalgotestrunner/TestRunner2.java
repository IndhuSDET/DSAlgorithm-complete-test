package dsalgotestrunner;
import org.junit.runner.RunWith;
import org.testng.annotations.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import dsalgoutilities.configreader;
@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"C:\\Users\\siva1\\git\\Datastructure algos\\dsalgo\\src\\test\\resources\\dsalgofeatures"},
      glue= {"dsalgostepdefinitions","dsalgohooks"},
      plugin={"pretty",
    		  "html:target/report.html",
    		  "json:target/report.json",
    		  "junit:target/report.xml",
    		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    		  //"timeline:test-output-thread/"
    		 }
)
public class TestRunner2 extends AbstractTestNGCucumberTests
{
  @BeforeTest
  @Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable
  {
	  configreader.setBrowserType(browser);
  }
  @Override	
  @DataProvider(parallel = true)
  public Object[][] scenarios()
  {
	 return super.scenarios();
  }
}
 
