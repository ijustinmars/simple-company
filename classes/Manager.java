package org.company.classes;

public class Manager extends Employee{
    private double budget;

    public Manager(int nit, String name, String lastname, String address, double salary) {
        super(nit, name, lastname, address, salary);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPresupuesto: " + budget;
    }
}
