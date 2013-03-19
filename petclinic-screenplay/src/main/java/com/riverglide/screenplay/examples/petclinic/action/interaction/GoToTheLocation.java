package com.riverglide.screenplay.examples.petclinic.action.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.WebDriverInteraction;

public class GoToTheLocation extends WebDriverInteraction implements Perform {

    private final String url;

    public static GoToTheLocation gotToThe(Screen place){
        return new GoToTheLocation(place.address());
    }

    public void performAs(Actor user) {
        web(user).get(url);
    }

    private GoToTheLocation(String url) {
        this.url = url;
    }
}