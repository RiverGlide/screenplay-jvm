package com.riverglide.screenplay.examples.petclinic.tasks;

import com.riverglide.screenplay.Perform;

public class Leave {
    public static Perform theClinic() {
        return LeaveTheClinic.leaveTheClinic();
    }
}
