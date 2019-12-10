package com.company;

import javafx.geometry.Pos;

public abstract class Creature {
    private int currentRoom;

    public Position position;

    public Creature (int startRoom) {

        this.currentRoom = startRoom;
    }



    public int getCurrentRoom() {

        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {

        this.currentRoom = currentRoom;
    }

    public Position getGridPosition(){
        int x = currentRoom % 3;
        int y = currentRoom / 3;
        return new Position(2 + (x*4), 2 + (y*4));
    }


}
