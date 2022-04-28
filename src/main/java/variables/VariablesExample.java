package variables;

public class VariablesExample {

    public static void main(String[] args) {
        //deklaracja zmiennej typu int (liczba calkowita)
        int number;

        //inicjalizacja zmiennej
        number = 7;

        //wyświetlenie wartości ze zmiennej
        System.out.println(number);

        //deklaracja z inicjalizacja
        int secondNumber = 15;

        //wyswietlenie String + zmienna
        System.out.println("Druga liczba to: " + secondNumber);

        //ponowne przypisanie wartosci do zmiennej
        secondNumber = 4;

        System.out.println("Druga liczba po zmianie to: " + secondNumber);
    }

}
