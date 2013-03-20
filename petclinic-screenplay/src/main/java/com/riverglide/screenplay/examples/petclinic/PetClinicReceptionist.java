package com.riverglide.screenplay.examples.petclinic;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Role;
import com.riverglide.screenplay.ability.WebBrowsingAbility;

public class PetClinicReceptionist implements Role {
    private Actor actor;

    public PetClinicReceptionist() {
        actor = new Actor().with(new WebBrowsingAbility());
    }

    public Actor actor() {
        return actor;
    }
}
