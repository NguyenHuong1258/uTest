package com.web.uTest.stepdefinition;

import com.base.BaseTest;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseTest {

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
