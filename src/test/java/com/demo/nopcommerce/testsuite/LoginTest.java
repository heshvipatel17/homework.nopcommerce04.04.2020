package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();

    }

    @Test(priority = 0, groups = {"Sanity", "Regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        //  METHOD USER SHOULD NAVIGATE TO LOGIN PAGE

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();

        // CALL ASSERT ON WELCOME TEXT FROM LOGIN PAGE
        loginPage.assertgetWelcomeText("Welcome, Please Sign In!");

    }

    @Test(priority = 1, groups = {"Smoke", "Regression"})
    // METHOD USER SHOULD LOGIN SUCCESSFULLY
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();
    //    Thread.sleep(3000);
        // CALL EMAIL METHOD FROM LOGIN PAGE AND ENTER EMAIL ID
        loginPage.enterEmailId("bjrpatel17@yahoo.com");
        // CALL PASSWORD METHOD FROM LOGIN PAGE AND ENTER PASSWORD
        loginPage.enterPassword("abc123");
        // CALL CLICK ON LOGIN BUTTON METHOD FROM LOGIN PAGE
        loginPage.clickOnLoginButton();
        // CALL ASSERT METHOD FROM LOGIN PAGE AND ASSERT ACTUAL AND EXPECTED TEXT
        loginPage.assertgetWelcomeStoreText("Welcome to our store");

    }

    @Test(priority = 2, groups = {"Regression"})
    public void userShouldNotLoginSuccessfullyWithInvalidCredintial() {
        //click Login link on HomePage
        homePage.clickOnLoginLink();
        //send text to email field on LoginPage same email as used for registration
        loginPage.enterEmailId("bjrpatel17@gmail.com");
        //send text to password field on LoginPage
        loginPage.enterPassword("abc123");
        //click on login button on LoginPage
        loginPage.clickOnLoginButton();

        //Assert text on Error Message
        loginPage.verifyLoginErrorMessage("Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect");

    }

}
