package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        loginPage.assertgetWelcomeText();

    }

    @Test
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(3000);

        loginPage.enterEmailId("heshvipatel17@gmail.com");
        loginPage.enterPassword("Abc@123");
        loginPage.clickOnLoginButton();

        String expectedLoginText = "Welcome to our store";
//        Thread.sleep(3000);
        loginPage.assertgetWelcomeStoreText();

    }
}

