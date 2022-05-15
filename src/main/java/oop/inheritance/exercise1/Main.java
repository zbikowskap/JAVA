package oop.inheritance.exercise1;

public class Main {

    public static void main(String[] args) {

        Animal mysteryAnimal = new Animal("Zwierz", 11, "Nieznana");
        Cat cat = new Cat("Kwaśniak", 5, "Perski");
        Animal dog = new Dog("Burek", 10, "Maltańczyk", "biały");

        Animal[] animals = {mysteryAnimal, cat, dog};

        for (Animal animal : animals) {
            animal.voice();
        }

    }

}
