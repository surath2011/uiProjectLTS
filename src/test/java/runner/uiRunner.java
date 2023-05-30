package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/demoQa.feature",
        tags = "@smoke",
        plugin = {"pretty","html:target/cucumber-html-report",
                "json:target/cucmber.json","junit:target/cucumber.xml","rerun:target/failed.txt"},
        glue={"steps"}, monochrome = true, publish = true)
public class uiRunner {

}
