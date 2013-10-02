package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.Ability;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map<Class,Ability> abilities = new HashMap<Class,Ability>();
    private Memorable<?> it;

    public Actor with(Ability toDoSomething) {
        acquire(toDoSomething);
        return this;
    }

    private Ability acquire(Ability toDoSomething) {
        return abilities.put(toDoSomething.getClass(), toDoSomething);
    }

    public Ability ability(Class ofAbility) {
        return abilities.get(ofAbility);
    }

    public void attemptTo(Perform... somethings) {
        for(Perform something : somethings) {
            attempt(something);
        }
    }

    public void should(Perform verification) {
        attempt(verification);
    }

    public void remember(Memorable<?> it) {
        this.it = it;
    }

    public <T> T getIt() {
        return it.item();
    }

    private void attempt(Perform task) {
        task.performAs(this);
    }
}