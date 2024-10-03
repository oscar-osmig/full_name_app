package com.pluralsight.week2;

import java.util.Scanner;

public class CellPhoneApplication
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number?");
        int serial_num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the model?");
        String model = scanner.nextLine();

        System.out.println("What is the carrier?");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        String number = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        CellPhone cellPhone = new CellPhone();

        cellPhone.setSerial_number(serial_num);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhone_number(number);
        cellPhone.setOwner(owner);

        cellPhone.DisplayCell(model, carrier, owner, serial_num, number);

    }
}
