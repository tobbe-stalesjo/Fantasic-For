package com.company;

public abstract class Item {

    private String name;
    private double heals;
    private double damage;
    private double weight;

    public Item(String name, double heals, double damage, double weight) {
        this.name = name;
        this.heals = heals;
        this.damage = damage;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getHeals() {
        return heals;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public abstract String toString();


}





