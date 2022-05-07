package random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();

        //Losowanie z calego zakresu inta
        int number = random.nextInt();
        System.out.println(number);

        //Losowanie z zakresu 0-9
        number = random.nextInt(10);
        System.out.println(number);

        //Losowanie z zakresu 10-20
        number = random.nextInt(11) + 10;
        System.out.println(number);
    }

}
