package oop.inheritance.exercise1;

public class Cat extends Animal {

    public Cat(String name, int age, String race) {
        super(name, age, race);
    }

    @Override
    public void voice() {
        System.out.println("Miau miau");
    }
}
