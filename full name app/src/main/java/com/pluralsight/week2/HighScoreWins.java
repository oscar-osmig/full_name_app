package com.pluralsight.week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

    public static void main(String[] args) {
        find_winner();
    }

    private static void find_winner() {
        // String game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a score");
        String gameScore = scanner.nextLine().trim();
        //                    teams   |    score
        //make it an array String[] = " "
        String[] game = gameScore.split(Pattern.quote("|"));
        //    game = [ "home:visitor" , "21:9" ]
        //                 index 0     index 1
        // split by colon
        String teams = game[0]; // teams = "home:visitor"
        String[] home_away = teams.split(Pattern.quote(":"));
        // home_away = [ home, away ]
        //
        // set teams into new string
        // home_away[0] = home
        String home = home_away[0];   //
        String visitor = home_away[1];  //
        //
        String scores = game[1]; // scores = [ "21:9" ]
        String[] points = scores.split(Pattern.quote(":"));
        // points = [ "21", "9" ]
        // index       0     1

        int home_score = Integer.parseInt(points[0]); // turns "21" (string) -> 21 (integer)
        int visitor_score = Integer.parseInt(points[1]); // turns "9" (string) -> 9 (integer)

        System.out.println();

        if (home_score > visitor_score){
            System.out.println("Winner: " + home +
                    "\nScore: " + home + "[" + home_score + "]" + "vs " +
                                 visitor + "[" + visitor_score + "]");
        } else if (home_score < visitor_score) {
            System.out.println("Winner: " + visitor +
                    "\nScore: " + visitor + "[" + visitor_score + "] " + "vs " +
                    home_away[0] + "[" + home_score + "]");
        }else {
            System.out.println("It's a tie!");
            System.out.println("Score: " + visitor + "[" + visitor_score + "] " + "vs " +
                    home_away[0] + "[" + home_score + "]");
        }


    }
}
