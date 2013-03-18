package com.riverglide.screenplay.examples.petclinic;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReceptionistSteps {

    private Actor receptionist = new PetClinicReceptionist().actor();;
    private Home homeScreen = Home.screen();

    @When("^I get started$")
    public void I_get_started() throws Throwable {
        receptionist.attemptsTo(Navigate.toThe(homeScreen));
    }

    @Then("^I should feel welcome$")
    public void I_should_feel_welcome() throws Throwable {
        String message = receptionist.tellsYou(Text.of(homeScreen.welcomeMessage()));
        assertThat(message, is("Welcome"));
    }

    @After
    public void closeBrowser() {
        receptionist.attemptsTo(Quit.theBrowser());
    }
}
