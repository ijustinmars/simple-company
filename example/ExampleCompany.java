package org.company.example;

import org.company.classes.*;

public class ExampleCompany {
    public static void main(String[] args) {

        Manager manager = new Manager(11562, "Carlos", "Castro", "14-3 Calle San Juan", 3500);
        manager.setBudget(3000.34);
        manager.salaryIncrease(20);
        System.out.println(manager);
    }
}
