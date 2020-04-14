package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");
    By welcomeStoreText = By.xpath("//div[@class='topic-block-title']//h2[text()='Welcome to our store']");
    By loginErrorTxt = By.cssSelector("div.message-error");


    //  METHOD FOR ENTER EMAIL ON EMAIL FIELD
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }
//  METHOD FOR ENTER PASSWORD ON PASSWORD FIELD
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
//  METHOD FOR CLICK ON LOGIN BUTTON
    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

//  METHOD FOR ASSERT WELCOME TEXT
    public void assertgetWelcomeText() {
        verifyText(welcomeText, "Welcome, Please Sign In!");
    }
//  METHOD FOR ASSERT WELCOME STORE TEXT
    public void assertgetWelcomeStoreText() {
        verifyText(welcomeStoreText, "Welcome to our store");
    }
    public void verifyLoginErrorMessage(String str) {
        verifyText(loginErrorTxt, str);
    }

}
