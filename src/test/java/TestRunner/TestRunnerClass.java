package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"}, glue="com.Stepdefn", monochrome=true,tags= {"@Sanity"})

public class TestRunnerClass {
	

}
