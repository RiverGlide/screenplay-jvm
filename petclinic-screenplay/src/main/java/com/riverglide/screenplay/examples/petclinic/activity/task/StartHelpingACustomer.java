package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.action.Go;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.screen.Home;

public class StartHelpingACustomer implements Perform {

    private Home location = Home.screen();

    public void performAs(Actor actor) {
        actor.attemptsTo(Go.toThe(location));
    }

    public static Perform startHelpingACustomer() {
        return new StartHelpingACustomer();
    }
}
