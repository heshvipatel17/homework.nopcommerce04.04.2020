package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By computerLink = By.linkText("Computers");

// METHOD FOR CLICK ON LOGIN LINK
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

// METHOD FOR CLICK ON REGISTER LINK
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

//  METHOD FOR CLICK ON COMPUTER LINK
    public void clickOnComputerLink(){
        clickOnElement(computerLink);
    }

}
