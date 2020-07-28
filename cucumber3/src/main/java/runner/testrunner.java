package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\sj\\eclipse-workspace\\cucumber3\\src\\main\\java\\features\\login.feature"
		,glue={"stepdefinition"},
		plugin = {"pretty","html:target/test-output","json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class testrunner {

}
