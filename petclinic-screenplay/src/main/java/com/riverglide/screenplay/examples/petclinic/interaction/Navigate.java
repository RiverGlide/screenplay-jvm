package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.WebInteraction;

public class Navigate extends WebInteraction implements Perform {

    private final String url;

    public static Navigate toThe(Screen view){
        return new Navigate(view.location());
    }

    public void performAs(Actor actor) {
        webUser(actor).get(url);
    }

    private Navigate(String url) {
        this.url = url;
    }
}