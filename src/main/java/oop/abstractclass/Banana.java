package oop.abstractclass;

public class Banana extends Fruit {

    public Banana(double kcalPer100g) {
        super(kcalPer100g);
    }

    @Override
    public void showName() {
        System.out.println("I am banana");
    }

}
