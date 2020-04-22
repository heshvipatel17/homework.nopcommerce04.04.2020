package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;

    @FindBy(linkText = "Computers")
    WebElement _computerLink;

    // METHOD FOR CLICK ON LOGIN LINK
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link : " + _loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link : " + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register link : " + _registerLink.toString());
    }

    //  METHOD FOR CLICK ON COMPUTER LINK
    public void clickOnComputerLink() {
        Reporter.log("Clicking on Computer link : " + _computerLink.toString() + "<br>");
        clickOnElement(_computerLink);
        log.info("Clicking on Computer link : " + _computerLink.toString());
    }

}
