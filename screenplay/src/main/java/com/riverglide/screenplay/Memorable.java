package com.riverglide.screenplay;

public class Memorable<THING> {

    private final THING toRemember;

    public Memorable(THING toRemember) {
        this.toRemember = toRemember;
    }

    public <T> T item() {
        return (T) toRemember;
    }
}
