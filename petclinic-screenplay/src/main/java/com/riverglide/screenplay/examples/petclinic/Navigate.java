package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebDriver;

public class Navigate implements Perform {

    private final String url;

    public Navigate(String url) {
        this.url = url;
    }

    public void performAs(Actor actor) {
        webUser(actor).get(url);
    }

    private WebDriver webUser(Actor actor) {
        return actor.ability(WebDriver.class);
    }

    public static Navigate toThe(Screen view){
        return new Navigate(view.location());
    }
}