package com.company;

public abstract class Item {
    private String name;
    private double HPability;
    private double damage;
    private double weight;

    public Item(String name, double HPability, double damage, double weight) {
        this.name = name;
        this.HPability = HPability;
        this.damage = damage;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Item{" + "name='" + name + '\'' + ", HPability=" + HPability + ", damage=" + damage + ", weight=" + weight + '}';
    }
}



