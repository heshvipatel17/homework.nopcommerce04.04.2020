package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EndToEndTest extends TestBase {

    String email = null;
    String password = "Abc@123";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @BeforeTest(groups = {"Sanity","Smoke","Regression"})
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";


    }

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    // METHOD FOR REGISTER NOPCOMMERCE WEBSITE
    public void varifyUserShouldRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        registerPage.clickOnGenderRadioButton();
        registerPage.enterFirstName("Jitu");
        registerPage.enterlastName("Patel");
        registerPage.enterDateField("1");
        registerPage.enterMonthField("January");
        registerPage.enterYearField("2000");
        registerPage.enterEmailId(email);
        registerPage.enterCompanyName("Prime");
        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(password);
        registerPage.clickOnRegisterButton();

        registerPage.assertRegisterCompletedText();

        registerPage.clickOnLogOutButton();
    }

    @Test(priority = 2, groups = {"Sanity", "Regression"})
    // METHOD FOR LOGIN NOPCOMMERCE WEBSITE
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(3000);
//
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();

//        Thread.sleep(3000);
        //Assert Welcome to our store text
        loginPage.assertgetWelcomeStoreText();

    }
}

