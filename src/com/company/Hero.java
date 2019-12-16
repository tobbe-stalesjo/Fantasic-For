package com.company;

import java.util.Scanner;

public class Hero extends Creature {

    Backpack backpack = new Backpack();
    private boolean injured;
    Maze maze;


    public Hero(int startRoom, String name, boolean injured, Maze maze) {
        super(startRoom, name);
        this.injured = injured;
        this.maze = maze;


    }

    private void attackOrRunAway(){
        System.out.println("You've encountered an enemy. Do you want to attack or run away?");

    }
/*
    private void drinkPotion(){
        Potion potion= (Potion)backpack.getItem("Healing Potion");
        if(potion != null){
            injured = potion.drink();
            System.out.println("You are fully healed");
            backpack.removeItem(potion);
        } else {
            System.out.println("You have no potions");
        }
    }

 */


    public void addItemToBackpack(Item item){
        backpack.addItem(item);
    }

    public void attackSpider() {//problem?
        if (backpack.getItemName("superDagger") != null) {
            if (backpack.getItemName("superDagger").equals("superDagger")) {
                System.out.println("You defeat the Spider! Continue your adventure and find other Monster!");
                maze.removeSpiderFromMaze();


            }
        } else {
            System.out.println("Warning! You are injured. Drink a portion to heal. You need weapon to kill Monster!");
        }
    }

    public boolean isSpiderDefeated(){
        Spider spider = (Spider)maze.getMonster("Spider");
        if(spider == null){
            return true;
        }
        return false;
    }


    public void attackBandit(){
        if(isSpiderDefeated()){
            System.out.println("You defeat the Bandit! Continue your adventure and find other Monster!");
            maze.removeBanditFromMaze();
        }
        else {
            System.out.println("You need defeat Spider first!");
        }
    }

    public boolean isBanditDefeated() {

        Bandit bandit = (Bandit)maze.getMonster("Bandit");

        if(bandit == null){
            return true;

        }
        return false;
    }



    public void attackDragonBoss(){
        if (isBanditDefeated()) {
            System.out.println("Congratulations! You defeat the DragonBoss! You win the game!");
            maze.removeDragonBossFromMaze();
            System.exit(0);
        } else {
            System.out.println("You need defeat other Monster first!");
        }

    }


}


