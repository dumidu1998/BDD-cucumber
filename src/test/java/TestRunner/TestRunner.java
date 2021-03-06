package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\BDD\\src\\test\\resources\\features\\TimeLogin.feature",
        glue={"stepDefinition"},
        format= {"pretty","html:test-output_1",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        plugin={"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json"},
        monochrome = true

)
public class TestRunner {
}
