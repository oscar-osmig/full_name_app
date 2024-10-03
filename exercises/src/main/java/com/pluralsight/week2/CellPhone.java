package com.pluralsight.week2;

public class CellPhone {
    private int serial_number;
    private String model;
    private String carrier;
    private String phone_number;
    private String owner;

    public CellPhone(){
        this.serial_number = 0;
        this.model = "";
        this.carrier = "";
        this.phone_number = "";
        this.owner = "";
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }
}
