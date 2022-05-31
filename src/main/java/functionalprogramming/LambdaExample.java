package functionalprogramming;

public class LambdaExample {

    public static void main(String[] args) {
        //Sposoby na zrobienie obiektu Interfejsu (pośrednie)
        //Bezpośredni sposób nie istnieje, nie można zrobić obiektu bez zdefiniowania ciała metody.

        //Zdefiniowanie klasy implementującej interfejs.
        ArithmeticOperation addOperation = new AddOperation();

        int addResult = addOperation.operation(6, 23);
        System.out.println(addResult);

        //Klasa anonimowa - taka jednorazówka
        ArithmeticOperation subtractOperation = new ArithmeticOperation() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };

        int subtractResult = subtractOperation.operation(5, 2);
        System.out.println(subtractResult);

        //Lambda
        ArithmeticOperation multiplyOperation = (a, b) -> a * b;

        int multiplyResult = multiplyOperation.operation(5, 2);
        System.out.println(multiplyResult);

        //Lambda wieloliniowa
        ArithmeticOperation divideOperation = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Nie mozna dzielic przez 0.");
            }
            return a / b;
        };

        int divideResult = divideOperation.operation(5, 2);
        System.out.println(divideResult);

        //Method reference
        ArithmeticOperation maxOperation = Math::max;

        int maxResult = maxOperation.operation(5, 2);
        System.out.println(maxResult);

    }

}
