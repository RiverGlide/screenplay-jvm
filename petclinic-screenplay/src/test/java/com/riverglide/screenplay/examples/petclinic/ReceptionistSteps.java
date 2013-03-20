package com.riverglide.screenplay.examples.petclinic;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.activity.HaveAPlace;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReceptionistSteps {

    private Actor asAReceptionist = new PetClinicReceptionist().actor();

    @When("^I start helping a customer$")
    public void I_start_helping_a_customer() throws Throwable {
        asAReceptionist.attemptTo(Start.helpingACustomer());
    }

    @Then("^I should have a place to start$")
    public void I_should_have_a_place_to_start() throws Throwable {
        asAReceptionist.should(HaveAPlace.toStart());
    }

    @After
    public void goHome() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}
