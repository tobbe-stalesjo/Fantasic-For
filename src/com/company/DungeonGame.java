package com.company;

public class DungeonGame {

    Maze maze = new Maze();
    Hero hero;
    Backpack backpack;
    Dagger dagger;
    Menu menu = new Menu();
    GoldenChest goldenChest = new GoldenChest("Golden Chest");


    public DungeonGame() {

        backpack = new Backpack();
        dagger = new Dagger("superDagger");
        backpack.addItem(dagger);

        hero = new Hero(6, false);                      // Sätter ut Hero i ett förutbestämt rum
        hero.addItemToBackpack(new Potion("Healing Potion"));
        hero.addItemToBackpack(new Potion("Healing Potion"));
        Position chestPos = new Position(6, 9);
        maze.updateChestPosition(chestPos);
    }

    public void startGame() {
    
        // en while loop som kör detta
        maze.updateHeroPosition(hero.getGridPosition(), hero.getGridPosition());
        maze.showGameBoard();

        while (true) {
            int choice = menu.chooseRoom(maze, hero);

            moveHeroToRoom(choice);

            int roomChoice = menu.roomEvents(choice);

            if (roomChoice == 1) {
                attackSpider();
            }
        }
        //metod som har en if sats beroende på rum
    }

    public void moveHeroToRoom(int roomNumber) {
        Position oldPosition = hero.getGridPosition();
        hero.setCurrentRoom(roomNumber);
        maze.updateHeroPosition(hero.getGridPosition(), oldPosition);
        maze.showGameBoard();
    }

    public void attackSpider(){
        System.out.println("attacking spider!");

    }

}

