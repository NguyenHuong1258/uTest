package com.APItest.pom.aPIKeys;

import com.basepage.AbstractBasePage;
import io.cucumber.messages.internal.com.google.protobuf.Api;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class API_Keys extends AbstractBasePage {

    WebDriver driver;
    boolean isExitsAPI;

    public API_Keys(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */

    //Locator for API key tab
    @FindBy(xpath = "//*[text()='API keys']")
    private WebElement btn_APIKeys;

    //Locator for Create API box
    @FindBy(xpath = "//*[@id='api_key_form_name']")
    private WebElement tbx_APIName;

    //Locator for Generate button
    @FindBy(xpath = "//*[@value='Generate']")
    private WebElement btn_Generate;



    //Locator for Edit name
    @FindBy(xpath = "//*[@id='edit_key_form_name']")
    private  WebElement tbx_EditName;

    //Locator for Save button of editing
    @FindBy(xpath = "//button[@class='button-round dark']")
    private WebElement btn_Save;

    //Locator for Delete button
    @FindBy(xpath = "//*[@class='fa fa-remove']")
    private WebElement btn_Delete;

    //tbody//child::tr
    //Locator for list of API
    @FindBy(xpath = "//tbody//child::tr")
    private List<WebElement> list_APIs;


    /**
     * Actions
     */
    //Click API button
    public void clickApiKeys(){
        clickButton(btn_APIKeys);
    }

    //Enter API name
    public void enterAPIName(String ApiName){
        sendKeyToTextBox(tbx_APIName, ApiName);
    }

    //Click Generate
    public void clickGenerate(){
        clickButton(btn_Generate);
    }

/*
    //Click Edit
    public void clickEdit(){
        clickButton(btn_Edit);
    }
*/

    //Enter a new name for API
    public void enterNewAPIName(String editAPIName){
        sendKeyToTextBox(tbx_EditName, editAPIName);
    }

    public void clickSaveEditing(){
        clickButton(btn_Save);
    }

    /**
     * Logic
     */
    //Return web element for api created
    private WebElement ApiElement(String ApiName){
        for (WebElement webElement: list_APIs){
            if (webElement.getText().contains(ApiName)){
                return webElement;
            }
        }
        return  null;
    }

    //Check existing API in the list
    public boolean isExistAPI(String ApiName){
        if (ApiElement(ApiName) !=null){
            return ApiElement(ApiName).getText().contains(ApiName);
        }
        return false;
    }

    //Edit the API
    public void clickEdit(String ApiName){
        clickButton(ApiElement(ApiName).findElement(By.xpath("//*[@class='edit_key_btn edit-key-btn']")));
    }

    //Click Delete
    public void clickDelete(String ApiName){
        clickButton(ApiElement(ApiName).findElement(By.xpath("//*[@class='edit_key_btn']")));
        driver.switchTo().alert().accept();
    }


}
