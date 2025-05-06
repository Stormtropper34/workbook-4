package com.pluralsight;

public class Reservation {
   private String roomType;
   private int numberOfNights;
   private boolean isWeekend;
   private double reservationTotal;

   public Reservation(String roomType, int numberOfNights, boolean isWeekend, double reservationTotal) {
       this.roomType = roomType;
       this.numberOfNights = numberOfNights;
       this.isWeekend = isWeekend;
       this.reservationTotal = reservationTotal;

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

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal() {
        double basePrice = getPrice();
        if (isWeekend) {
            basePrice *= 0.10;
        }
        return basePrice * numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                ", reservationTotal=" + reservationTotal +
                '}';
    }
}
