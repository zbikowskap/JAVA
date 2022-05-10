package arrays;

import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {
        Random random = new Random();
        double[] array = new double[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 20 + 5;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.02f ", array[i]);
        }
    }

}
