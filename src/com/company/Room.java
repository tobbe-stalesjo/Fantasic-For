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

    public int[] getConnectedRooms() {
        return connectedRooms;
    }

    public int getHeroX() {
        return heroX;
    }

    public int getHeroY() {
        return heroY;
    }

    public Room(int id, int[] connectedRooms, int heroX, int heroY) {
        this.connectedRooms = connectedRooms;
        this.heroX = heroX;
        this.heroY = heroY;
        // createRoom();
    }


    public String[][] getGrid() {
        return grid;
    }

    private void createRoom() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }
}
