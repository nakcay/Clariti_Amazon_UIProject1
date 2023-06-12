package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Amazon.feature"},
        glue = {"StepDefinitions"}

)
public class amazon_Runner extends AbstractTestNGCucumberTests {

}
