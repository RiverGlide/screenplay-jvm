package com.riverglide.screenplay.examples.petclinic.tasks;

import com.riverglide.screenplay.Perform;

public class Start {
    public static Perform helpingACustomer() {
        return StartHelpingACustomer.startHelpingACustomer();
    }
}
