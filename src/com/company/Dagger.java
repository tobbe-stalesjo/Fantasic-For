package com.company;

public class Dagger extends Item {

    public Dagger(String name, double heals, double damage, double weight) {
        super(name, heals, damage, weight);
    }

    @Override
    public String toString() {
        return String.format("Dagger name %s, heals %d, damage %d, weight: %d", getName(), getHeals(), getDamage(), getWeight());
    }
}


