package scanner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź dowolny wyraz: ");
        //scanner.next() zatrzymuję program i czeka az w konsoli zostanie wprowadzony wyraz
        String input = scanner.next();
        System.out.println("Wprowadzony wyraz to: " + input);

        System.out.println("Wprowadz liczbe calkowita: ");
        int number = scanner.nextInt();
        System.out.println("Wprowadzona liczba to: " + number);
    }

}
