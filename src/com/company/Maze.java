package com.company;

import java.util.Scanner;

public class Maze {
    private Scanner scanner = new Scanner(System.in);

    String[][] grid = {
            {"X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X "},
            {"X ", "M ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "X ", "  ", "X ", "X ", "X ", "  ", "X ", "X ", "X ", "  ", "X ", "X "},
            {"X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "X ", "  ", "X ", "X ", "X ", "  ", "X ", "X ", "X ", "  ", "X ", "X "},
            {"X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "X "},
            {"X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X ", "  ", "  ", "  ", "X "},
            {"X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X "}
    };

    public Maze() {

        System.out.println("Skriv din X-Pos [Mellan 1-11]");
        int xPos = Integer.parseInt(scanner.nextLine());
        System.out.println("Skriv din Y-Pos Mellan 1-11]");
        int yPos = Integer.parseInt(scanner.nextLine());
        if (grid[xPos][yPos].equals("X")) {
            System.out.println("There is a wall!");
        } else {
            System.out.println("You enter a room!");
            grid[xPos][yPos] = "O ";
        }
        GameBoard();
    }


    private void GameBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

    }
}
