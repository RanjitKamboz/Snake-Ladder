package com.brigelabz;

import java.util.Random;

public class Random1to6 {
    public static void main(String[] args) {
        int pos = 0;

        System.out.println("Single player at start position "+ pos);

        Random random = new Random();
        int dice = random.nextInt(6);
        dice = dice+1;
        System.out.println("Dice Num : "+ dice);

    }
}

