package com.stcSubrcriptions.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.stcSubscriptions.steps",
    tags = "@stcSubscriptions", 
    plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumber.html"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
