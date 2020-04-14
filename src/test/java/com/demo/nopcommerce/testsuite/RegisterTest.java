package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    String email = null;
//    String password = "Abc@123";

    // OBJECT CREATE FOR HOME PAGE
    HomePage homePage = new HomePage();
    // OBJECT CREATE FOR REGISTER PAGE
    RegisterPage registerpage = new RegisterPage();
    LoadProperty loadProperty = new LoadProperty();
    //getting key from config.properties
    String firstName = loadProperty.getProperty("firstName");
    String lastName = loadProperty.getProperty("lastName");
    String password = loadProperty.getProperty("password");
    String companyName = loadProperty.getProperty("companyName");
    String dayDOB = loadProperty.getProperty("dayDOB");
    String monthDOB = loadProperty.getProperty("monthDOB");
    String yearDOB = loadProperty.getProperty("yearDOB");

    // RANDOM EMAIL MATHOD
    @BeforeTest(groups = {"Sanity","Smoke","Regression"})
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";

    }

    @Test(priority = 0, groups = {"Sanity", "Regression"})
    // METHOD FOR USER NAVIGATE TO REGISTER PAGE
    public void varifyUserShouldNavigateToRegisterPage() {

        // CALL CLICK ON REGISTER LINK METHOD FROM HOME PAGE
        homePage.clickOnRegisterLink();
        // CALL ASSERT METHOD FROM REGISTER PAGE FOR ASSERT ACTUAL AND EXPECTED TEXT
        registerpage.assertTextYourPersonalDetail();

    }

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    // METHOD FOR REGISTER NOPCOMMERCE
    public void varifyUserShouldRegisterSuccessfully() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        registerpage.clickOnGenderRadioButton();
        registerpage.enterFirstName(firstName);
        registerpage.enterlastName(lastName);
        registerpage.enterDateField(dayDOB);
        registerpage.enterMonthField(monthDOB);
        registerpage.enterYearField(yearDOB);
        registerpage.enterEmailId(email);
        registerpage.enterCompanyName(companyName);
        registerpage.enterPassword(password);
        registerpage.enterConfirmPassword(password);
        registerpage.clickOnRegisterButton();
        // CALL ASSERT METHOD FROM REGISTER PAGE AND ASSERT ACTUAL AND EXPECTED TEXT
        registerpage.assertRegisterCompletedText();

    }
}
