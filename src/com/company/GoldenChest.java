package com.company;

import java.util.ArrayList;

public class GoldenChest extends Item {
    private ArrayList<Dagger> daggers = new ArrayList<>();
    public GoldenChest() {
        super("Golden Chest", 0, 0, 0);
    }

    @Override
    public String toString() {
        return null;
    }
}
