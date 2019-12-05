package com.company;

public class DungeonGame {


    public DungeonGame() {

         new Maze();



            Backpack backpack = new Backpack();

            Dagger dagger = new Dagger("Dagger", 0, 1, 1);

            backpack.addItem(dagger);
        }

    }

