package com.web.uTest.pom.signUppage;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAddressPage extends AbstractBasePage {

    WebDriver driver;

    //Define constructor.
    public SignUpAddressPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    //Locator for Title
    @FindBy(xpath = "//*[@class='sub-title']")
    private WebElement text_subTitle;


    /***
     * Method
     */
    //Get content
    public String getSubTitle(){
        return getTextInElement(text_subTitle);
    }

}
