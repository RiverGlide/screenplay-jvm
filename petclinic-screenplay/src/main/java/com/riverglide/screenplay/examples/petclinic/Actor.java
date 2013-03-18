package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map abilities = new HashMap();

    //TODO: This needs to be generic
    public Actor with(WebDriver ability) {
        abilities.put(WebDriver.class , ability);
        return this;
    }

    public <T> T ability(Class ofAbility) {
        return (T)abilities.get(ofAbility);
    }

    public void attemptsTo(Perform interactionOrTask) {
        interactionOrTask.performAs(this);
    }

    public <T> T tellsYou(Question question) {
        return (T) question.answeredBy(this);
    }
}
