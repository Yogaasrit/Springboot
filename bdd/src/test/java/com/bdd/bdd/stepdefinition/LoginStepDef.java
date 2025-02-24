package com.bdd.bdd.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginStepDef {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("Info: user is on login page");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        System.out.println("Info: user enters username and password");
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        System.out.println("Info: clicks the login button");
    }

    @Then("user should be navigated to home page")
    public void userShouldBeNavigatedToHomePage() {
        System.out.println("Info: user should be navigated to home page");
    }
}
