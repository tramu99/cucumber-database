package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\seed.feature"},
		glue = {"stepDefinations"},
		plugin = {"pretty", "junit:target/cucumber-junit.xml", "html:target/cucumber-html"}
		,monochrome = true
		,publish = false
	)
public class TestRunner {

}

