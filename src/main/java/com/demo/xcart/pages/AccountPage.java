package com.demo.xcart.pages;

import com.cucumber.listener.Reporter;
import com.demo.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(id = "page-title")
    WebElement _myAccountText;

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement _myAccountButton;

    @FindBy(xpath = "//ul[@class='account-links dropdown-menu']//li[7]")
    WebElement _logoutButton;

    @FindBy(css = "div[class^='dropdown header_bar-my_account']>a")
    WebElement _loginAccounttxt;

    @FindBy(className = "primary-title")
    WebElement _hotdeals;

    @FindBy(xpath = "//div[@id='header-area']//div//div//div//div//span[contains(text(),'Sale')]")
    WebElement _sale;

    @FindBy(xpath = "//li[2]//div[1]//div[2]//div[3]//div[1]//button[1]//span[1]")
    WebElement _addToCart;

    @FindBy(id = "ui-id-3")
    WebElement _productAddedText;

    public void clickOnLogOutButton() {
        Reporter.addStepLog("Clicking on logout button" + _logoutButton.toString());
        clickOnElement(_logoutButton);
        log.info("Clicking on logout button" + _logoutButton.toString());
    }

    public void verifyAccountText(String str) {
        Reporter.addStepLog("Verifying Account text" + _myAccountText.toString());
        verifyText(_myAccountText, str);
        log.info("Verifying Account text" + _myAccountText.toString());
    }

    public void clickOnMyAccountButton() {
        Reporter.addStepLog("Clicking on My account button" + _myAccountButton.toString());
        clickOnElement(_myAccountButton);
        log.info("Clicking on My account button" + _myAccountButton.toString());
    }

    public void verifyLogInAccountText(String str) {
        Reporter.addStepLog("Verifying Log in account text" + _loginAccounttxt.toString());
        verifyText(_loginAccounttxt, str);
        log.info("Verifying Log in account text" + _loginAccounttxt.toString());
    }
    public void clickOnHotDeals(){
        Reporter.addStepLog("Clicking on Hot Deals Link" + _hotdeals.toString());
        clickOnElement(_hotdeals);
        log.info("Clicking on Hot Deals Link" + _hotdeals.toString());
    }
    public void clickOnSale(){
        Reporter.addStepLog("Clicking on Sale Link" + _sale.toString());
        clickOnElement(_sale);
        log.info("Clicking on Hot Deals Link" + _sale.toString());
    }
    public void clickOnAddTocart(){
        Reporter.addStepLog("Clicking on add to cart" + _addToCart.toString());
        clickOnElement(_addToCart);
        log.info("Clicking on add to cart" + _addToCart.toString());
    }
    public void verifyAddToCartText(String str) {
        Reporter.addStepLog("Verifying product added to cart text" + _addToCart.toString());
        verifyText(_addToCart, str);
        log.info("Verifying product added to cart text" + _addToCart.toString());
    }
}
