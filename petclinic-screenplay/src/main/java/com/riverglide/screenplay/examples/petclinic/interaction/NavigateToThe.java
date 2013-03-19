package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.WebInteraction;

public class NavigateToThe extends WebInteraction implements Perform {

    private final String url;

    public static NavigateToThe navigateToThe(Screen view){
        return new NavigateToThe(view.location());
    }

    public void performAs(Actor actor) {
        webUser(actor).get(url);
    }

    private NavigateToThe(String url) {
        this.url = url;
    }
}