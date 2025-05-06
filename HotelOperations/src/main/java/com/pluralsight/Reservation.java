package com.pluralsight;

public class Reservation {
   private String roomType;
   private int numberOfNights = 0;
   private boolean isWeekend = true;

   public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
       this.roomType = roomType;
       this.numberOfNights = numberOfNights;
       this.isWeekend = isWeekend;
   }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            return 124.00;
        } else {
            return 0.0;
        }
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public double getReservationTotal() {
        double total = getPrice();
        if (isWeekend) {
            total *= 1.10;
        }
        return total * numberOfNights;
    }
}
