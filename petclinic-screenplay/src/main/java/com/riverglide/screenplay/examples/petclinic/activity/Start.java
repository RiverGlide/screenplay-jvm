package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.activity.task.StartHelpingACustomer;

import static com.riverglide.screenplay.examples.petclinic.activity.task.StartHelpingACustomer.startHelpingACustomer;

public class Start {
    public static Perform helpingACustomer() {
        return startHelpingACustomer();
    }
}
