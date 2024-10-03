package com.pluralsight.week2;

import java.util.Scanner;

public class AddressBuilder {

    public  static void string_builder(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        StringBuilder shipping = new StringBuilder();

        System.out.println("Full name: "); // getting users name
        String name = scanner.nextLine();

        System.out.println("Billing Street:");
        String street = scanner.nextLine();

        System.out.println("Billing City:");
        String city = scanner.nextLine();

        System.out.println("Billing State:");
        String state = scanner.nextLine();

        System.out.println("Billing zip:");
        String zip = scanner.nextLine();

        System.out.println("Is your shipping address your billing address? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equals("yes") || answer.equals("y")){
            builder.append("\n\n").append(name).append("\n");
            builder.append("\nBilling Address:\n");
            builder.append(street).append("\n");
            builder.append(city).append(", ");
            builder.append(state).append(" ");
            builder.append(zip);

            String billing_address = builder.toString();
            System.out.println(billing_address);

            string_output(shipping, name, street, city, state, zip);
        }else{
            System.out.println("\n\nShipping Street:");
            String ship_street = scanner.nextLine();

            System.out.println("Shipping City:");
            String ship_city = scanner.nextLine();

            System.out.println("Shipping State:");
            String ship_state = scanner.nextLine();

            System.out.println("Shipping zip:");
            String ship_zip = scanner.nextLine();

            builder.append("\n\n").append(name).append("\n");
            builder.append("\nBilling Address:\n");
            builder.append(street).append("\n");
            builder.append(city).append(", ");
            builder.append(state).append(" ");
            builder.append(zip);


            builder.append("\n\nShipping Address:\n");
            builder.append(ship_street).append("\n");
            builder.append(ship_city).append(", ");
            builder.append(ship_state).append(" ");
            builder.append(ship_zip);

            String shipping_address = builder.toString();
            System.out.println(shipping_address);
        }

    }

    public static void string_output(StringBuilder stringBuilder, String name, String street , String city, String state, String zip){


        stringBuilder.append("\n\n").append(name).append("\n");
        stringBuilder.append("Shipping Address:\n");
        stringBuilder.append(street).append("\n");
        stringBuilder.append(city).append(", ");
        stringBuilder.append(state).append(" ");
        stringBuilder.append(zip);

        String shipping = stringBuilder.toString();
        System.out.println(shipping);
    }

    public static void main(String[] args) {
        string_builder();


    }
}
