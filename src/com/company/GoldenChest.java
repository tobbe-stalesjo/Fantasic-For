package com.company;

import java.util.ArrayList;

public class GoldenChest extends Item {

    private ArrayList<Dagger> daggers = new ArrayList<>();

    public GoldenChest(String name) {
        super("Golden Chest");
    }


    @Override
    public String toString() {
        return null;
    }

    public void addItem(Dagger dagger) {
        daggers.add(dagger);

    }
}
