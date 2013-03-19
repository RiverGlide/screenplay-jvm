package com.riverglide.screenplay.examples.petclinic.action;

import com.riverglide.screenplay.Location;
import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.action.interaction.GoToTheLocation.gotToThe;

public class Go {
    public static Perform toThe(Location place) {
        return gotToThe(place);
    }
}
