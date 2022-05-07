package conditionalstatement;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pensje pracownika:");
        int salary = scanner.nextInt();

        System.out.println("Podaj przepracowane godziny pracownika:");
        int hours = scanner.nextInt();

        if (hours >= 180) {
            System.out.println("Pracownik zarobił " + (salary + salary * 0.1));
        } else {
            System.out.println("Pracownik zarobił " + salary);
        }

    }

}
