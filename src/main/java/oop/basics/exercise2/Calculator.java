package oop.basics.exercise2;

public class Calculator {

    //Przyklad przeciazania metody.
    public double add(String numberA, String numberB) {
        return Double.parseDouble(numberA) + Double.parseDouble(numberB);
    }

    public double add(double a, double b) {
        return a + b;
    }

    //...

}
