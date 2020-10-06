package com.APItest.stepdefinition;

import com.base.BaseTest;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks_ApiKeys extends BaseTest {

    //Declare variables
    public static WebDriver driver;

    //Set up before run test.
    @Before
    public void setup() {
        driver = getDriver();
    }

    //Set up after run test.
    @After
    public void tearDown(){
        driver.quit();
    }
}
