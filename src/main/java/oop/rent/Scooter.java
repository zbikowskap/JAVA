package oop.rent;

import java.math.BigDecimal;

public class Scooter {

    private static final BigDecimal PRICE_PER_HOUR = new BigDecimal("5.50");

    private String brand;

    public Scooter(String brand) {
        this.brand = brand;
    }

    public String desc() {
        return "Hulajnoga " + this.brand + ".";
    }

    public BigDecimal calculatePrice(int hours) {
        final BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }

}
