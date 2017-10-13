package com.company;

import java.util.Scanner;

import static com.company.Player.player;

public class Main {

    public static void Menu() {
        Scanner enter2 = new Scanner(System.in);
        System.out.print("1. Enter dungeon.\n");
        System.out.print("2. Exit.\n");
        System.out.print("Enter your option: ");
        int option = enter2.nextInt();
        switch (option) {
            case 1:
                System.out.println("You have entered the dungeon.");
                break;
            case 2:
                System.out.printf("Goodbye, %s.", player.name);
                break;
            default:
                System.out.println("You entered wrong option. Please try again.");
                Menu();
                break;
        }
    }

    public static void main(String[] args) {
        Player.Name();
        Main.Menu();
    }
}
