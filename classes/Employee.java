package org.company.classes;

public class Employee extends Person {
    private double salary;
    private final int employeeId;
    private static int lastId;

    public Employee(int nit, String name, String lastname, String address, double salary) {
        super(nit, name, lastname, address);
        this.salary = salary;
        this.employeeId = ++lastId;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void salaryIncrease(int percentage) {
        this.salary += (percentage * salary)/100;
    }

    @Override
    public String toString() {
        return  "ID: " + employeeId +
                '\n' + super.toString() +
                "\nSalario: " + salary;
    }
}
