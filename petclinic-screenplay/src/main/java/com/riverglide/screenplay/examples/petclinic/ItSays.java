package com.riverglide.screenplay.examples.petclinic;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItSays implements Perform {
    private final String asExpected;

    public static Perform itSays(String something) {
        return new ItSays(something);
    }

    public void performAs(Actor actor) {
        String information = actor.getIt();
        assertThat(information, is(asExpected));
    }

    private ItSays(String something) {
        asExpected = something;
    }
}
