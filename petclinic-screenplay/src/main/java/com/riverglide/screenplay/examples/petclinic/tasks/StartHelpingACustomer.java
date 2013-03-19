package com.riverglide.screenplay.examples.petclinic.tasks;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.interaction.Navigate;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.screen.Home;

public class StartHelpingACustomer implements Perform {

    private Home homeScreen = Home.screen();

    public void performAs(Actor actor) {
        actor.attemptsTo(Navigate.toThe(homeScreen));
    }

    public static Perform startHelpingACustomer() {
        return new StartHelpingACustomer();
    }
}
