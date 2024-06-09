package org.company.classes;

public class Person {
    private int nit;
    private String name;
    private String lastname;
    private String address;

    public Person(int nit, String name, String lastname, String address) {
        this.nit = nit;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getNit() {
        return nit;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "NIT: " + nit +
                "\nNombre: " + name +
                "\nApellido: " + lastname +
                "\nDireccion: " + address;
    }
}
