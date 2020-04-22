package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.testdata.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void doLogin(String username, String password) {
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username, password);
    }

}
