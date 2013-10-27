package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Memorable;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class CountTheNumberOfTableRows extends WebDriverInteraction implements Perform {
    private final By elementLocation;

    public void performAs(Actor actor) {
        actor.remember(new Memorable<Integer>(numberOfTableRowsSeenBy(actor)));
    }

    private Integer numberOfTableRowsSeenBy(Actor actor) {
        return web(actor).findElement(elementLocation).findElements(By.tagName("tr")).size();
    }

    public static Perform countTheNumberOfTableRows(By elementLocation) {
        return new CountTheNumberOfTableRows(elementLocation);
    }

    public CountTheNumberOfTableRows(By elementLocation) {
        this.elementLocation = elementLocation;
    }
}
