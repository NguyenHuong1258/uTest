package com.web.uTest.stepdefinition;
import com.web.uTest.pom.PageObjectManager;
import com.web.uTest.pom.signUppage.SignUpAddressPage;
import com.web.uTest.pom.signUppage.SignUpPersonalPage;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Define steps in the test scenario
 */

public class UtestStepdefs {

    //Declare variables of POM
    public  static WebDriver driver;
    PageObjectManager pageObjectManager;
    SignUpPersonalPage signUpPerPage;
    SignUpAddressPage signUpAddrPage;

    private static Logger logger = LogManager.getLogger(UtestStepdefs.class.getName());


    //Declare constructor
    public UtestStepdefs() {
        driver = Hooks.driver;
        pageObjectManager = new PageObjectManager(driver);
        signUpPerPage = pageObjectManager.getSignUpPerPage();
        signUpAddrPage = pageObjectManager.getSignUpAddressPage();
    }

    @Given("User access SignUp page of uTest")
    public void userAccessSignUpPageOfUTest() {
        driver.navigate().to("https://www.utest.com/signup/personal");
    }

//    @When("User inputs \"([^\"]*)\"$\" in Email field")
//    public void userInputsInEmailField(String email) {
//        signUpPerPage.inputEmail(email);
//    }

    @Then("the error invalid email should be displayed")
    public void theErrorInvalidEmailShouldBeDisplayed() {
        Assert.assertEquals(signUpPerPage.getEmailError(), "Enter valid email");
    }
    @When("^User inputs email as \"([^\"]*)\"$")
    public void userInputsInEmailField(String email) {
        signUpPerPage.inputEmail(email);
    }

    @When("User inputs First name as {string}")
    public void userInputsFirstNameAs(String firstName) {
        signUpPerPage.inputFirstName(firstName);
    }

    @And("User input Last name as {string}")
    public void userInputLastNameAs(String lastName) {
        signUpPerPage.inputLastName(lastName);
    }

    @And("User inputs Email address as {string}")
    public void userInputsEmailAddressAs(String email) {
        signUpPerPage.inputEmail(email);
    }

    @And("User selects Date of birth with Month as {string}")
    public void userSelectsDateOfBirthWithMonthAs(String month) {
        signUpPerPage.clickMonth();
        signUpPerPage.selectMonth(month);
    }

    @And("User selects Date of birth with Date as {string}")
    public void userSelectsDateOfBirthWithDateAs(String date) {
        signUpPerPage.clickDate();
        signUpPerPage.selectDate(date);
    }

    @And("User selects Date of birth with Year as {string}")
    public void userSelectsDateOfBirthWithYearAs(String year) {
        signUpPerPage.clickYear();
        signUpPerPage.selectYear(year);
    }

    @And("User selects Language as {string}")
    public void userSelectsLanguageAs(String language) {
        signUpPerPage.clickLanguage();
        signUpPerPage.selectLanguage(language);
    }

    @And("User clicks Next button")
    public void userClicksNextButton() {
        signUpPerPage.clickNext();
    }

    @Then("User should be redirected to Step two page")
    public void userShouldBeRedirectedToStepTwoPage() {
        String actual = signUpAddrPage.getSubTitle();
        Assert.assertEquals(actual, "Add your address");
    }
}
