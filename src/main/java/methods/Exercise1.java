package methods;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        //Pobrac za pomoca Scannera dwie liczby
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        //Wywolac metode 1. i wyswietlic wynik
        int result = add(numberA, numberB);
        System.out.println(result);

        //Wywolac metode 2. dla dowolnej liczby
        printInfo(result);
    }


    //1. Napisac metode, ktora doda do siebie dwie liczby i zwroci wynik
    public static int add(int a, int b) {
        return a + b;
    }

    //2. Napisac metode, ktora jako argument przyjmie int i w zaleznosci od liczby
    // wyswietli na ekranie "Przysta" lub "Nieparzysta"
    public static void printInfo(int number) {
        if (number % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}
