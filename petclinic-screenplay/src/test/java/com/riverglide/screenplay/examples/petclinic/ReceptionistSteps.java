package com.riverglide.screenplay.examples.petclinic;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReceptionistSteps {

    private Actor receptionist = new PetClinicReceptionist().actor();;
    private WebDriver webBrowsingAbility = receptionist.ability(WebDriver.class);

    @When("^I get started$")
    public void I_get_started() throws Throwable {
        receptionist.attemptsTo(Navigate.toThe(homeScreen()));
    }

    //TODO: Let's discuss this one... should the actor answer questions?
    @Then("^I should feel welcome$")
    public void I_should_feel_welcome() throws Throwable {
        String message = receptionist.tellsYou(Text.of(homeScreen().welcomeMessage()));
        assertThat(message, is("Welcome"));
    }

    private Home homeScreen() {
        return screenFor(webBrowsingAbility, Home.class);
    }

    private <T> T screenFor(WebDriver driver, Class<T> ofScreen) {
        return PageFactory.initElements(driver,ofScreen);
    }

    @After
    public void closeBrowser() {
        receptionist.attemptsTo(Quit.theBrowser());
    }
}
