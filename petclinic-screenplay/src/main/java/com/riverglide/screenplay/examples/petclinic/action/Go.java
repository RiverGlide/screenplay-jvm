package com.riverglide.screenplay.examples.petclinic.action;

import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.action.interaction.GoToTheLocation.gotToThe;

public class Go {
    public static Perform toThe(Screen place) {
        return gotToThe(place);
    }
}
