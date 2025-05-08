package com.pluralsight;

public class Room {
    private int numberOfBeds = 0;
    private double price = 0;
    private boolean isOccupied = false;
    private boolean isDirty = true;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }
    public double getPrice(){
        return price;
    }
    public boolean isOccupied(){
        return isOccupied;
    }

    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }
    public boolean isDirty(){
        return isDirty;
    }

    public void checkIn() {
        if(isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
            System.out.println("It's available!!");
        } else {
            System.out.println("It's not available :( ");
        }
    }
    public void checkOut() {
        if(isOccupied()) {
            this.isOccupied = false;
            this.isDirty = false;
            System.out.println("Room available");
        } else {
            System.out.println("Not available");
        }
    }
    public void cleanRoom() {
        if(isDirty) {
            this.isDirty = false;
            System.out.println("Room is clean");
        } else {
            System.out.println("Room is dirty");
        }
    }


}
