package com.pluralsight.week2;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TheaterReservations {
    private static Scanner scanner = new Scanner(System.in);

    public static void make_reservation(Scanner scanner){
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        String[] name_parts = name.split("\\s");

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate the_date = LocalDate.parse(date, formatter);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        String ticket = tickets == 1 ? "ticket" : "tickets";

        System.out.println("\n\n" + ticket + " tickets reserved for " + the_date + " under " + name_parts[1] + ", " + name_parts[0]);


    }

    public static void main(String[] args) {
        make_reservation(scanner);
    }
}


