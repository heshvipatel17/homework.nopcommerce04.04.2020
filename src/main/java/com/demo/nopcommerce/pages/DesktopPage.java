package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By builtYrOwnComLink = By.linkText("Build your own computer");
    By harddrive400GB = By.id("product_attribute_3_7");
    By addtoCartbtn = By.id("add-to-cart-button-1");
    By productAddSfullyText = By.xpath("//p[@class='content']");

    // METHOD FOR CLICK ON BUILD YOUR OWN COMPUTER LINK
    public void clickOnBuiltYourOwnComputerLink() {
        clickOnElement(builtYrOwnComLink);
    }
    // METHOD FOR CLICK ON 400GB HARDDRIVE
    public void clickOn400GBHarddrive() {
        clickOnElement(harddrive400GB);
    }
    // METHOD FOR CLICK ON ADD TO CART BUTTON
    public void clickAddToCartButton() {
        clickOnElement(addtoCartbtn);
    }
    // METHOD FOR ASSERT PRODUCT ADD SUCESSFULLY TEXT

    public String assertProductAddSuccessfullyText() {
        return getTextFromElement(productAddSfullyText);
    }
}
