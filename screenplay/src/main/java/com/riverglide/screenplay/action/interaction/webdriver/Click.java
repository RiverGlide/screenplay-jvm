package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class Click extends WebDriverInteraction implements Perform {

    private By ofInterest;

    public Click(By elementOfInterest) {
        ofInterest = elementOfInterest;
    }

    public void performAs(Actor actor) {
        web(actor).findElement(ofInterest).click();
    }

    public static Click onThe(By elementOfInterest) {
        return new Click(elementOfInterest);
    }
}
