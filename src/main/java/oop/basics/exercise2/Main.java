package oop.basics.exercise2;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double add = calculator.add(5, 10);
        System.out.println(add);

        add = calculator.add("5", "10");
        System.out.println(add);
    }

}
