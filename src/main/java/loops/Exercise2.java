package loops;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();

        for (int i = 2; i <= bound; i+=2) {
            System.out.print(i + " ");
        }

    }

}
