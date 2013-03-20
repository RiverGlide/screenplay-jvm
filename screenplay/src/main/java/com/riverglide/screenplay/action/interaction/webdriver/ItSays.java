package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItSays implements Perform {
    private final String asExpected;

    public void performAs(Actor actor) {
        String it = actor.getIt().item();
        assertThat(it, is(asExpected));
    }

    public static Perform itSays(String something) {
        return new ItSays(something);
    }

    private ItSays(String something) {
        asExpected = something;
    }
}
