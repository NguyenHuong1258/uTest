package com.web.uTest.testRunner;

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
        tags = " @SignUpValid",
        features = {"src\\test\\java\\com\\web\\uTest\\features"},
        glue = {"com.web.uTest.stepdefinition"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
