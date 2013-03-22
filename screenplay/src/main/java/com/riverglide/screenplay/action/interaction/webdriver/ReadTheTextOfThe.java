package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Memorable;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class ReadTheTextOfThe extends WebDriverInteraction implements Perform {
    private final By elementLocation;

    public void performAs(Actor actor) {
        actor.remember(new Memorable<String>(readByThe(actor)));
    }

    private String readByThe(Actor actor) {
        return web(actor).findElement(elementLocation).getText();
    }

    public static Perform readTheTextOfThe(By elementLocation) {
        return new ReadTheTextOfThe(elementLocation);
    }

    public ReadTheTextOfThe(By elementLocation) {
        this.elementLocation = elementLocation;
    }
}
