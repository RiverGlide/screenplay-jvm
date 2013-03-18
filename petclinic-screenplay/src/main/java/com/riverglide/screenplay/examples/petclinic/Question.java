package com.riverglide.screenplay.examples.petclinic;

public interface Question<T> {

    T answeredBy(Actor actor);
}
