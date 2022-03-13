package com.brigelabz;

import java.util.Random;

public class UC6SnakeLadder {
    public static void main(String[] args) {
        int pos = 0;
        int dice ;
        int temp;
        int countDice = 0;
        int countPos = 0;

        System.out.println("Single player at start position "+ pos);
        while (pos <= 100){
            dice = rollDice();
            countDice++;
            int t = pos;
            pos = mapTo(dice, pos);
            if(pos > t)
                countPos++;
        }
        if(pos > 100){
            temp = pos - 100;
            pos = pos - temp;
            System.out.println("Win the game pos is : "+ pos);
            System.out.println("No of Count Dice : "+ countDice);
            System.out.println("No of Count Pos : "+ countPos);

        }
        else{
            System.out.println("Win the game pos is : "+ pos);
            System.out.println("No of Count Dice : "+ countDice);
            System.out.println("No of Count Pos : "+ countPos);
        }
    }
    public static int rollDice(){
        Random random = new Random();
        int dice = random.nextInt(6);
        dice = dice+1;
        //System.out.println("Dice Num : "+ dice);
        return dice;
    }
    public static int mapTo(int dice, int pos){
        Random random = new Random();
        int map = random.nextInt(2);
        map = map +1;
        //System.out.println("Maping Method : "+ map);

        switch (map){
            case 1:
                //System.out.println("No Play You are in the same position");
                break;
            case 2:
                pos = pos + dice;
                //System.out.println("your position after ladder is : "+ pos);
                break;
            case 3:
                if (pos >= 0)
                    pos = pos - dice;
                //System.out.println("your position after snake is : "+ pos);
                break;
            default:

        }
        return pos;
    }
}

