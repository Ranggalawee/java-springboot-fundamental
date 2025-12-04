package com.training.javafundamental.inheritance;

public class FullTimeEmployee extends Employee {
    private final int yearsOfService;

    public FullTimeEmployee(String name, String employeeId, double monthlySalary, int yearsOfService) {
        super(name, employeeId, monthlySalary);
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateAnnualBonus() {
        double annualSalary = calculateAnnualSalary();
        return (0.10 * annualSalary) + (yearsOfService * 500);
    }

    @Override
    public void displayEmploymentDetails() {
        System.out.println("Employee Type : Full-Time");
        System.out.println("Name          : " + name);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Years Service : " + yearsOfService);
    }
}