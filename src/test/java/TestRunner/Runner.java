package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Cucumber//nop_commerce//src//test//Features//Login.feature",
        glue= "StepDefinition",
        plugin = {"pretty"}


)
public class Runner {
}
