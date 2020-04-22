package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;
    LoadProperty loadProperty;
    DesktopPage desktopPage;

    @BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
    public void setUp(){
        homePage=new HomePage();
        computerPage=new ComputerPage();
        loadProperty=new LoadProperty();
        desktopPage = new DesktopPage();
    }


    public JavascriptExecutor js;
    public JavascriptExecutor jse;


    @Test(priority = 0, groups = {"Sanity", "Regression"})
    // METHOD FOR NAVIGATE COMPUTER PAGE
    public void UserShouldNavigateToComputerPage() {
        homePage.clickOnComputerLink();

        String expectedResult = "Computers";
        String actualResult = computerPage.assertComputerText();
        Assert.assertEquals(expectedResult, actualResult);
    //    computerPage.assertComputerText();

    }

    @Test(priority = 1, groups = {"Smke", "Regression"})
    // METHOD FOR ADD PRODUCT TO SHOPPING CART
    public void verifyUserShouldAddProductToCartSuccessfully() throws InterruptedException {
        homePage.clickOnComputerLink();
        Thread.sleep(3000);
        computerPage.clickOnDesktopButton();

        //to scrool the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");

        Thread.sleep(2000);
        desktopPage.clickOnBuiltYourOwnComputerLink();

        //to scroll the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");
        Thread.sleep(2000);

        desktopPage.clickOn400GBHarddrive();
        desktopPage.clickAddToCartButton();
        // CALL ASSERT METHOD FROM DESKTOP PAGE AND ASSSERT ACTUAL AND EXPECTED TEXT
    //    desktopPage.assertProductAddSuccessfullyText();

        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = desktopPage.assertProductAddSuccessfullyText();
        Assert.assertEquals(expectedResult, actualResult);


    }
    @Test(priority = 2, groups = {"Smke", "Regression"})
    // METHOD FOR ADD PRODUCT TO SHOPPING CART
    public void verifyUserShouldNotAddProductToCartSuccessfully() throws InterruptedException {
        homePage.clickOnComputerLink();
        Thread.sleep(3000);
        computerPage.clickOnDesktopButton();

        //to scrool the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");

        Thread.sleep(2000);
        desktopPage.clickOnBuiltYourOwnComputerLink();

        //to scroll the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");
        Thread.sleep(2000);

        desktopPage.clickOn400GBHarddrive();
        desktopPage.clickAddToCartButton();
        // CALL ASSERT METHOD FROM DESKTOP PAGE AND ASSSERT ACTUAL AND EXPECTED TEXT
        //    desktopPage.assertProductAddSuccessfullyText();

        String expectedResult = "The product has been added to your shopping cart...";
        String actualResult = desktopPage.assertProductAddSuccessfullyText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
