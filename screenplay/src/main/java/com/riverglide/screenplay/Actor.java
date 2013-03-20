package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.Ability;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map abilities = new HashMap();
    private String it;

    //TODO: This needs to be generic
    public <T> Actor with(Ability ability) {
        abilities.put(ability.getClass() , ability.ability());
        return this;
    }

    public <T> T ability(Class ofAbility) {
        return (T)abilities.get(ofAbility);
    }

    public void attemptTo(Perform something) {
        attempt(something);
    }

    public void should(Perform verification) {
        attempt(verification);
    }

    public void doTheFollowing(Perform... someThings) {
        for(Perform something : someThings) {
            attempt(something);
        }
    }

    public void remember(String it) {
        this.it = it;
    }

    public String getIt() {
        return it;
    }

    private void attempt(Perform task) {
        task.performAs(this);
    }
}