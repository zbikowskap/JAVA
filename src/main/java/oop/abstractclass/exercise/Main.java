package oop.abstractclass.exercise;

public class Main {

    public static void main(String[] args) {

        Figure rectangle = new Rectangle(5, 2);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateCircuit());

        Figure circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircuit());

    }

}
