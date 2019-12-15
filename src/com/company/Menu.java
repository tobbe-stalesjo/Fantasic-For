package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public int chooseRoom(Maze maze, Hero hero) {//try catch
        System.out.println("Choose what room to go to:" +
                Arrays.toString(maze.getGetConnectedRooms(hero.getCurrentRoom())));
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;

    }

    public int roomEvents(int choice, Hero hero){//try catch here// if choose a room outside the connecting room, show Empty room. need fix here
        if(choice == 3) {
            if (hero.isSpiderDefeated()) {
                System.out.println("You have defeated the Spider in this room. Go and explore other room!");
                return 2;
            } else {
                System.out.println("There is a spider inside, what do you want to do?");
                System.out.println("1. Attack\n" + "2. Go to another room\n");
            }
            Scanner scanner = new Scanner(System.in);
            int nextChoice = Integer.parseInt(scanner.nextLine());
            return nextChoice;
        }
        else if(choice==0||choice==4||choice==5||choice==8||choice==6){
            System.out.println("Empty Room, nothing inside. Go to another Room");
        }
        else if(choice == 7){
            System.out.println("You find a golden chest, there is a dagger inside, it has been put in your backpack!");
        }
        else if(choice == 2){
            System.out.println("You meet the dragon boss, what do you want to do?\"");
            System.out.println("1. Attack\n" + "2. Go to another Room\n");

            Scanner scanner = new Scanner(System.in);
            int nextChoice = Integer.parseInt(scanner.nextLine());
            return nextChoice;
        }
        else if(choice==1){
            if (hero.isBanditDefeated()) {
                System.out.println("You have defeated the Bandit in this room. Go and explore other room!");
                return 2;
            } else {
                System.out.println("There is a Bandit inside, what do you want to do?");
                System.out.println("1. Attack\n" + "2. Go to another room\n");
            }

            Scanner scanner = new Scanner(System.in);
            int nextChoice = Integer.parseInt(scanner.nextLine());
            return nextChoice;
        }

        else {
            System.out.println("Please enter a number between 1-7 to choose a room.");
        }
        return 2;
    }

}

