package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void get_name(Scanner scanner) {
        System.out.println("Please enter your name below");

        System.out.println("First name: ");
        String first_name = scanner.nextLine();
        first_name = first_name.trim();

        System.out.println("Middle name: ");
        String middle_name = scanner.nextLine();
        middle_name = middle_name.trim();

        System.out.println("Last name: ");
        String last_name = scanner.nextLine();
        last_name = last_name.trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();

        String full_name;

        if ( middle_name.isBlank() && suffix.isBlank() ) {
            full_name = first_name + " " + last_name;
            System.out.println(full_name);

        } else if (middle_name.isBlank()){

            full_name = first_name + " " + last_name + ", " + suffix;
            System.out.println(full_name);

        } else if (suffix.isBlank()) {
            full_name = first_name+ " " + middle_name + " " + last_name;
            System.out.println(full_name);
        }
    }

    public static void main(String[] args) {

        get_name(scanner);

    }
}
