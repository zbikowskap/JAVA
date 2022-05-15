package oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Pojazd A");
        vehicle.drive();

        Motorcycle motorcycle = new Motorcycle("Motor A");
        motorcycle.drive();

        Truck truck = new Truck("Truck A", "zielony");
        truck.drive();
    }

}
