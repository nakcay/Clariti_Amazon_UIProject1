package Runners;


import Utilities.BasicDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Amazon.feature"},
        glue = {"StepDefinitions"}
        )

public class RunnerForCrossBrowserTesting extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browserName)
    {
        BasicDriver.setThreadDriverName(browserName);
    }
}
