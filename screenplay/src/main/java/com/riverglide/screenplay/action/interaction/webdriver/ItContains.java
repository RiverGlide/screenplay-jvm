package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItContains implements Perform {
    private final Integer asExpected;

    public void performAs(Actor actor) {
        Integer it = actor.getIt();
        assertThat(it, is(asExpected));
    }

    public static Perform itContains(Integer something) {
        return new ItContains(something);
    }

    private ItContains(Integer something) {
        asExpected = something;
    }
}
