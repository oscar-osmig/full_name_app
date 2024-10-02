package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameParser {
    private static Scanner scanner = new Scanner(System.in);

    private static void name_parser(Scanner scanner) {
        System.out.println("Please enter your name: (first, middle, last)");
        String name = scanner.nextLine();
        int first_space = name.indexOf(" ");
        String first_name = name.substring(0, first_space);
        // oscar osmig torres
        int second_space = name.indexOf(" ", first_space+1);
        String second_name = name.substring(first_space+1, second_space);
        String third_name = name.substring(second_space+1);
        System.out.println("First name: " + first_name + "\nMiddle name: " + second_name + "\nLast name: " + third_name);


    }

    public static void get_name(){
        // get full name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        // split full name into the spaces and story in array string
        String[] name_parts = name.split("\\s");

        // create variables for name parts
        String first_name= "";
        String middle_name= "(none)";
        String last_name= "";

        // check length
        if (name_parts.length == 2){
            first_name = name_parts[0];
            last_name = name_parts[1];
        }else if (name_parts.length == 3){
            first_name = name_parts[0];
            middle_name = name_parts[1];
            last_name = name_parts[2];
        }else {
            System.out.println("Issue!");
        }
        System.out.println("First name: " + first_name + "\nMiddle name: " + middle_name + "\nLast name: " + last_name);
    }

    public static void main(String[] args) {
        name_parser(scanner);
        get_name();
    }


}
