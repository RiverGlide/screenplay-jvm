package com.riverglide.screenplay.examples.petclinic;

public class QuitTheBrowser extends WebInteraction implements Perform {

    public void performAs(Actor actor) {
        webUser(actor).quit();
    }

    public static QuitTheBrowser quitTheBrowser() {
        return new QuitTheBrowser();
    }
}
