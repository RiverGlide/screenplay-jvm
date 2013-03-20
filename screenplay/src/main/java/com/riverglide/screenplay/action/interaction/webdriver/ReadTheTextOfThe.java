package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class ReadTheTextOfThe extends WebDriverInteraction implements Perform {
    private final By elementLocation;

    public static Perform readTheTextOfThe(By elementLocation) {
        return new ReadTheTextOfThe(elementLocation);
    }

    public void performAs(Actor actor) {
        String it = web(actor).findElement(elementLocation).getText();
        actor.remember(it);
    }

    private ReadTheTextOfThe(By elementLocation) {
        this.elementLocation = elementLocation;
    }
}
