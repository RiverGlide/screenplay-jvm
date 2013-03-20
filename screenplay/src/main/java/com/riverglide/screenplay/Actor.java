package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.Ability;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map<Class,Ability> abilities = new HashMap<Class,Ability>();
    private ItemToRemember<?> it;

    public Actor with(Ability toDoSomething) {
        abilities.put(toDoSomething.getClass(), toDoSomething);
        return this;
    }

    public Ability ability(Class ofAbility) {
        return abilities.get(ofAbility);
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

    public void remember(ItemToRemember<?> it) {
        this.it = it;
    }

    public ItemToRemember<?> getIt() {
        return it;
    }

    private void attempt(Perform task) {
        task.performAs(this);
    }
}