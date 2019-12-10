package com.company;

public class Potion extends Item {

    public Potion(String name) {
        super(name);
    }

    public boolean drink(){

        return false;
    }

    @Override
    public String toString() {
        return String.format("potion name %s, heals %d, damage %d, weight: %d", getName());
    }
}
