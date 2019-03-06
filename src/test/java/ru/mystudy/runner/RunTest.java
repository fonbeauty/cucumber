package ru.mystudy.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "ru.mystudy.stepDefinitions",
        features = "src/test/resources/features")
public class RunTest extends AbstractTestNGCucumberTests {
}
