package loops;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int max = scanner.nextInt(); //maksymalny zakres wyswietlanych liczb

        //wykladnik potegi
        int i = 0;
        //zmienna na wynik potegowania
        double power = Math.pow(2, i);

        while (power < max) {
            System.out.print(power + " ");
            i++;
            power = Math.pow(2, i);
        }

    }

}
