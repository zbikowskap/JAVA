package variables;

public class ScopesExample {

    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println(number);
            int secondNumber = 6;
        }

        //Blad, nie mozna uzyc zmiennej stworzonej w bardziej zagniezdzonym bloku.
        //System.out.println(secondNumber);

    }

}
