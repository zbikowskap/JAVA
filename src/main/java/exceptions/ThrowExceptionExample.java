package exceptions;

public class ThrowExceptionExample {

    public static void main(String[] args) {

        method(15);

    }

    public static void method(int number) {
        if (number < 10) {
            throw new IllegalArgumentException("Number is too low");
        }
        System.out.println(number);
    }

}
