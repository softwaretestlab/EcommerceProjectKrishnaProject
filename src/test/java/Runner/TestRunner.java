package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FeatureFile"},
        glue = {"StepDefinations"},
        plugin = {"pretty", "json:target/cucumber.json"},
        monochrome = true,
        tags = "@Smokey"
)
public class TestRunner {
}
