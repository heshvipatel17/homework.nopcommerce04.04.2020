package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//div[@class='title']//strong[text()='Your Personal Details']")
    WebElement _personalText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement _genderField;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement _lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dateField;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _monthField;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _yearField;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(xpath = "//input[@name='Company']")
    WebElement _companyNameField;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement _confirmPasswordField;

    @FindBy(xpath = "//input[@name='register-button']")
    WebElement _registerBtn;

    @FindBy(xpath = "//div[@class='page-body']//div[text()='Your registration completed']")
    WebElement _registationCompletedText;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement _logOutOnNopCommerce;


    // METHOD FOR ASSERT YOUR PERSONAL DETAIL TEXT
    public void verifytextYourPersonalDetail(String personalTxt) {
        waitUntilElementToBeClickable(_personalText, 20);
        Reporter.log("Verify personal Text: " + personalTxt + " displayed on personal text page " + _personalText.toString() + "<br>");
        verifyText(_personalText, personalTxt);
        log.info("Verify personal Text: " + personalTxt + " displayed on personal text page" + _personalText.toString());
    }


    // METHOD FOR CLICK ON GENDER RADIO BUTTON
    public void clickOnGenderRadioButton() {
        waitUntilElementToBeClickable(_genderField, 20);
        Reporter.log(" Click to tick Gender Male " + _genderField.toString() + "<br>");
        clickOnElement(_genderField);
        log.info(" Click to tick Gender Male " + _genderField.toString());
    }

    // METHOD FOR ENTER FIRST NAME
    public void enterFirstName(String firstName) {
        waitUntilElementToBeClickable(_firstNameField, 20);
        Reporter.log("Enter first Name: " + firstName + " to first name field " + _firstNameField.toString() + "<br>");
        sendTextToElement(_firstNameField, firstName);
        log.info("Enter first Name: " + firstName + " to first name field " + _firstNameField.toString());
    }

    // METHOD FOR ENTER LAST NAME
    public void enterlastName(String lastName) {
        Reporter.log("Enter last name " + lastName + " to last name field" + _lastNameField.toString() + "<br>");
        sendTextToElement(_lastNameField, lastName);
        log.info("Enter last name " + lastName + " to last name field" + _lastNameField.toString());
    }

    // METHOD FOR ENTER DATE
    public void enterDateField(String date) {
        Reporter.log("Enter date " + date + " to date field " + _dateField.toString() + "<br>");
        sendTextToElement(_dateField, date);
        log.info("Enter date " + date + " to date field " + _dateField.toString());
    }

    // METHOD FOR ENTER MONTH
    public void enterMonthField(String month) {
        Reporter.log(" Enter month" + month + " to month field " + _monthField.toString() + "<br>");
        sendTextToElement(_monthField, month);
        log.info(" Enter momth" + month + " to month field " + _monthField.toString());
    }

    // METHOD FOR ENTER YEAR
    public void enterYearField(String year) {
        Reporter.log(" Enter year " + year + " to year field " + _yearField.toString() + "<br>");
        sendTextToElement(_yearField, year);
        log.info(" Enter year " + year + " to year field " + _yearField.toString());
    }

    // METHOD FOR ENTER EMAIL
    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + " to email field " + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, email);
        log.info("Enter email " + email + " to email field " + _emailField.toString());
    }

    // METHOD FOR ENTER COMPANY NAME
    public void enterCompanyName(String companyName) {
        Reporter.log("Enter company name " + companyName + " to company's name field " + _companyNameField.toString() + "<br>");
        sendTextToElement(_companyNameField, companyName);
        log.info("Enter company name " + companyName + " to company's name field " + _companyNameField.toString());
    }

    // METHOD FOR ENTER PASSWORD
    public void enterPassword(String password) {
        Reporter.log(" Enter password " + password + " to password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info(" Enter password " + password + " to password field " + _passwordField.toString());
    }

    // METHOD FOR ENTER CONFIRM PASSWORD
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log(" Enter confirm password " + confirmPassword + " to confirm password field " + _confirmPasswordField.toString() + "<br>");
        sendTextToElement(_confirmPasswordField, confirmPassword);
        log.info(" Enter confirm password" + confirmPassword + " to confirm password field " + _confirmPasswordField.toString());
    }

    // METHOD FOR CLICK ON REGISTER BUTTON
    public void clickOnRegisterButton() {
        Reporter.log(" Click on register button " + _registerBtn.toString() + "<br>");
        clickOnElement(_registerBtn);
        log.info(" Click on register button " + _registerBtn.toString());
    }

    // METHOD FOR ASSERT REGISTER COMPLETED TEXT
    public void assertRegisterCompletedText(String registerCompletedTxt) {
        Reporter.log("Verify register Text: " + registerCompletedTxt + " displayed on register page " + _registationCompletedText.toString() + "<br>");
        verifyText(_registationCompletedText, registerCompletedTxt);
        log.info("Verify register Text: " + registerCompletedTxt + " displayed on register page " + _registationCompletedText.toString());
    }

    // METHOD FOR LOGOUT FROM NOPCOMMERCE
    public void clickOnLogOutButton() {
        Reporter.log("click on logout button " + _logOutOnNopCommerce.toString() + "<br>");
        clickOnElement(_logOutOnNopCommerce);
        log.info("click on logout button " + _logOutOnNopCommerce.toString());
    }
}
