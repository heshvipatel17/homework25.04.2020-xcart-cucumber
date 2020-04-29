package com.demo.xcart.pages;

import com.cucumber.listener.Reporter;
import com.demo.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div[@id='header-bar']//div//span[contains(text(),'Sign in')]")
    WebElement _signInTab;

    public void verifySignInText(String str){
        Reporter.addStepLog("verifying Sign in text on Home page"+_signInTab.toString());
        verifyText(_signInTab,str);
        log.info("verifying Sign in text on Home page"+_signInTab.toString());
    }

    public void clickOnSignInTab() {
        Reporter.addStepLog("Clicking on sign in link on home page"+_signInTab.toString());
        clickOnElement(_signInTab);
        log.info("Clicking on sign in link on home page"+_signInTab.toString());
    }

}
