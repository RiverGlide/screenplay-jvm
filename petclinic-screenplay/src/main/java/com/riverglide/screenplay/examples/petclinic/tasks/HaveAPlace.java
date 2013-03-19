package com.riverglide.screenplay.examples.petclinic.tasks;

import com.riverglide.screenplay.Perform;

public class HaveAPlace {
    public static Perform toStart() {
        return HaveAPlaceToStart.haveAPlaceToStart();
    }
}
