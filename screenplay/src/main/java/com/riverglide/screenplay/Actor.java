package com.riverglide.screenplay;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map abilities = new HashMap();
    private String it;

    //TODO: This needs to be generic
    public Actor with(WebDriver ability) {
        abilities.put(WebDriver.class , ability);
        return this;
    }

    public <T> T ability(Class ofAbility) {
        return (T)abilities.get(ofAbility);
    }

    public void attemptsTo(Perform interactionOrTask) {
        attempt(interactionOrTask);
    }

    public void should(Perform expectationCheck) {
        attempt(expectationCheck);
    }

    public void doesTheFollowing(Perform...tasks) {
        for(Perform task : tasks) {
            attempt(task);
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