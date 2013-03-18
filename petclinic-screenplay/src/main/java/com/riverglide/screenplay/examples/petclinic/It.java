package com.riverglide.screenplay.examples.petclinic;

import static com.riverglide.screenplay.examples.petclinic.ItSays.itSays;

public class It {
    public static Perform says(String something) {
        return itSays(something);
    }
}
