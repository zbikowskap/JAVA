package oop.abstractclass;

public abstract class Fruit {

    private double kcalPer100g;

    public Fruit(double kcalPer100g) {
        this.kcalPer100g = kcalPer100g;
    }

    public void eat() {
        System.out.println("eating");
    }

    public abstract void showName();

}
