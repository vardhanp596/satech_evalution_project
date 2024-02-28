package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
                glue={"stepdefinitions"},
                features={"src/test/resources/features"},
                tags= "@Test",
                plugin={"pretty","html:target/cucumber-reports"},
                monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {



}
