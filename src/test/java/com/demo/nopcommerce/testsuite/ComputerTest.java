package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    // OBJECT CREATE FOR HOME PAGE
    HomePage homePage = new HomePage();
    // OBJECT CREATE FOR COMPUTER PAGE
    ComputerPage computerPage = new ComputerPage();
    //OBJECT CREATE FOR DESKTOP PAGE
    DesktopPage desktopPage = new DesktopPage();

    public JavascriptExecutor js;
    public JavascriptExecutor jse;


    @Test
    // METHOD FOR NAVIGATE COMPUTER PAGE
    public void UserShouldNavigateToComputerPage() {
        homePage.clickOnComputerLink();
        computerPage.assertComputerText();

    }

    @Test
    // METHOD FOR ADD PRODUCT TO SHOPPING CART
    public void UserShouldAddProductToShoppingCartFromComputerPage() throws InterruptedException {
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
        desktopPage.assertProductAddSuccessfullyText();


    }
}
