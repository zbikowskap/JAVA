package variables;

public class ArithmeticOperationsExample {

    public static void main(String[] args) {

        double a = 10;
        double b = 3;

        double result;

        //10 + 3
        result = a + b;
        System.out.println("Suma: " + result);

        //10 - 3
        result = a - b;
        System.out.println("Różnica: " + result);

        //10 * 3
        result = a * b;
        System.out.println("Iloczyn: " + result);

        //10 / 3
        result = a / b;
        System.out.println("Iloraz: " + result);

        result = a % b;
        System.out.println("Modulo: " + result);
    }

}
