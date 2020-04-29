package com.demo.xcart.pages;

import com.cucumber.listener.Reporter;
import com.demo.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(css = "input#login")
    WebElement _emailField;

    @FindBy(css = "input#password")
    WebElement _passwordField;

    @FindBy(css = "input#password-conf")
    WebElement _confPassword;

    @FindBy(xpath = "//div[@class='button submit']//button[@type='submit']")
    WebElement _createButton;

    public void enterEmail(String str) {
        Reporter.addStepLog("Entering email id in the email field"+_emailField.toString());
        sendTextToElement(_emailField,"prit"+getRandomString(3)+"@gmail.com");
        log.info("Entering email id in the email field"+_emailField.toString());

    }

    public void enterPassword(String str) {
        Reporter.addStepLog("Entering password in the password field"+_passwordField.toString());
        sendTextToElement(_passwordField, str);
        log.info("Entering password in the password field"+_passwordField.toString());

    }

    public void enterConfPassword(String str) {
        Reporter.addStepLog("Entering conf password in the conf password field"+_confPassword.toString());
        sendTextToElement(_confPassword, str);
        log.info("Entering conf password in the conf password field"+_confPassword.toString());
    }

    public void clickOnCreateButton() {
        Reporter.addStepLog("Clicking on create button"+_createButton.toString());
        clickOnElement(_createButton);
        log.info("Clicking on create button"+_createButton.toString());
    }

}
