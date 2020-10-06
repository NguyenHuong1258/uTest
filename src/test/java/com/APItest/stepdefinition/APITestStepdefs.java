/**
 * Define steps in the test scenario
 */

package com.APItest.stepdefinition;

import com.APItest.pom.PageObjectManagerAPI;
import com.APItest.pom.aPIKeys.API_Keys;
import com.APItest.pom.login.SignIn;
import com.web.uTest.stepdefinition.Hooks_Utest;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class APITestStepdefs {

    public  static WebDriver driver;
    private static Logger logger = LogManager.getLogger(APITestStepdefs.class.getName());

    //Declare POM variable
    SignIn signIn;
    API_Keys apiKeys;
    PageObjectManagerAPI pageObjectManagerAPI;

    //Declare local variable.
    String ApiName;

    public APITestStepdefs() {
        driver = Hooks_ApiKeys.driver;
        pageObjectManagerAPI = new PageObjectManagerAPI(driver);
        signIn = pageObjectManagerAPI.getSignIn();
        apiKeys = pageObjectManagerAPI.getApiKeys();
    }


    @Given("User signIn successfully")
    public void userSignInSuccessfully() {
        driver.navigate().to("https://home.openweathermap.org/users/sign_in");
        signIn.inputEmail("wizetest1@gmail.com");
        signIn.inputPass("autotest");
        signIn.clickSubmit();

    }

    @And("User open APIKeys page")
    public void userOpenAPIKeysPage() {
        apiKeys.clickApiKeys();
    }

    @When("User enter API name as {string}")
    public void userEnterAPINameAs(String ApiName) {
        this.ApiName = ApiName;
        apiKeys.enterAPIName(ApiName);
    }

    @And("User click Generate")
    public void userClickGenerate() {
        apiKeys.clickGenerate();
    }

    @Then("New API is created")
    public void newApiIsCreated() {
        Assert.assertEquals(apiKeys.isExistAPI(ApiName), true);
    }


    @And("edit to a new name as {string}")
    public void editToANewNameAs(String editAPIName) {
        apiKeys.enterNewAPIName(editAPIName);
        apiKeys.clickSaveEditing();
        this.ApiName = editAPIName;
    }

    @Then("the name should be updated")
    public void theNameShouldBeUpdated() {
        Assert.assertEquals(apiKeys.isExistAPI(ApiName), true);
        System.out.println(ApiName);
    }

    @When("User click Edit of API as {string}")
    public void userClickEditOfAPIAs(String ApiName) {
        this.ApiName = ApiName;
        apiKeys.clickEdit(ApiName);
    }

    @When("User click Delete API as {string}")
    public void userClickDeleteAPIAs(String ApiName) {
        this.ApiName = ApiName;
        apiKeys.clickDelete(ApiName);
    }

    @Then("the API should be deleted successfully")
    public void theAPIShouldBeDeleteSuccessfully() {
        Assert.assertEquals(apiKeys.isExistAPI(ApiName), false);
    }


}
