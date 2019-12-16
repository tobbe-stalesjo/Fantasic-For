package com.company;

public class Bandit extends  Monster {

    Potion potion = new Potion("healing potion");

    public Bandit(int startRoom, String name) {

        super(startRoom, name);
    }

    public String toString(){
        return "Bandit's position: " + position +".";
    }


}
