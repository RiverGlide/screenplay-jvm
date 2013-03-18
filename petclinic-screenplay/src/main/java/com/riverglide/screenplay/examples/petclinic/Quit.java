package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebDriver;

public class Quit implements Perform {
    @Override
    public void performAs(Actor actor) {
        ((WebDriver)actor.ability(WebDriver.class)).quit();
    }

    private Quit(){}

    public static Quit theBrowser() {
        return new Quit();
    }
}
