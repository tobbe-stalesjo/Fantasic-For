package com.company;

public class Spider extends Monster{

    Potion potion = new Potion("healing potion", 1,0,0.5);

    public Spider() {

        super(6);
    }

    public String toString(){
        return "Spider's position: " + position +".";
    }


}