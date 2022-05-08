package loops;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();

        for (int i = 0; i < side; i++) {
            //Drukowanie w prawo
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            //Nowa linia
            System.out.println();
        }
    }

}
