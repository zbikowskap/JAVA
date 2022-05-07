package conditionalstatement;

import java.util.Scanner;

/**
 * Wyświetl NARAZ liczby od największej do najmniejszej.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź 3 cyfry");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }

}
