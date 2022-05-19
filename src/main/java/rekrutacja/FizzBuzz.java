package rekrutacja;

public class FizzBuzz {

    /**
     * Wyświetl liczby od 1 do 100. Każda w nowej linii.. ale..
     * 1. Jeśli liczba jest podzielna przez 3, zamiast niej wyświetl 'Fizz'.
     * 2. Jeśli liczba jest podzielna przez 5, zamiast niej wyświetl 'Buzz'.
     * 3. Jeśli liczba jest podzielna przez 3 i 5, zamiast niej wyświetl 'FizzBuzz'.
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

}
