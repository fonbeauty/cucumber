package ru.mystudy;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class RunTest extends AbstractTestNGCucumberTests {
}
