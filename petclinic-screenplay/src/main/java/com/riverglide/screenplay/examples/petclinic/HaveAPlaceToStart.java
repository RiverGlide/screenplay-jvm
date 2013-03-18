package com.riverglide.screenplay.examples.petclinic;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HaveAPlaceToStart implements Perform {

    @Override
    public void performAs(Actor actor) {
        String message = actor.tellsYou(Text.of(Home.screen().welcomeMessage()));
        assertThat(message, is("Welcome"));
    }

    public static HaveAPlaceToStart haveAPlaceToStart() {
        return new HaveAPlaceToStart();
    }
}
