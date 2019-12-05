package com.company;

public class DungeonGame {


    public DungeonGame() {

        new Maze();


        //Item healPotion = new Item("Healing potion", 1, 0, 0.5);
        //Item dagger = new Item("Dagger", 0, 1, 1);
        //Item poison = new Item("Spider poison", 0, 1, 0.5);

        Backpack backpack = new Backpack();
        //backpack.addItem(healPotion);
        //backpack.addItem(dagger);
        //backpack.addItem(poison);

        Dagger dagger = new Dagger("Dagger", 0, 1, 1);
        Potion potion = new Potion("Healing potion", 1, 0, 0.5);
        //GoldenChest goldenChest = new GoldenChest();
        backpack.addItem(dagger);
        backpack.addItem(potion);
    }

}

