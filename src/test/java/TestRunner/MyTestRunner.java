package TestRunner;
//import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/registration.feature"}
		,glue = {"StepDefinitions","Hooks"},
		
		plugin = {
		        "pretty",                                // Console output
		        "html:target/cucumber-reports.html",     //  HTML report with screenshots
		        "json:target/cucumber.json" ,
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"             
		    },
		    monochrome = true
		)

public class MyTestRunner extends AbstractTestNGCucumberTests{

}
