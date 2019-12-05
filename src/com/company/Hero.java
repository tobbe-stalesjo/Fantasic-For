package com.company;

public class Hero extends Creature {

    Backpack backpack = new Backpack();

    public Hero(int startRoom) {
        super(startRoom);
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
