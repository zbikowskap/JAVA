package oop.rent;

import java.math.BigDecimal;

public class Car implements Rentable {

    //deklaracja stałej
    private static final BigDecimal PRICE_PER_HOUR = new BigDecimal("16.50");

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String description() {
        return "Samochód marki: " + this.brand + " model: "
                + this.model + " z rocznika " + this.year + ".";
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        //Zamiana z int na BigDecimal
        final BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        //Mnozenie BigDecimal
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
