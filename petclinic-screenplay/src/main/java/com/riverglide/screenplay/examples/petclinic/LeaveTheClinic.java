package com.riverglide.screenplay.examples.petclinic;

public class LeaveTheClinic implements Perform {
    public static LeaveTheClinic leaveTheClinic() {
        return new LeaveTheClinic();
    }

    @Override
    public void performAs(Actor actor) {
        actor.attemptsTo(Quit.theBrowser());
    }
}
