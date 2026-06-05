package runner;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue={"StepDefinitions_pkg"},
		plugin= {"pretty",
				"html:target/htmlreports/report.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
