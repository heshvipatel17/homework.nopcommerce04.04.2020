package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
    public void setUp() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    String email = null;

    // RANDOM EMAIL MATHOD
    @BeforeTest(groups = {"Sanity", "Smoke", "Regression"})
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";

    }

    @Test(priority = 0, groups = {"Sanity", "Regression"})
    // METHOD FOR USER NAVIGATE TO REGISTER PAGE
    public void varifyUserShouldNavigateToRegisterPage() {

        // CALL CLICK ON REGISTER LINK METHOD FROM HOME PAGE
        homePage.clickOnRegisterLink();

        // CALL ASSERT METHOD FROM REGISTER PAGE FOR ASSERT ACTUAL AND EXPECTED TEXT
        registerPage.verifytextYourPersonalDetail("Your Personal Details");

    }

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    // METHOD FOR REGISTER NOPCOMMERCE
    public void varifyUserShouldRegisterSuccessfully()  {

        homePage.clickOnRegisterLink();
    //    Thread.sleep(3000);
        registerPage.clickOnGenderRadioButton();
        registerPage.enterFirstName("Jitu");
        registerPage.enterlastName("Patel");
        registerPage.enterDateField("1");
        registerPage.enterMonthField("January");
        registerPage.enterYearField("1998");
        registerPage.enterEmailId(email);
        registerPage.enterCompanyName("Prime");
        registerPage.enterPassword("abc123");
        registerPage.enterConfirmPassword("abc123");
        registerPage.clickOnRegisterButton();
        registerPage.assertRegisterCompletedText("Your registration completed");

    }

    @Test(priority = 2, groups = {"Sanity", "Regression"})
    public void varifyUserShouldNotRegisterWithInvalidCredintial() {

        homePage.clickOnRegisterLink();
    //    Thread.sleep(3000);
        registerPage.clickOnGenderRadioButton();
        registerPage.enterFirstName("Jitu");
        registerPage.enterlastName("Patel");
        registerPage.enterDateField("1");
        registerPage.enterMonthField("January");
        registerPage.enterYearField("1998");
        registerPage.enterEmailId(email);
        registerPage.enterCompanyName("Prime");
        registerPage.enterPassword("abc123");
        registerPage.enterConfirmPassword("abc123");
        registerPage.clickOnRegisterButton();
        registerPage.assertRegisterCompletedText("Your registration completed....");

    }
}