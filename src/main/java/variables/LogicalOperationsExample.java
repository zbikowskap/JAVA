package variables;

public class LogicalOperationsExample {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //Operator AND - koniunkcja
        System.out.println(a && b); //false

        //Operator OR - alternatywa
        System.out.println(a || b); //trye

        int number = 10;

        System.out.println(number > 5 && number < 20); //true

        System.out.println(number > 100 || number < 15); //true

        //Negacja
        System.out.println(!a); //false
    }



}
