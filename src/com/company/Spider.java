package com.company;

public class Spider extends Monster{

    Potion potion = new Potion("healing potion");

    public Spider() {

        super(3);
    }

    public String toString(){
        return "Spider's position: " + position +".";
    }


}