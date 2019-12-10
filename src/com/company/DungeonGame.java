package com.company;

import java.util.Arrays;

public class DungeonGame {

    Maze maze = new Maze();
    Hero hero;
    Backpack backpack;
    Dagger dagger;
    Menu menu = new Menu();

    public DungeonGame() {

        hero = new Hero(6, false);                      // Sätter ut Hero i ett förutbestämt rum
        hero.addItemToBackpack(new Potion("Healing Potion", 1, 0, 0.5));
        hero.addItemToBackpack(new Potion("Healing Potion", 1, 0, 0.5));
        //Hero börjar med 2 healing potions.

        // en while loop som kör detta
        maze.updateHeroPosition(hero.getGridPosition(), hero.getGridPosition());
        maze.showGameBoard();
        int choice = menu.chooseRoom(maze, hero);
        moveHeroToRoom(choice);

        //metod och har en if sats beroende på rum

        backpack = new Backpack();

        dagger = new Dagger("Dagger", 0, 1, 1);

        backpack.addItem(dagger);
    }

    public void moveHeroToRoom(int roomNumber) {
        Position oldPosition = hero.getGridPosition();
        hero.setCurrentRoom(roomNumber);
        maze.updateHeroPosition(hero.getGridPosition(), oldPosition);
        maze.showGameBoard();
    }
}

