package com.company;

public class Bandit extends  Monster {

    Potion potion = new Potion("healing potion", 1, 0, 0.5);

    public Bandit(int row, int column) {

        super(row, column);
    }

    public String toString(){
        return "Bandit's position: " + position +".";
    }
}
