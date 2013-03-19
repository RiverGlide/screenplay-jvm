package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.activity.task.StartHelpingACustomer;

public class Start {
    public static Perform helpingACustomer() {
        return StartHelpingACustomer.startHelpingACustomer();
    }
}
