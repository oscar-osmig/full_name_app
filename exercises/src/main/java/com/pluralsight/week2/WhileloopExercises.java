package com.pluralsight.week2;

public class WhileloopExercises {

    public static void hi() {  // while loop
        int count = 1;
        boolean run = true;
        double random;

        while(run){
            System.out.println("Hi " + count);
            random= Math.random();
            if(random < 0.5){
                run = false;
            }
            count++;
        }

    }

    static int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    public static void evenNums() {
        for(int num : nums){
            if( num % 2 == 0){
                System.out.println(num);
            }
        }
    }

    public static void iLove() {
        String things[] = {"soccer", "anime", "writing stories", "boxing"};
        for(int i = 0; i < things.length; i++){
            System.out.println("I love " + things[i]);
        }
    }

    public static void noMonkeys() {
        String song = " little monkey(s) jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed";
        int monkeys = 10;
        for (int i = 10; i >= 1; i--){
            System.out.println(i + song);
        }

        System.out.println( "No" + song);
    }

    public static void main(String[] args) {
        //hi();        // WHILE LOOP
        //evenNums();  // FOR LOOP
        //iLove();     // FOR EACH LOOP
        noMonkeys(); // BONUS EXERCISES

    }
}
