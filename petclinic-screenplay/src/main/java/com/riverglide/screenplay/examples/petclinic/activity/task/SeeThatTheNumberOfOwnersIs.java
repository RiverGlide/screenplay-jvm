package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.CountTheNumberOf;
import com.riverglide.screenplay.action.It;
import com.riverglide.screenplay.examples.petclinic.screen.Owners;

public class SeeThatTheNumberOfOwnersIs implements Perform {
    private int expectedNumberOfOwners;

    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                CountTheNumberOf.tableRowsIn(Owners.screen().listOfOwners()),
                Ensure.that(It.contains(expectedNumberOfOwners))
        );
    }

    public SeeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        this.expectedNumberOfOwners = expectedNumberOfOwners;
    }

    public static SeeThatTheNumberOfOwnersIs seeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        return new SeeThatTheNumberOfOwnersIs(expectedNumberOfOwners);
    }
}
