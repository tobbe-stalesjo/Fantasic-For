package com.company;

public class Potion extends Item {

    public Potion(String name, double heals, double damage, double weight) {
        super(name, heals, damage, weight);
    }

    @Override
    public String toString() {
        return String.format("potion name %s, heals %d, damage %d, weight: %d", getName(), getHeals(), getDamage(), getWeight());
    }
}
