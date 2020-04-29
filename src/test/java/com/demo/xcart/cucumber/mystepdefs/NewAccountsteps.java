package com.demo.xcart.cucumber.mystepdefs;

import com.demo.xcart.pages.AccountPage;
import com.demo.xcart.pages.LoginPage;
import com.demo.xcart.pages.NewAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NewAccountsteps {

    @And("^I click on create new account$")
    public void iClickOnCreateNewAccount() {
        new LoginPage().clickOnCreateAccount();

    }

    @And("^I enter email in the email field \"([^\"]*)\"$")
    public void iEnterEmailInTheEmailField(String email) {
        new NewAccountPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new NewAccountPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password) {
        new NewAccountPage().enterConfPassword(password);
    }

    @And("^I click on create account$")
    public void iClickOnCreateAccount() {
        new NewAccountPage().clickOnCreateButton();
    }

    @Then("^I see My account text\"([^\"]*)\"$")
    public void iSeeMyAccountText(String str) {
        new AccountPage().verifyAccountText(str);
    }

    @And("^I click on Hot Deals$")
    public void iClickOnHotDeals() {
        new AccountPage().clickOnHotDeals();
    }

    @And("^I click on Sale$")
    public void iClickOnSale() {
        new AccountPage().clickOnSale();
    }

    @Then("^I add a product to basket$")
    public void iAddAProductToBasket() {
        new AccountPage().clickOnAddTocart();
    }

    @Then("^I see product added text\"([^\"]*)\"$")
    public void iSeeProductAddedText(String str) {
        new AccountPage().verifyAddToCartText(str);
    }
}
