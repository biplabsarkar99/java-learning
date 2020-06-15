package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/* Mandatory options */
@RunWith(Cucumber.class)
@CucumberOptions(
		/* Location of Feature folder */
		features = "/Users/tuna/Documents/WellsFargo/Learning/java-learning/FreeCRMBDDFramework/src/main/java/Features/login.feature"
		/* Step definition (Glue code) package name */
		,glue = {"stepDefinations"}
		/* HTML reporting */
		,format = {"pretty", "html:test-outout"}
		)

public class TestRunner {

}
