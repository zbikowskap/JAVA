package enumexample.exercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (ProductType value : ProductType.values()) {
            System.out.println(value);
        }

        List<Product> productList = List.of(
            new Product("Banana", 7.0, 1.0, ProductType.FRUIT),
            new Product("Cheddar", 45.0, 1.0, ProductType.CHEESE) ,
            new Product("Coca-cola Zero", 8, 1.5, ProductType.DRINK),
            new Product("Cherries", 1_000_000, 0.1, ProductType.FRUIT)
        );



    }

}
