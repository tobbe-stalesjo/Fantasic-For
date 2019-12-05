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

        showGameBoard();

    }

    public Room getRoom(int roomID){
        return rooms[roomID];
    }

    public int[] getGetConnectedRooms(int roomID){
        return rooms[roomID].getConnectedRooms();
    }

    private void finaRummen(){
        for( int i = 0 ; i < 3 ; i++){
            System.out.println();
            for( int j = 0 ; j < 3 ; j++){
                System.out.print(rooms[j]);
            }
        }
    }

    private void startPosition() {
        grid[xPos][yPos] = "O ";
    }

    private void move() {
        System.out.println("Skriv din X-Pos [Mellan 1-11]");
        int newxPos = Integer.parseInt(scanner.nextLine());
        System.out.println("Skriv din Y-Pos Mellan 1-11]");
        int newyPos = Integer.parseInt(scanner.nextLine());
        if (grid[newxPos][newyPos] == ("X ")) {
            System.out.println("There is a wall!");
        } else {
            System.out.println("You enter a room!");
            grid[newxPos][newyPos] = "O ";
            grid[xPos][yPos] = "  ";
        }
    }


    public void showGameBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    private void searchRoom() {
        for (int rad = 0; rad < 5; rad++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(grid[rad][col]);
            }
            System.out.println();
        }
    }

    public void updateHeroPosition(Position pos) {
        grid[pos.y][pos.x] = "H";
    }

}
