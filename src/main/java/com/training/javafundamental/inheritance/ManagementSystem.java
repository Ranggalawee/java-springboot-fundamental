package com.training.javafundamental.inheritance;

import java.util.ArrayList;

public class ManagementSystem {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee("Alice", "FT001", 5000, 5);
        Employee emp2 = new ContractEmployee("Bob", "CT001", 4000, 12);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        for (Employee e : employees) {
            e.displayEmploymentDetails();

            System.out.println("Annual Salary : $" + e.calculateAnnualSalary());
            System.out.println("Annual Bonus  : $" + e.calculateAnnualBonus());
            System.out.println("-------------------------------------------");
        }
    }
}
