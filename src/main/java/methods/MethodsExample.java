package methods;

public class MethodsExample {

    public static void main(String[] args) {
        print();
        print();
        print();

        int number = 10;
        //Wywolanie metody i zapisanie jej wyniku w zmiennej
        int result = increaseBy5(number);

        //Zmienna number nie zostala zmieniona, poniewaz gdy argumentem jest typ prymitywny do metody trafia tylko wartosc
        System.out.println(number);
        //Wynik metody zostal zapisany do zmiennej result
        System.out.println(result);
    }

    public static void print() {
        System.out.println("Ciało metody");
    }

    public static int increaseBy5(int a) {
        a = a + 5;
        return a;
    }

}
