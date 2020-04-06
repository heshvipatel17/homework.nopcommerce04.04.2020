package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computerText = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopbtn = By.xpath("//li[@class='inactive']//a[@href='/desktops']");

    // METHOD FOR ASSERT COMPUTER TEXT
    public void assertComputerText() {
        verifyText(computerText, "Computers");

    }
    // METHOD FOR CLICK ON DESKTOP BUTTON
    public void clickOnDesktopButton() {
        clickOnElement(desktopbtn);
    }

}
