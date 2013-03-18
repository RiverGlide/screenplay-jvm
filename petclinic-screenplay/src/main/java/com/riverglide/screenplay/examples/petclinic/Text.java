package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.By;

public class Text extends WebInteraction implements Question<String> {
    private final By elementLocation;

    public Text(By elementLocation) {
        this.elementLocation = elementLocation;
    }

    @Override
    public String answeredBy(Actor actor) {
        return webUser(actor).findElement(elementLocation).getText();
    }

    public static Question of(By elementLocation) {
        return new Text(elementLocation);
    }
}
