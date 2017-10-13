package com.company;

import java.util.Random;

import static com.company.Player.player;

public class Journey {
    Random rng = new Random();

    public int roll (int max) {
        return 1 + rng.nextInt(max);
    }
    public int roll6(){
        return roll(6);
    }

    private static void gameover(){
        System.out.println(player.name + " has died...\nGame Over!");
        System.exit(0);
    }
}
