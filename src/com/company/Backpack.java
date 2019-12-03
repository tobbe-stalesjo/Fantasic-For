package com.company;

import java.util.Arraylist;

public class Backpack {
    private static final double MAX_TOTAL_WEIGHT = 5;

    private ArrayList<Item> items = new ArrayList<>();


    public boolean addItem(Item item){
        if(getNowTotalWeight() + item.getWeight() <= MAX_TOTAL_WEIGHT){
            item.add(item);

            return true;

        }
        System.out.println("to heavy can't add item");
        return false;
    }

    private double getNowTotalWeight(){
        double totalWeight;
        for (Item item: items ){
totalWeight += item.getWeight();
        }

 return totalWeight
    }
}
