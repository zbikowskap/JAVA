package oop.basics;

public class StaticExample {

    //statyczne pole
    public static int number = 10;

    //statyczna metoda
    public static void staticMethod() {
        System.out.println("Static method body");
    }

    public static void main(String[] args) {
        //Do pola po nazwie klasy
        System.out.println(StaticExample.number);
        //Dostep do metody bez obiektu, po nazwie klasy
        StaticExample.staticMethod();
    }

}
