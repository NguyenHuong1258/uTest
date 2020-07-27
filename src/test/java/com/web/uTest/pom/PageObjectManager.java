package com.web.uTest.pom;

import com.web.uTest.pom.signUppage.SignUpAddressPage;
import com.web.uTest.pom.signUppage.SignUpPersonalPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;

    //Declare variables for all pages
    private SignUpPersonalPage signUpPerPage;
    private SignUpAddressPage signUpAddrPage;

    //Declare constructor
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    /***
     * Get Instance for each page
     * */
    //Get instance for SignUpPersonalPage
    public SignUpPersonalPage getSignUpPerPage(){
        return (signUpPerPage==null)? signUpPerPage = new SignUpPersonalPage(driver): signUpPerPage;
    }

    //Get instance for SignUpAddressPage
    public SignUpAddressPage getSignUpAddressPage(){
        return (signUpAddrPage==null)? signUpAddrPage = new SignUpAddressPage(driver): signUpAddrPage;
    }

}
