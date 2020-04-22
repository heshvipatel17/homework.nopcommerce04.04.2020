package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;

    @FindBy(xpath = "//div[@class='topic-block-title']//h2[text()='Welcome to our store']")
    WebElement _welcomeStoreText;

    @FindBy(css = "div.message-error")
    WebElement _loginErrorTxt;

    //  METHOD FOR ENTER EMAIL ON EMAIL FIELD
    public void enterEmailId(String email) {
        waitUntilElementToBeClickable(_emailField,20);
        Reporter.log("Enter email : " + email + " to email field " + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, email);
        log.info("Enter email : " + email + " to email field " + _emailField.toString());
    }

    //  METHOD FOR ENTER PASSWORD ON PASSWORD FIELD
    public void enterPassword(String password) {
        waitUntilElementToBeClickable(_passwordField, 20);
        Reporter.log("Enter password: " + password + "to password field" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password: " + password + "to password field" + _passwordField.toString());
    }

    //  METHOD FOR CLICK ON LOGIN BUTTON
    public void clickOnLoginButton() {
        Reporter.log("Click on login button" + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Click on login button" + _loginBtn.toString());
    }

    //  METHOD FOR ASSERT WELCOME TEXT
    public void assertgetWelcomeText(String welcomeTxt) {
        Reporter.log("verify welcome text: " + welcomeTxt + " displayed on Login page " + _welcomeText.toString() + "<br>");
        verifyText(_welcomeText, welcomeTxt);
        log.info("verify welcome text: " + welcomeTxt+ " displayed on welcome text "+_welcomeText.toString());
    }

    //  METHOD FOR ASSERT WELCOME STORE TEXT
    public void assertgetWelcomeStoreText(String welcomeStoreTxt) {
        waitUntilElementToBeClickable(_welcomeStoreText, 20);
        Reporter.log("Verify welcome store text: " + welcomeStoreTxt+" displayed on welcome store page "+ _welcomeStoreText.toString() + "<br>");
        verifyText(_welcomeStoreText, welcomeStoreTxt);
        log.info("Verify welcome store text: " + welcomeStoreTxt+"displayed on welcome store page"+_welcomeStoreText.toString());
    }

    public void verifyLoginErrorMessage(String errorTxt) {
        Reporter.log("Verify error text: " +errorTxt+" displayed on login page " + _loginErrorTxt.toString() + "<br>");
        verifyText(_loginErrorTxt, errorTxt);
        log.info("Verify error text: " +errorTxt+" displayed on login page "+ _loginErrorTxt.toString());
    }
    public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }

}
