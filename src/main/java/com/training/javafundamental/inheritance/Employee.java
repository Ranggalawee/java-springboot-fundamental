package com.training.javafundamental.inheritance;

public abstract class Employee {
    protected String name;
    protected String employeeId;
    protected double monthlySalary;

    public Employee(String name, String employeeId, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Abstract methods
    public abstract double calculateAnnualBonus();

    public abstract void displayEmploymentDetails();
}