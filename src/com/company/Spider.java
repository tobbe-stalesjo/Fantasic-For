package com.company;

public class Spider extends Monster{

    Backpack backpack = new Backpack();

    Potion potion = new Potion("healing potion");

    public Spider(int startRoom, String name) {

        super(startRoom, name);
    }



    public String toString(){
        return "Spider's position: " + position +".";
    }


}