package variables;

public class Exercise4 {
    //Zamienic zmienna typu String "15" i "2.45" na wynik dodawnia.
    //Wyswietlic liczbę PI z klasy Math.
    public static void main(String[] args) {
        String numberA = "15";
        String numberB = "2.45";

        double result = Double.parseDouble(numberA) + Double.parseDouble(numberB);
        System.out.println(result);

        System.out.println(Math.PI);
    }

}
