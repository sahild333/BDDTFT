package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Sahil Duggal\\Desktop\\Java Work Space\\BDDTFTHybrid\\src\\main\\java\\feature",
					glue = "step_definitions",// can also put path
					plugin = {"pretty","html:target/Cucumber-html-reports","json:target/Cucumber-Json-report"},
					monochrome = true)
	
	public class TestRunner {

}


