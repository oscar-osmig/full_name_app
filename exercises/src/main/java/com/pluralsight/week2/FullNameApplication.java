package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameApplication
{
    static Scanner scanner = new Scanner(System.in);

    public static void get_name(Scanner scanner) {
        System.out.println("Please enter your name below");

        System.out.println("First name: ");
        String first_name = scanner.nextLine().trim();

        System.out.println("Middle name: ");
        String middle_name = scanner.nextLine().trim();


        System.out.println("Last name: ");
        String last_name = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String full_name = "";

        if (!first_name.isEmpty()) {
            full_name += first_name + " ";

        }
        if (!middle_name.isEmpty()) {
            full_name += middle_name + " ";

        }if (!last_name.isEmpty()) {
            full_name += last_name;

        }if (!suffix.isEmpty()) {
            full_name += ", " + suffix;
        }
        System.out.println(full_name);
    }

    public static void main(String[] args)
    {
        get_name(scanner);
    }

}
