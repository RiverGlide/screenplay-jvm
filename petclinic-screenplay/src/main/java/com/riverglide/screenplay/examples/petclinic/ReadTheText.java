package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.By;

public class ReadTheText extends WebInteraction implements Perform {
    private final By elementLocation;

    public static Perform ofThe(By elementLocation) {
        return new ReadTheText(elementLocation);
    }

    public void performAs(Actor actor) {
        String it = webUser(actor).findElement(elementLocation).getText();
        actor.remember(it);
    }

    private ReadTheText(By elementLocation) {
        this.elementLocation = elementLocation;
    }
}
