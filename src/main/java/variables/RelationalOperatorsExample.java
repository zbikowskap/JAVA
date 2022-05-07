package variables;

public class RelationalOperatorsExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        //Operator == sprawdza czy wartości zmiennych a i b są identyczne
        boolean result = a == b;
        System.out.println(result); //false

        //Operator != sprawdza czy wartości są różne
        System.out.println(a != b); //true

        //Operatory mniejszości/większości
        System.out.println(a > b); //false
        System.out.println(a < b); //true
        System.out.println(a >= 5); //true
        System.out.println(b <= 6); //false

    }

}
