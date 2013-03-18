package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebDriver;

public abstract class WebInteraction {
    protected WebDriver webUser(Actor actor) {
        return actor.ability(WebDriver.class);
    }

}
