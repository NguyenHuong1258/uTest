package com.web.uTest.pom.signUppage;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Define all locators an methods on SignUp Personal page
 */

public class SignUpPersonalPage extends AbstractBasePage {

    WebDriver driver;

    //Define constructor.
    public SignUpPersonalPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    //Locator for First Name
    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement tbx_FirstName;

    //Locator for Last Name
    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement tbx_LastName;

    //Locator for Email address
    @FindBy(xpath = "//*[@id='email']")
    private WebElement tbx_Email;

    //Locator of Month btn
    @FindBy(xpath = "//*[@id='birthMonth']")
    private WebElement btn_Month;

    //Locator for Month list
    @FindBy(xpath = "//*[@id='birthMonth']//child::option[@label]")
    private List<WebElement> droplist_Month;

    //Locator for Date btn
    @FindBy(xpath = "//*[@id='birthDay']")
    private WebElement btn_Date;

    //Locator for Date list
    @FindBy(xpath = "//*[@id='birthDay']//child::option[@label]")
    private List<WebElement> droplist_Date;

    //Locator for Year btn
    @FindBy(xpath = "//*[@id='birthYear']")
    private WebElement btn_Year;

    //Locator for Date list
    @FindBy(xpath = "//*[@id='birthYear']//child::option[@label]")
    private List<WebElement> droplist_Year;

    //Locator for Language box
    @FindBy(xpath = "//*[@id='languages']")
    private WebElement box_Language;


    //Locator for Language list
    @FindBy(xpath = "//*[@role='option']//child::div")
    private List<WebElement> droplist_Language;

    //Locator for Next: Location
    @FindBy(xpath = "//*[@class='btn btn-blue']")
    private WebElement btn_Next;

    //Get error when input invalid email
    @FindBy(xpath = "//*[@id='emailError']")
    private WebElement txt_errorEmail;

    /***
     * Method
     */
    //Input First Name
    public void inputFirstName(String firstName){
        sendKeyToTextBox(tbx_FirstName, firstName);
    }

    //Input Last Name
    public void inputLastName(String lastName){
        sendKeyToTextBox(tbx_LastName, lastName);
    }

    //Input Email
    public void inputEmail(String email){
        sendKeyToTextBox(tbx_Email, email);
    }

    //Get email error
    public String getEmailError(){
        return getTextInElement(txt_errorEmail);
    }

    //Click on Month
    public void clickMonth(){
        clickButton(btn_Month);
    }

    //Select Month
    public void selectMonth(String month){
        int indexMonth;
        indexMonth = getIndex(droplist_Month, month);
         clickButton(droplist_Month.get(indexMonth));
        System.out.println(indexMonth);
    }

    //Click on Date
    public void clickDate(){
        clickButton(btn_Date);
    }

    //Select Date
    public void selectDate(String date){
        int indexDate;
        indexDate = getIndex(droplist_Date, date);
        clickButton(droplist_Date.get(indexDate));
    }

    //Click on Year
    public void clickYear(){
        clickButton(btn_Year);
    }

    //Select Year
    public void selectYear(String year){
        int indexYear;
        indexYear = getIndex(droplist_Year, year);
        clickButton(droplist_Year.get(indexYear));
    }

    //Click on Language
    public void clickLanguage(){
        clickButton(box_Language);
    }

    //Select Language
    public void selectLanguage(String language){
        int indexLanguage;
        indexLanguage = getIndex(droplist_Language, language);
        clickButton(droplist_Language.get(indexLanguage));
    }

    //Click Next button
    public void clickNext(){
        clickButton(btn_Next);
    }

    //Method to return index of string inputted.
    public int getIndex(List<WebElement> webElements, String inputStr){
        int index=0;
        for (int i=0; i < webElements.size()-1; i++){
            if (webElements.get(i).getText().equalsIgnoreCase(inputStr)){
                index= i;
            }
        }
        return index;
    }

    //Apply selection for Month
    public void selectMonthUsingSelection (String month){
        Select selectMonth = new Select(btn_Month);
        waitForElementToBeClickable(btn_Month);
        selectMonth.selectByVisibleText(month);
    }

    //Apply selection for Date
    public void selectDateUsingSelection (String date){
        Select selectDate = new Select(btn_Date);
        waitForElementToBeClickable(btn_Date);
        selectDate.selectByVisibleText(date);
    }

    //Apply selection for Year
    public void selectYearUsingSelection (String year){
        Select selectYear = new Select(btn_Year);
        waitForElementToBeClickable(btn_Year);
        selectYear.selectByVisibleText(year);
    }

}
