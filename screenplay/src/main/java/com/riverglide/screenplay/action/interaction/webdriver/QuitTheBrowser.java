package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;

public class QuitTheBrowser extends WebDriverInteraction implements Perform {

    public void performAs(Actor actor) {
        web(actor).quit();
    }

    public static QuitTheBrowser quitTheBrowser() {
        return new QuitTheBrowser();
    }
}
