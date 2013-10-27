package com.riverglide.screenplay.examples.petclinic;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.activity.HaveAPlace;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import com.riverglide.screenplay.examples.petclinic.activity.task.ChooseToFindAnOwner;
import com.riverglide.screenplay.examples.petclinic.activity.task.SearchWith;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.riverglide.screenplay.examples.petclinic.activity.task.ChooseToFindAnOwner.chooseToFindAnOwner;
import static com.riverglide.screenplay.examples.petclinic.activity.task.SearchWith.searchWith;

public class ReceptionistSteps {

    public static final String BLANK_INFORMATION = "";
    private Actor asAReceptionist = PetClinicReceptionist.actor();

    @Given("^I have chosen to find owners$")
    public void I_have_chosen_to_find_owners() throws Throwable {
        asAReceptionist.attemptTo(chooseToFindAnOwner());
    }

    @When("^I start helping a customer$")
    public void I_start_helping_a_customer() throws Throwable {
        asAReceptionist.attemptTo(Start.helpingACustomer());
    }

    @Then("^I should have a place to start$")
    public void I_should_have_a_place_to_start() throws Throwable {
        asAReceptionist.should(HaveAPlace.toStart());
    }

    @When("^I search without providing any details$")
    public void I_search_without_providing_any_details() throws Throwable {
        asAReceptionist.attemptTo(searchWith(BLANK_INFORMATION));
    }

    @Then("^I should see all owners$")
    public void I_should_see_all_owners() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }


    @After
    public void goHome() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}
