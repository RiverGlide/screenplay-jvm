package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.activity.task.HaveAPlaceToStart;

public class HaveAPlace {
    public static Perform toStart() {
        return HaveAPlaceToStart.haveAPlaceToStart();
    }
}
