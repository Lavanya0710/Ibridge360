package StepDefitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/main/resources",glue= {"StepDefitions"},monochrome=true,
plugin= {"pretty","junit:target/JUnit/JUnitReports.xml",
		"json:target/JSONReports/report.json",
		"pretty","html:target/HtmlReports"
		}
)

public class TestRunner {

	
}
