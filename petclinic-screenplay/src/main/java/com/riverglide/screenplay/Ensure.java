package com.riverglide.screenplay;

public class Ensure implements Perform {
    private final Perform expectation;

    public static Ensure that(Perform expectation) {
        return new Ensure(expectation);
    }

    public void performAs(Actor actor) {
        actor.attemptsTo(expectation);
    }

    private Ensure(Perform expectation) {
        this.expectation = expectation;
    }
}
