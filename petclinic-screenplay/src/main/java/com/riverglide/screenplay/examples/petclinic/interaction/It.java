package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Perform;

public class It {
    public static Perform says(String something) {
        return ItSays.itSays(something);
    }
}
