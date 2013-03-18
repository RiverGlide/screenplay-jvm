package com.riverglide.screenplay.examples.petclinic;

public class It {
    public static Perform says(String something) {
        return ItSays.itSays(something);
    }
}
