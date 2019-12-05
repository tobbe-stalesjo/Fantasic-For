package com.company;

public class Spider extends Monster{

    Potion potion = new Potion("healing potion", 1,0,0.5);

    public Spider(int row, int column) {

        super(row, column);
    }

    public String toString(){
        return "Spider's position: " + position +".";
    }


}