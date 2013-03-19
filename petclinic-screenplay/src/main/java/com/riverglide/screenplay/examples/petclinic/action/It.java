package com.riverglide.screenplay.examples.petclinic.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.action.interaction.ItSays;

public class It {
    public static Perform says(String something) {
        return ItSays.itSays(something);
    }
}
