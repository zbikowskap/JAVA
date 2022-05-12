package methods;

public class Exercise2 {

    /**
     * 1. Zaimplementuj metodę double multiply(double a, double b), która zwróci wynik mnożenia.
     * 2. Zaimplementuj metodę, która przyjmuję argument String. Metoda powinna zwrócić napis z dużych liter i dodać kropkę na końcu.
     * 3. Zaimplementuj metodę, która przyjmię jako argument liczbę całkowita n i wyświetli na ekran wszystkie liczby od 1 do n.
     * 4. Zaimplementuj metodę, która dla podanej jako argument liczby całkowitej zwróci silnie.
     * 5. Zaimplementuj metodę int sum(int[] array), która obliczy sumę wszystkich elementów w tablicy.
     * <p>
     * Działanie metod zaprezentuj w main.
     */

    public static void main(String[] args) {
        double multiplyResult = multiply(15, 0.5);
        System.out.println(multiplyResult);

        String decorateResult = decorate("Kolano");
        System.out.println(decorateResult);

        printNumbers(5);
        printNumbers(3);
        printNumbers(18);

        int[] tab = {5, 2, 2, 1};
        int result = sum(tab);
        System.out.println(result);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String decorate(String word) {
        return word.toUpperCase() + ".";
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

}
