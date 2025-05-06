package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room101 = new Room(1,200,true,true);
        System.out.println(room101.isAvailable());

        Room room102 = new Room(2,189,false,false);
        System.out.println(room102.isAvailable());

        Reservation reservation101 = new Reservation("king", 2,true);
        System.out.println(reservation101.getReservationTotal());

        Reservation reservation102 = new Reservation("king", 1, false);
        System.out.println(reservation102.getReservationTotal());

        Employee employee101 = new Employee(2133, "Alicia" , "Front desk" , 23, 41 );
        System.out.println("Employee Id: " + employee101.getEmployeeId());
        System.out.println("Employee Name: " + employee101.getName());
        System.out.println("Employee Department: " + employee101.getDepartment());
        System.out.println(employee101.getTotalPay());

        Employee employee102 = new Employee(3566, "Morgan", "HouseKeeper", 15, 28);
        System.out.println("Employee Id: " + employee102.getEmployeeId());
        System.out.println("Employee Name: " + employee102.getName());
        System.out.println("Employee Department: " + employee102.getDepartment());
        System.out.println(employee102.getTotalPay());


    }
}
