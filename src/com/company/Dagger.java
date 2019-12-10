package com.company;

public class Dagger extends Item {

    public Dagger(String name) {

        super(name);
    }

    @Override
    public String toString() {
        return String.format("Dagger name %s, heals %d, damage %d, weight: %d", getName());
    }
}


