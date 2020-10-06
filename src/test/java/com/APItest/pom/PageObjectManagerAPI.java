package com.APItest.pom;

import com.APItest.pom.aPIKeys.API_Keys;
import com.APItest.pom.login.SignIn;
import com.web.uTest.pom.signUppage.SignUpPersonalPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManagerAPI {
    private WebDriver driver;

    //Declare variables for all pages
    private SignIn signIn;
    private API_Keys apiKeys;


    //Declare constructor
    public PageObjectManagerAPI(WebDriver driver) {
        this.driver = driver;
    }

    /***
     * Get Instance for each page
     * */

    //For SignUp page
    public SignIn getSignIn(){
        return (signIn==null)? signIn = new SignIn(driver): signIn;
    }

    //For APYKeys
    public API_Keys getApiKeys(){
        return (apiKeys==null)? apiKeys = new API_Keys(driver): apiKeys;
    }

}
