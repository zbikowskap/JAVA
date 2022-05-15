package oop.inheritance;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println("Pojazd porusza się...");
    }
}
