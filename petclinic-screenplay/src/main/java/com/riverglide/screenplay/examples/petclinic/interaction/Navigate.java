package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.Screen;

import static com.riverglide.screenplay.examples.petclinic.interaction.NavigateToThe.navigateToThe;

public class Navigate {
    public static Perform toThe(Screen view) {
        return navigateToThe(view);
    }
}
