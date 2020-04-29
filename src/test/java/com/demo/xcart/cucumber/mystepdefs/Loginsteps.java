package com.demo.xcart.cucumber.mystepdefs;

import com.cucumber.listener.Reporter;
import com.demo.xcart.pages.AccountPage;
import com.demo.xcart.pages.HomePage;
import com.demo.xcart.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("i am on Home Page" + "https://demostore.x-cart.com/");

    }

    @When("^I click on sign in tab$")
    public void iClickOnSignInTab() {
        new HomePage().clickOnSignInTab();
    }

    @And("^I enter \"([^\"]*)\" id in the email field$")
    public void iEnterIdInTheEmailField(String email) {
        new LoginPage().enterLoginEmail(email);

    }

    @And("^I enter \"([^\"]*)\"in the password fiel$")
    public void iEnterInThePasswordFiel(String pwd) {
        new LoginPage().enterLoginPassword(pwd);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new LoginPage().clickOnSignInButton();
    }

    @Then("^I am logged in successfully and I see the Log in Text\"([^\"]*)\"$")
    public void iAmLoggedInSuccessfullyAndISeeTheLogInText(String str) {
        new AccountPage().verifyAccountText(str);

    }

    @And("^I click on my account drop down$")
    public void iClickOnMyAccountDropDown() {
        new AccountPage().clickOnMyAccountButton();
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new AccountPage().clickOnLogOutButton();
    }

    @Then("^I see sigin/sign out text \"([^\"]*)\"$")
    public void iSeeSiginSignOutText(String text){
        new HomePage().verifySignInText(text);

    }

}
