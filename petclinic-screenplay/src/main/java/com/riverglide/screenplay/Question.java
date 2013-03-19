package com.riverglide.screenplay;

public interface Question<T> {

    T answeredBy(Actor actor);
}
