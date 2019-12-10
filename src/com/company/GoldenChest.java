package com.company;

import java.util.ArrayList;

public class GoldenChest extends Item {
    Position chestPosition;
    private ArrayList<Dagger> daggers = new ArrayList<>();

    public GoldenChest(String name) {
        super("Golden Chest");
    }

    public Position setChestPosition(Position chestPosition) {
        return chestPosition;
    }

    @Override
    public String toString() {
        return null;
    }
}
