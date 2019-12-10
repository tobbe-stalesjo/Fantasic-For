package com.company;

public class Bandit extends  Monster {

    Potion potion = new Potion("healing potion");

    public Bandit() {

        super(1);
    }

    public String toString(){
        return "Bandit's position: " + position +".";
    }
}
