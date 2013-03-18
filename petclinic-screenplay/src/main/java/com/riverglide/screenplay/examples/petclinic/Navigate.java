package com.riverglide.screenplay.examples.petclinic;

public class Navigate extends WebInteraction implements Perform {

    private final String url;

    public static Navigate toThe(Screen view){
        return new Navigate(view.location());
    }

    public void performAs(Actor actor) {
        webUser(actor).get(url);
    }

    private Navigate(String url) {
        this.url = url;
    }
}