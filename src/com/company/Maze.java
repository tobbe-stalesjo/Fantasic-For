package com.company;

import java.util.Scanner;

public class Maze {
    private Scanner scanner = new Scanner(System.in);


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

    Room[] rooms = new Room[9];


    public Maze() {
        int connectedRooms0[] = {1, 3};
        rooms[0] = new Room(0, connectedRooms0, 2, 2);
        int connectedRooms1[] = {0, 2, 4};
        rooms[1] = new Room(0, connectedRooms1, 6, 2);
        int connectedRooms2[] = {1, 5};
        rooms[2] = new Room(0, connectedRooms2, 10, 2);
        int connectedRooms3[] = {0, 4, 6};
        rooms[3] = new Room(0, connectedRooms3, 2, 6);
        int connectedRooms4[] = {1, 3, 5, 7};
        rooms[4] = new Room(0, connectedRooms4, 6, 6);
        int connectedRooms5[] = {2, 5, 8};
        rooms[5] = new Room(0, connectedRooms5, 10, 6);
        int connectedRooms6[] = {3, 7};
        rooms[6] = new Room(0, connectedRooms6, 2, 10);
        int connectedRooms7[] = {4, 6, 8};
        rooms[7] = new Room(0, connectedRooms7, 6, 10);
        int connectedRooms8[] = {5, 7};
        rooms[8] = new Room(0, connectedRooms8, 10, 10);

        //showGameBoard();


    }

    public Room getRoom(int roomID) {
        return rooms[roomID];
    }

    public int[] getGetConnectedRooms(int roomID) {
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


    public void updateHeroPosition(Position pos, Position oldPosition) {
        grid[oldPosition.y][oldPosition.x] = " ";
        grid[pos.y][pos.x] = "H";
    }

    public void updateChestPosition(Position pos) {
        grid[pos.y][pos.x] = "G";
    }


}
