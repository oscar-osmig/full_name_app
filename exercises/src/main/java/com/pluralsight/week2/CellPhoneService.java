package com.pluralsight.week2;

import java.util.Scanner;


public class CellPhoneService
{

    public static CellPhone make_phone(){
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

        CellPhone cellPhone1 = new CellPhone();

        cellPhone1.setSerial_number(serial_num);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhone_number(number);
        cellPhone1.setOwner(owner);

        System.out.println("");

//        dial("855-555-2222");
        return cellPhone1;
    }

    public static void display(CellPhone phone){
        System.out.println(" | " + phone.getModel() + " | " + phone.getCarrier()  + " | " + phone.getOwner()  + " | " +
                phone.getSerial_number()  + " | " + phone.getPhone_number()  + " | ");
    }

    public static void main(String[] args) {

        CellPhone cellPhone1 = make_phone();
        CellPhone cellPhone2 = make_phone();

        cellPhone2.dial(cellPhone1.getPhone_number());

    }


}
