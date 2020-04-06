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

    public void assertTextYourPersonalDetail() {
        verifyText(registerText, "Your Personal Details");
    }

    public void assertRegisterCompletedText() {
        verifyText(registationCompletedText, "Your registration completed");
    }

    public void clickOnGenderRadioButton() {
        clickOnElement(genderField);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterlastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterDateField(String date) {
        sendTextToElement(dateField, date);
    }

    public void enterMonthField(String month) {
        sendTextToElement(monthField, month);
    }

    public void enterYearField(String year) {
        sendTextToElement(yearField, year);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String companyName) {
        sendTextToElement(companyNameField, companyName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutOnNopCommerce);
    }
}
