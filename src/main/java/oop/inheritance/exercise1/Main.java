package oop.inheritance.exercise1;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Zwierz", 11, "Nieznana");
        Cat cat = new Cat("Kwaśniak", 5, "Perski");
        Dog dog = new Dog("Burek", 10, "Maltańczyk", "biały");

        animal.voice();
        cat.voice();
        dog.voice();

    }

}
