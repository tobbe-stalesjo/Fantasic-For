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

    public void addItemToBackpack(Item item){
        backpack.addItem(item);
    }

    public boolean defeatSpider(){
        if(backpack.showItems().equals("superDagger")){
            return true;
        }
        return false;
    }

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

}
