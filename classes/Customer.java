package org.company.classes;

public class Customer extends Person{
    private final int customerId;
    private static int finalIdCustomer;

    public Customer(int nit, String name, String lastname, String address) {
        super(nit, name, lastname, address);
        this.customerId = ++finalIdCustomer;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "ID: " + customerId +
                '\n' + super.toString();
    }
}
