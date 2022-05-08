package loops;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int side = scanner.nextInt();

        //Kwadrat
        for (int i = 0; i < side; i++) {
            //Drukowanie w prawo
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            //Nowa linia
            System.out.println();
        }

        System.out.println();

        //Trojkat
        for (int i = 0; i < side; i++) {
            //Drukowanie w prawo
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //Nowa linia
            System.out.println();
        }

        System.out.println();

        //Przekatna
        for (int i = 0; i < side; i++) {
            //Drukowanie w prawo
            for (int j = 0; j < side; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //Nowa linia
            System.out.println();
        }
    }

}
