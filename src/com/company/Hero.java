package com.company;

import java.util.Scanner;

public class Hero extends Creature {

    Backpack backpack = new Backpack();
    private boolean injured;

    public Hero(int startRoom, boolean injured) {
        super(startRoom);
        this.injured = injured;
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
            }
        } else {
            System.out.println("Warning! You are injured. Drink a portion to heal. You need weapon to kill Monster!");
        }
    }



    public void attackBandit(){

    }
    public void attackDragonBoss(){

    }
    /*{
        if(backpack.showItems().equals("superDagger")){
            return "You kill the Spider";
        }
        return "Find a weapon";
    }
    /*

    public boolean defeatBandit(){
        if(defeatSpider()){
            return true;
        }
        return false;
    }

    public boolean defeatDragonBoss(){
        if(defeatBandit()){
            return true;
        }
        return false;
    }

 */

}
