package com.riverglide.screenplay;

import org.openqa.selenium.WebDriver;

public abstract class WebInteraction {
    protected WebDriver webUser(Actor actor) {
        return actor.ability(WebDriver.class);
    }

}
