package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebElement;

public class Text extends WebInteraction implements Question<String> {
    private final WebElement webElement;

    public Text(WebElement webElement) {
        this.webElement = webElement;
    }

    @Override
    public String answeredBy(Actor actor) {
        return webElement.getText();
    }

    public static Question of(WebElement webElement) {
        return new Text(webElement);
    }
}
