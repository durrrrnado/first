package com.company;

import java.util.Scanner;

class Player {

    protected int maxhp;
    protected int playerhp;
    protected int xp;
    protected int level;
    static String name;
    //static final int hp;

    static Player player = new Player();

    static void Name() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Welcome, stranger. Please enter your name: ");
        player.name = enter.nextLine();
        System.out.print(name + ", choose your destiny!\n");
    }

    private static void buildEnemy() {
        switch (Level) {
            case 1:
                enemyhp = 9;
                enemymeleedmg = 1;
                break;
            case 2:
                enemyhp = 19;
                enemymeleedmg = 4;
                break;
            case 3:
                enemyhp = 24;
                enemymeleedmg = 6;
                break;
            case 4:
                enemyhp = 32;
                enemymeleedmg = 7;
                break;
            case 5:
                enemyhp = 40;
                enemymeleedmg = 9;
                break; //initializes enemy stats based on player level
        }
    }
}
