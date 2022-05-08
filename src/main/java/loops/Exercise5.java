package loops;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();

        while (number > 0) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
            number--;
        }


    }

}
