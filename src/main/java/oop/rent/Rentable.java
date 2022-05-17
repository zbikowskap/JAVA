package oop.rent;

import java.math.BigDecimal;

public interface Rentable {

    String description();

    BigDecimal calculatePrice(int hours);

}
