package com.riverglide.screenplay.action.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.WebDriverInteraction;

public class QuitTheBrowser extends WebDriverInteraction implements Perform {

    public void performAs(Actor actor) {
        web(actor).quit();
    }

    public static QuitTheBrowser quitTheBrowser() {
        return new QuitTheBrowser();
    }
}
