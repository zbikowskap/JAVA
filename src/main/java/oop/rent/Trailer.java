package oop.rent;

import java.math.BigDecimal;

public class Trailer implements Rentable {

    private double capacity;

    public Trailer(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String description() {
        return " Przyczepka o pojemnosci " + capacity;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        return BigDecimal.valueOf(hours);
    }
}
