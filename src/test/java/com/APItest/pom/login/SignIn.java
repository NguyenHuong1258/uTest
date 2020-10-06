package com.APItest.pom.login;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends AbstractBasePage {

    WebDriver driver;

    public SignIn(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    //Locator for Email
    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement tbx_Email;

    //Locator for Password
    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement tbx_Pass;

    //Locator for Password
    @FindBy(xpath = "//*[@value='Submit']")
    private WebElement btn_Submit;


    /***
     * Method
     */
    //Input Email
    public void inputEmail(String Email){
        sendKeyToTextBox(tbx_Email, Email);
    }

    //Input Password
    public void inputPass(String Pass){
        sendKeyToTextBox(tbx_Pass, Pass);
    }

    //Click Submit
   public void clickSubmit() {
        clickButton(btn_Submit);
    }
}
