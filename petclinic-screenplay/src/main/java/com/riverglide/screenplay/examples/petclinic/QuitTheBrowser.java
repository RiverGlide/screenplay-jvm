package com.riverglide.screenplay.examples.petclinic;

public class QuitTheBrowser extends WebInteraction implements Perform {
    @Override
    public void performAs(Actor actor) {
        webUser(actor).quit();
    }

    private QuitTheBrowser(){}

    public static QuitTheBrowser quitTheBrowser() {
        return new QuitTheBrowser();
    }
}
