package com.brigelabz;

import java.util.Random;

public class UC4WinningPosition {
    public static void main(String[] args) {
        int pos = 0;
        int dice ;

        System.out.println("Single player at start position "+ pos);
        while (pos <= 100){
            dice = rollDice();
            pos = mapTo(dice, pos);
        }
        System.out.println("Win the game pos is : "+ pos);
    }
    public static int rollDice(){
        Random random = new Random();
        int dice = random.nextInt(6);
        dice = dice+1;
        System.out.println("Dice Num : "+ dice);
        return dice;
    }
    public static int mapTo(int dice, int pos){
        Random random = new Random();
        int map = random.nextInt(2);
        map = map +1;
        System.out.println("Maping Method : "+ map);

        switch (map){
            case 1:
                System.out.println("No Play You are in the same position");
                break;
            case 2:
                pos = pos + dice;
                System.out.println("your position after ladder is : "+ pos);
                break;
            case 3:
                if (pos >= 0)
                    pos = pos - dice;
                System.out.println("your position after snake is : "+ pos);
                break;
            default:

        }
        return pos;
    }
}

