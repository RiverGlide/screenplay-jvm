package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.WebInteraction;
import org.openqa.selenium.By;

public class ReadTheTextOfThe extends WebInteraction implements Perform {
    private final By elementLocation;

    public static Perform readTheTextOfThe(By elementLocation) {
        return new ReadTheTextOfThe(elementLocation);
    }

    public void performAs(Actor actor) {
        String it = webUser(actor).findElement(elementLocation).getText();
        actor.remember(it);
    }

    private ReadTheTextOfThe(By elementLocation) {
        this.elementLocation = elementLocation;
    }
}
