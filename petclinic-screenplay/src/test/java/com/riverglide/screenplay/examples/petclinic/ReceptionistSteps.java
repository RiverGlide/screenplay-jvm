package com.riverglide.screenplay.examples.petclinic;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReceptionistSteps {

    private Actor receptionist = new PetClinicReceptionist().actor();

    @When("^I start helping a customer$")
    public void I_start_helping_a_customer() throws Throwable {
        receptionist.attemptsTo(Start.helpingACustomer());
    }

    @Then("^I should have a place to start$")
    public void I_should_have_a_place_to_start() throws Throwable {
        receptionist.should(HaveAPlace.toStart());
    }

    @After
    public void goHome() {
        receptionist.attemptsTo(Leave.theClinic());
    }
}
