package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");
    By welcomeStoreText = By.xpath("//div[@class='topic-block-title']//h2[text()='Welcome to our store']");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }


    public void assertgetWelcomeText() {
        verifyText(welcomeText, "Welcome, Please Sign In!");
    }

    public void assertgetWelcomeStoreText() {
        verifyText(welcomeStoreText, "Welcome to our store");
    }
}
