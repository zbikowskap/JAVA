package variables;

public class ConversionAndCastExample {

    public static void main(String[] args) {
        double numberA = 5.5;
        int numberB = 3;

        //Następuję automatyczna konwersja dla numberB na double
        double resultA = numberA + numberB;
        System.out.println(resultA);

        //Rzutowanie numberA na int, konwersja stratna.
        int resultB = (int) numberA + numberB;
        System.out.println(resultB);

        String numberAsString = "15.15";
        //Konkatenacja
        System.out.println(numberAsString + 2.5);

        //Konwersja z String na double - Double.parseDouble(numberAsString)
        double result = Double.parseDouble(numberAsString) + 2.5;
        System.out.println(result);

        //String to int
        int n = Integer.parseInt("1234567");
        System.out.println(n);
    }

}
