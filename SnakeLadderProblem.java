package com.bridgelabz.rfp212.assignmentsday04;

import java.util.Random;

public class SnakeLadderProblem {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Snake & Ladder Simulator");
        System.out.println();
        int Singleplayer=0;
        System.out.println("Starting Position of Single Player is: "+Singleplayer);
         int SingleplayerRolls = random.nextInt(6)+1;
        System.out.println("The Player Rolls The Die & Get a Number: "+Singleplayer);
    }
}
