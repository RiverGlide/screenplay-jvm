package com.riverglide.screenplay;

public class Memorable<T> {

    private final T item;

    public Memorable(T item) {
        this.item = item;
    }

    public <T> T item() {
        return (T)item;
    }
}
