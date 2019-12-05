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

    public Room() {
        createRoom();
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
