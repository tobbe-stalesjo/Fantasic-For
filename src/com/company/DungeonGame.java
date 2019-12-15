package com.company;

public class DungeonGame {

    Maze maze = new Maze();
    Hero hero;
    Backpack backpack;
    Dagger dagger;
    Menu menu = new Menu();
    GoldenChest goldenChest;



    public DungeonGame() {

        backpack = new Backpack();
        dagger = new Dagger("superDagger");
        goldenChest = new GoldenChest("goldenChest");

        goldenChest.addItem(dagger);

        hero = new Hero(6, "Hero", false, maze);                      // Sätter ut Hero i ett förutbestämt rum
        hero.addItemToBackpack(new Potion("Healing Potion"));
        hero.addItemToBackpack(new Potion("Healing Potion"));
        Position chestPos = new Position(6, 9);
        maze.updateChestPosition(chestPos);


    }

    public void startGame() {

        // en while loop som kör detta
        maze.updateHeroPosition(hero.getGridPosition(), hero.getGridPosition());
        maze.showGameBoard();
        maze.addMonsterToMaze();

        while (true) {
            int choice = menu.chooseRoom(maze, hero);

            moveHeroToRoom(choice);

            int nextChoice = menu.roomEvents(choice, hero);

            if(choice==7){
                hero.addItemToBackpack(dagger);
                backpack.showItems();
            }

            if (nextChoice == 1) {
                if (choice == 3){
                    hero.attackSpider();
                }

                if (choice == 1) {
                    hero.attackBandit();
                }

                if(choice==2){
                    hero.attackDragonBoss();
                }
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


}


