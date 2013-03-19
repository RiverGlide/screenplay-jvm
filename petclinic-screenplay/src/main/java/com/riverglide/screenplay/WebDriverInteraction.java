package com.riverglide.screenplay;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverInteraction {
    protected WebDriver web(Actor actor) {
        return actor.ability(WebDriver.class);
    }

}
