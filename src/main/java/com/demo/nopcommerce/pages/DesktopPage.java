package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By builtYrOwnComLink = By.linkText("Build your own computer");
    By harddrive400GB = By.id("product_attribute_3_7");
    By addtoCartbtn = By.id("add-to-cart-button-1");
    By productAddSfullyText = By.xpath("//p[@class='content']");

    public void clickOnBuiltYourOwnComputerLink() {
        clickOnElement(builtYrOwnComLink);
    }

    public void clickOn400GBHarddrive() {
        clickOnElement(harddrive400GB);
    }

    public void clickAddToCartButton() {
        clickOnElement(addtoCartbtn);
    }

    public void assertProductAddSuccessfullyText() {
        verifyText(productAddSfullyText, "The product has been added to your shopping cart");
    }
}
