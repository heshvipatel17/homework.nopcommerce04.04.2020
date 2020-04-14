package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    // OBJECT CREATE FOR LOAD PROPERTY
    LoadProperty loadProperty = new LoadProperty();
    // OBJECT CREATE FOR HOME PAGE
    HomePage homePage = new HomePage();
    // OBJECT CREATE FOR LOGIN PAGE
    LoginPage loginPage = new LoginPage();

    String email = loadProperty.getProperty("email");
    String password = loadProperty.getProperty("password");
    String invalidemail = loadProperty.getProperty("invalidemail");

    @Test(priority = 0, groups = {"Sanity", "Regression"})
    //  METHOD USER SHOULD NAVIGATE TO LOGIN PAGE
    public void verifyUserShouldNavigateToLoginPage() {

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();
        // CALL ASSERT ON WELCOME TEXT FROM LOGIN PAGE
        loginPage.assertgetWelcomeText();

    }

    @Test(priority = 1, groups = {"Smoke", "Regression"})
    // METHOD USER SHOULD LOGIN SUCCESSFULLY
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();
        Thread.sleep(3000);
        // CALL EMAIL METHOD FROM LOGIN PAGE AND ENTER EMAIL ID
        loginPage.enterEmailId(email);
        // CALL PASSWORD METHOD FROM LOGIN PAGE AND ENTER PASSWORD
        loginPage.enterPassword(password);
        // CALL CLICK ON LOGIN BUTTON METHOD FROM LOGIN PAGE
        loginPage.clickOnLoginButton();
        // CALL ASSERT METHOD FROM LOGIN PAGE AND ASSERT ACTUAL AND EXPECTED TEXT
        loginPage.assertgetWelcomeStoreText();

    }

    @Test(priority = 2, groups = {"Regression"})
    public void userShouldNotLoginSuccessfullyWithInvalidCredintial() {
        //click Login link on HomePage
        homePage.clickOnLoginLink();
        //send text to email field on LoginPage same email as used for registration
        loginPage.enterEmailId(invalidemail);
        //send text to password field on LoginPage
        loginPage.enterPassword(password);
        //click on login button on LoginPage
        loginPage.clickOnLoginButton();

        //Assert text on Error Message
        loginPage.verifyLoginErrorMessage("Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect");

    }

}
