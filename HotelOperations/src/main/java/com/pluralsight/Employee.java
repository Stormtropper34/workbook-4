package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId = 0;
    private String name = "";
    private String department = "";
    private double payRate = 0;
    private double hoursWorked = 0;
    private double startTime = 0;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay() {
        double basePay = 0;
        double overtimePay = 0;
        if (hoursWorked > 40) {
            basePay = 40 * payRate;
            overtimePay = getOvertimeHours()* payRate * 1.5;
        } else {
            basePay = getRegularHours() * payRate;
        }
        return basePay + overtimePay;
    }
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;

        }
    }
    public double getOvertimeHours() {
        return (hoursWorked - 40);
    }
    public void punchIn(double punchTime) {
        this.startTime = punchTime;
        System.out.println(name + " punched in: " + punchTime);
    }
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        this.startTime = now.getHour() + now.getMinute();
        System.out.println(name + " punched in at " + startTime);
    }
    public void punchOut(double punchTime) {
        if (startTime != 0) {
            double worked = punchTime - startTime;
            this.hoursWorked += worked;
            System.out.println(name + " punched out: " + punchTime + ". Hours worked: " + worked);
            this.startTime = 0;
        } else {
            System.out.println(name + " you must punch in first.");
        }
    }
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();

    }
}
