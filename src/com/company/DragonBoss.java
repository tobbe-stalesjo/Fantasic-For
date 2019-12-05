package com.company;

public class DragonBoss extends Monster {


    public DragonBoss(int row, int column) {
        super(row, column);
    }

    public String toString(){
        return "DragonBoss's position: " + position +".";
    }
}
