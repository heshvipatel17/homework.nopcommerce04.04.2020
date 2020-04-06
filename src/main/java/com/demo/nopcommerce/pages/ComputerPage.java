package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computerText = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopbtn = By.xpath("//li[@class='inactive']//a[@href='/desktops']");


    public void assertComputerText() {
        verifyText(computerText, "Computers");

    }

    public void clickOnDesktopButton() {
        clickOnElement(desktopbtn);
    }

}
