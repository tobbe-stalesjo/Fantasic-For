package com.company;

public class DungeonGame {
<<<<<<< HEAD

    public DungeonGame() {

        new Maze();
=======
    public DungeonGame() {

        Item potion = new Item("Healing potion", 1, 0, 0.5);
        Item dagger = new Item("Dagger", 0, 1, 1.1);
        Item posion = new Item("Spider Poison", 1, 0, 0.5);

        Backpack backpack = new Backpack();


        backpack.addItem(new Item("healing potion",1,0,0.5));

        System.out.println(Backpack.MAX_TOTAL_WEIGHT);
>>>>>>> Florind
    }
}
