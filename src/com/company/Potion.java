package com.company;

public class Potion extends Item {

    public Potion(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return String.format("potion name %s, heals %d", getName());
    }
}
