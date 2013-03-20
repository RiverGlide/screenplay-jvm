package com.riverglide.screenplay.examples.petclinic;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.ability.WebBrowsing;

public class PetClinicReceptionist {

    public static Actor actor() {
        return new Actor().with(WebBrowsing.ability());
    }
}
