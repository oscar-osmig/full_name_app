package com.pluralsight.week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

    public static void main(String[] args) {
        //find_winner();
        winner();
    }

    public static void winner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a score");
        String gameScore = scanner.nextLine().trim();

        String[] teams_score = gameScore.split(Pattern.quote("|")); // splitting Home:Visitor|21:9 -> ["Home:Visitor", "21:9"]

        String[] teams = teams_score[0].split(Pattern.quote(":")); // splitting "Home:Visitor" -> ["Home","Visitor"]

        String[] score = teams_score[1].split(Pattern.quote(":")); // // splitting "21:9" -> ["21","9"]

        int score1 = Integer.parseInt(score[0]); // makes "21" -> 21
        int score2 = Integer.parseInt(score[1]); // makes "9" -> 9


        if (score1 > score2){
            System.out.println("\nWinner: " + teams[0] + "\nScore: " + score1 + " vs " + teams[1] + " " + score2);
        }else if (score1 < score2){
            System.out.println("\nWinner: " + teams[1] + "\nScore: " + score2 + " vs " + teams[0] + " " + score1);
        }else{
            System.out.println("\nTied: " + teams[0] + "\nScore: " + score1 + " vs " + teams[1] + " " + score2);
        }

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
