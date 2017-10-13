package com.company;

import java.util.Scanner;

public class Main {

    private static String name;

    public static void Name() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Welcome, stranger. Please enter your name: ");
        name = enter.nextLine();
        System.out.print(name + ", choose your destiny!\n");
    }

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
                System.out.printf("Goodbye, %s.", name);
                break;
            default:
                System.out.println("You entered wrong option. Please try again.");
                Menu();
                break;
        }
    }

    public static void main(String[] args) {
        Main.Name();
        Main.Menu();
    }
}
