package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Text implements Question<String> {
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
