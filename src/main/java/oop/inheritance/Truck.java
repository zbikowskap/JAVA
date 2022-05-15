package oop.inheritance;

public class Truck extends Vehicle {

    private String color;

    public Truck(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Ciezarowka porusza sie");
    }

}
