package com.company;

import java.util.Arrays;

public class DungeonGame {

    Maze maze = new Maze();
    Hero hero ;
    Backpack backpack;
    Dagger dagger;

    public DungeonGame() {

        hero = new Hero(6, false);                      // Sätter ut Hero i ett förutbestämt rum
        hero.addItemToBackpack(new Potion("Healing Potion", 1,0,0.5));
        hero.addItemToBackpack(new Potion("Healing Potion", 1,0,0.5));
        //Hero börjar med 2 healing potions.

        Position pos = hero.getGridPosition();
        System.out.println(pos);
        System.out.println("Välj ett rum att gå till:"+
                Arrays.toString(maze.getGetConnectedRooms(hero.getCurrentRoom())));

        maze.updateHeroPosition(pos);
        maze.showGameBoard();


        hero.setCurrentRoom(1);
        pos = hero.getGridPosition();
        System.out.println(pos);

        hero.setCurrentRoom(8);
        pos = hero.getGridPosition();
        System.out.println(pos);

        backpack = new Backpack();

        dagger = new Dagger("Dagger", 0, 1, 1);

        backpack.addItem(dagger);
    }

}

