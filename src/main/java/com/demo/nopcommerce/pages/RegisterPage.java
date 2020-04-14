package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//div[@class='title']//strong[text()='Your Personal Details']");

    By genderField = By.xpath("//input[@id='gender-male']");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By dateField = By.xpath("//select[@name='DateOfBirthDay']");
    By monthField = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearField = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyNameField = By.xpath("//input[@name='Company']");
    By passwordField = By.xpath("//input[@name='Password']");
    By confirmPasswordField = By.xpath("//input[@name='ConfirmPassword']");
    By registerBtn = By.xpath("//input[@name='register-button']");
    By registationCompletedText = By.xpath("//div[@class='page-body']//div[text()='Your registration completed']");
    By logOutOnNopCommerce = By.xpath("//a[@class='ico-logout']");

    // METHOD FOR ASSERT YOUR PERSONAL DETAIL TEXT
    public String assertTextYourPersonalDetail() {
        return getTextFromElement(registerText);
    }

    // METHOD FOR ASSERT REGISTER COMPLETED TEXT
    public String assertRegisterCompletedText() {
        return getTextFromElement(registationCompletedText);
    }

    //    public String assertRegisterCompletedText() {
    //      getTextFromElement(registationCompletedText);
    //}

    // METHOD FOR CLICK ON GENDER RADIO BUTTON
    public void clickOnGenderRadioButton() {
        clickOnElement(genderField);
    }

    // METHOD FOR ENTER FIRST NAME
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    // METHOD FOR ENTER LAST NAME
    public void enterlastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    // METHOD FOR ENTER DATE
    public void enterDateField(String date) {
        sendTextToElement(dateField, date);
    }

    // METHOD FOR ENTER MONTH
    public void enterMonthField(String month) {
        sendTextToElement(monthField, month);
    }

    // METHOD FOR ENTER YEAR
    public void enterYearField(String year) {
        sendTextToElement(yearField, year);
    }

    // METHOD FOR ENTER EMAIL
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    // METHOD FOR ENTER COMPANY NAME
    public void enterCompanyName(String companyName) {
        sendTextToElement(companyNameField, companyName);
    }

    // METHOD FOR ENTER PASSWORD
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    // METHOD FOR ENTER CONFIRM PASSWORD
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    // METHOD FOR CLICK ON REGISTER BUTTON
    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
    }

    // METHOD FOR LOGOUT FROM NOPCOMMERCE
    public void clickOnLogOutButton() {
        clickOnElement(logOutOnNopCommerce);
    }
}
