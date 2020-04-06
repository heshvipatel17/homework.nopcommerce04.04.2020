package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    String email = null;
    String password = "Abc@123";

    // OBJECT CREATE FOR HOME PAGE
    HomePage homePage = new HomePage();
    // OBJECT CREATE FOR REGISTER PAGE
    RegisterPage registerpage = new RegisterPage();

    @Test
    // METHOD FOR USER NAVIGATE TO REGISTER PAGE
    public void varifyUserShouldNavigateToRegisterPage() {

        // CALL CLICK ON REGISTER LINK METHOD FROM HOME PAGE
        homePage.clickOnRegisterLink();
        // CALL ASSERT METHOD FROM REGISTER PAGE FOR ASSERT ACTUAL AND EXPECTED TEXT
        registerpage.assertTextYourPersonalDetail();

    }
    // RANDOM EMAIL MATHOD
    @BeforeTest
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";


    }

    @Test
    // METHOD FOR REGISTER NOPCOMMERCE
    public void varifyUserShouldRegisterSuccessfully() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        registerpage.clickOnGenderRadioButton();
        registerpage.enterFirstName("Jitu");
        registerpage.enterlastName("Patel");
        registerpage.enterDateField("1");
        registerpage.enterMonthField("January");
        registerpage.enterYearField("2000");
        registerpage.enterEmailId(email);
        registerpage.enterCompanyName("Prime");
        registerpage.enterPassword(password);
        registerpage.enterConfirmPassword(password);
        registerpage.clickOnRegisterButton();
        // CALL ASSERT METHOD FROM REGISTER PAGE AND ASSERT ACTUAL AND EXPECTED TEXT
        registerpage.assertRegisterCompletedText();

    }
}
