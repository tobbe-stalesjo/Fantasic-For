package com.company;

import java.util.ArrayList;

import java.util.ArrayList;

public class Backpack {
    private final double TOTAL_MAX_WEIGHT = 5;
    private ArrayList<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        if (getCurrentTotalWeight() + item.getWeight() <= TOTAL_MAX_WEIGHT) {
            items.add(item);

            return true;

        }

        return false;
    }


    private double getCurrentTotalWeight() {
        double totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        //System.out.println("bag is too heavy");
        return totalWeight;
    }

    public String showItems(){
        for(Item item: items){
            return item.getName();
        }
        return null;
    }
}
