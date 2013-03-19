package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.WebInteraction;

public class QuitTheBrowser extends WebInteraction implements Perform {

    public void performAs(Actor actor) {
        webUser(actor).quit();
    }

    public static QuitTheBrowser quitTheBrowser() {
        return new QuitTheBrowser();
    }
}
