package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    // OBJECT CREATE FOR HOME PAGE
    HomePage homePage = new HomePage();
    // OBJECT CREATE FOR LOGIN PAGE
    LoginPage loginPage = new LoginPage();

    @Test
    //  METHOD USER SHOULD NAVIGATE TO LOGIN PAGE
    public void verifyUserShouldNavigateToLoginPage() {

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();
        // CALL ASSERT ON WELCOME TEXT FROM LOGIN PAGE
        loginPage.assertgetWelcomeText();

    }

    @Test
    // METHOD USER SHOULD LOGIN SUCCESSFULLY
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {

        // CALL CLICK ON LOGIN LINK METHOD FROM HOME PAGE
        homePage.clickOnLoginLink();
        Thread.sleep(3000);
        // CALL EMAIL METHOD FROM LOGIN PAGE AND ENTER EMAIL ID
        loginPage.enterEmailId("heshvipatel17@gmail.com");
        // CALL PASSWORD METHOD FROM LOGIN PAGE AND ENTER PASSWORD
        loginPage.enterPassword("Abc@123");
        // CALL CLICK ON LOGIN BUTTON METHOD FROM LOGIN PAGE
        loginPage.clickOnLoginButton();
        // CALL ASSERT METHOD FROM LOGIN PAGE AND ASSERT ACTUAL AND EXPECTED TEXT
        loginPage.assertgetWelcomeStoreText();

    }
}


