package oop.basics;

public class StaticExample {

    public static int number = 10;

    public static void staticMethod() {
        System.out.println("Static method body");
    }

    public static void main(String[] args) {
        System.out.println(StaticExample.number);

        StaticExample.staticMethod();
    }

}
