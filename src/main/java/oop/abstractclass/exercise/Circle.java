package oop.abstractclass.exercise;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateCircuit() {
        return 2 * Math.PI * radius;
    }
}
