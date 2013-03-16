package com.riverglide.screenplay.examples.petclinic;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PetClinicReceptionistSteps {

    private WebDriver driver;

    @When("^I get started$")
    public void I_get_started() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("http://localhost:9966/petclinic");
    }

    @Then("^I should feel welcome$")
    public void I_should_feel_welcome() throws Throwable {
        String message = driver.findElement(By.cssSelector("h2")).getText();
        assertThat(message, is("Welcome"));
    }
}
