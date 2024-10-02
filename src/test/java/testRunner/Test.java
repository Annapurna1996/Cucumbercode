package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace Tasks\\JenkinsProject\\OrangeHrm.feature",
		glue = "stepDefinition",
		dryRun=false,
		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" }

		)
public class Test extends AbstractTestNGCucumberTests {

}
