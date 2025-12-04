package com.training.javafundamental.inheritance;

public class ContractEmployee extends Employee {
    private final int contractDurationMonths;

    public ContractEmployee(String name, String employeeId, double monthlySalary, int contractDurationMonths) {
        super(name, employeeId, monthlySalary);
        this.contractDurationMonths = contractDurationMonths;
    }

    @Override
    public double calculateAnnualBonus() {
        double annualSalary = calculateAnnualSalary();
        return 0.05 * annualSalary;
    }

    @Override
    public void displayEmploymentDetails() {
        System.out.println("Employee Type  : Contract");
        System.out.println("Name           : " + name);
        System.out.println("Employee ID    : " + employeeId);
        System.out.println("Contract Length: " + contractDurationMonths + " months");
    }
}
