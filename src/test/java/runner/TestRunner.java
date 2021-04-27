package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\main\\java\\feature",
				glue ="\\src\\test\\java\\step_definitions",
				plugin = {"pretty","html:target/Cucumber-html-reports","json:target/Cucumber-Json-report"},
				monochrome = true)

public class TestRunner {

}
