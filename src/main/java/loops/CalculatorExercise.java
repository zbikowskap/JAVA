package loops;

import java.util.Scanner;

public class CalculatorExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("x")) {
            System.out.println("Wybierz operacje arytmetyczna:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("x. Wyjscie z programu");

            option = scanner.next();

            if (!option.equals("x")) {
                System.out.println("Podaj dwie liczby: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                switch (option) {
                    case "1":
                        System.out.println(a + b);
                        break;
                    case "2":
                        System.out.println(a - b);
                        break;
                }
            }
        }
    }

}
