package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.activity.task.LeaveTheClinic;

public class Leave {
    public static Perform theClinic() {
        return LeaveTheClinic.leaveTheClinic();
    }
}
