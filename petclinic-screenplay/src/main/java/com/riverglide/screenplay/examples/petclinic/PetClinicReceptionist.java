package com.riverglide.screenplay.examples.petclinic;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Role;
import com.riverglide.screenplay.ability.WebBrowsing;

public class PetClinicReceptionist implements Role {
    private Actor actor;

    public PetClinicReceptionist() {
        actor = new Actor().with(WebBrowsing.ability());
    }

    public Actor actor() {
        return actor;
    }
}
