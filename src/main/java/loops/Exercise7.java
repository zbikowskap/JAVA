package loops;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pusty string
        String text = "";

        //Jesli, wartosc Stringa nie jest rowna "koniec"
        while (!text.equals("koniec")) {
            //drukowanie
            System.out.println(text);
            //pobranie nowej wartosci
            text = scanner.next();
        }

    }

}
