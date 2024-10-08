package com.pluralsight.week3;

public class RollTheDice
{

    public static void rollind_dice(){
        int count2roll = 0;
        int count4roll = 0;
        int count6roll = 0;
        int count7roll = 0;

        Dice dice = new Dice();

        for( int i = 1; i < 101; i++)
        {
            System.out.println();
            int dice1 = dice.roll();
            int dice2 = dice.roll();
            int result = dice1 + dice2;
            System.out.println("Round: " + i + "\n\nDice 1: " + dice1 +
                    "\nDice 2: " + dice2 +
                    "\nRolled: " + (dice1+dice2) +
                    "\n-----------");


            switch (result)
            {
                case 2:
                    count2roll++;
                    break;
                case 4:
                    count4roll++;
                    break;
                case 6:
                    count6roll++;
                    break;
                case 7:
                    count7roll++;
                    break;

            }
        }
        System.out.println("Roll 2: " + count2roll +
                           "\nRoll 4: " + count4roll +
                           "\nRoll 6: " + count6roll +
                           "\nRoll 7: "  + count7roll
                          );
    }

    public static void main(String[] args)
    {
        rollind_dice();
    }


    static class Dice {

        int maxValue = 6;
        int minValue = 1;
        public int roll() {
            return (int) (Math.random() * maxValue) + minValue;
        }
    }

}


