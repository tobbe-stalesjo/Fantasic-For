package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);


    public int chooseRoom(Maze maze, Hero hero) {
        System.out.println("Choose what room to go to:" +
                Arrays.toString(maze.getGetConnectedRooms(hero.getCurrentRoom())));
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;

    }
}

