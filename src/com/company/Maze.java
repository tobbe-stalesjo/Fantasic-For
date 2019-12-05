package com.company;

import java.util.Scanner;

public class Maze {
    private Scanner scanner = new Scanner(System.in);

    private int xPos = 10;
    private int yPos = 2;

    String[][] grid = {
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", "X", " ", "X", "X", "X", " ", "X", "X", "X", " ", "X", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", "X", " ", "X", "X", "X", " ", "X", "X", "X", " ", "X", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " ", "X"},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
    };

    Room[] rooms = new Room[8];


    public Maze() {
        int connectedRooms0[] = {1,3};
        rooms[0]  = new Room(0, connectedRooms0, 2,2);
        int connectedRooms1[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms1, 6,2);
        int connectedRooms2[] = {2,6};
        rooms[1]  = new Room(0, connectedRooms2, 10,2);
        int connectedRooms3[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms3, 2,6);
        int connectedRooms4[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms4, 6,6);
        int connectedRooms5[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms5, 10,6);
        int connectedRooms6[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms6, 2,10);
        int connectedRooms7[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms7, 6,10);
        int connectedRooms8[] = {0,2,4};
        rooms[1]  = new Room(0, connectedRooms8, 10,10);

        showGameBoard();

    }

    public Room getRoom(int roomID){
        return rooms[roomID];
    }

    public int[] getGetConnectedRooms(int roomID){
        return rooms[roomID].getConnectedRooms();
    }


    public void showGameBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }


    public void updateHeroPosition(Position pos) {
        grid[pos.y][pos.x] = "H";
    }

}
