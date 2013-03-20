package com.riverglide.screenplay;

public class ItemToRemember<T> {

    private final T item;

    public ItemToRemember(T item) {
        this.item = item;
    }

    public <T> T item() {
        return (T)item;
    }
}
