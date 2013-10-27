package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.Click;
import com.riverglide.screenplay.examples.petclinic.screen.FindOwners;

public class SearchWith implements Perform {

    @Override
    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(Click.onThe(FindOwners.screen().findOwnersButton()));
    }

    public static Perform searchWith(String searchTerms) {
        return new SearchWith();
    }
}
