package com.company;

public class Bandit extends  Monster {

    Potion potion = new Potion("healing potion", 1, 0, 0.5);

    public Bandit() {

        super(4);
    }

    public String toString(){
        return "Bandit's position: " + position +".";
    }
}
