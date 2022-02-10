package automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "automation.steps", // Package name where we've step definition
        tags = "@Smoke",
        plugin = {"json:target//cucumber.json","html:target//index.html"}
)
public class TestRunner {

}
