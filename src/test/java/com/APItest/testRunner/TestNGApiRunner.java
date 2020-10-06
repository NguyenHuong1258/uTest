package com.APItest.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Run test scenarios
 */

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber/cucumber-html-report.html",
                "json:target/cucumber/cucumber-json-report.json",
                "junit:target/cucumber/cucumber-xml-report.xml"},
        monochrome = true,
        tags = " @Delete",
        features = {"src\\test\\java\\com\\APItest\\feature"},
        glue = {"com.APItest.stepdefinition"}
)

public class TestNGApiRunner extends AbstractTestNGCucumberTests{
}
