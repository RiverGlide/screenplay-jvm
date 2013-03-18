package com.riverglide.screenplay.examples.petclinic;

public class StartHelpingACustomer implements Perform {

    private Home homeScreen = Home.screen();

    public void performAs(Actor actor) {
        actor.attemptsTo(Navigate.toThe(homeScreen));
    }

    public static Perform startHelpingACustomer() {
        return new StartHelpingACustomer();
    }
}
