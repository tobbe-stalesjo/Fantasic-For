package com.company;

public class Hero extends Creature {

    Backpack backpack = new Backpack();

    public Hero(int row, int column) {

        super(row, column);
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
