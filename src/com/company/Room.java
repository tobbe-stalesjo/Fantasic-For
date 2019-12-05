package com.company;

import java.lang.reflect.Array;

public class Room {

    private String[][] grid = {
            {"X", "X", "X", "X", "X"},
            {"X", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " "},
            {"X", " ", " ", " ", "X"},
            {"X", "X", " ", "X", "X"}
    };

    private int[] connectedRooms;
    private int heroX;
    private int heroY;

    public Room(int id, int[] connectedRooms, int heroX, int heroY) {
        this.connectedRooms = connectedRooms;
        this.heroX = heroX;
        this.heroY = heroY;
    }

    public int[] getConnectedRooms() {
        return connectedRooms;
    }

    public int getHeroX() {
        return heroX;
    }

    public int getHeroY() {
        return heroY;
    }

    public String[][] getGrid() {
        return grid;
    }
}
