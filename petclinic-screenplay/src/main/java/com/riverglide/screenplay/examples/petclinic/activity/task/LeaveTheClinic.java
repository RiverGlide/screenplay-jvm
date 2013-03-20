package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.Quit;

public class LeaveTheClinic implements Perform {
    public static LeaveTheClinic leaveTheClinic() {
        return new LeaveTheClinic();
    }

    public void performAs(Actor receptionist) {
        receptionist.attemptTo(Quit.theBrowser());
    }
}
