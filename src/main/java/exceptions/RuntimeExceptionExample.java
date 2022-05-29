package exceptions;

import java.util.ArrayList;
import java.util.List;

public class RuntimeExceptionExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //W bloku try umieszczamy kod, który może rzucić wyjątek.
        try {
            System.out.println(list.get(5));
        //W bloku catch łapiemy wyjątek, może być ich więcej niż 1.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Poleciał wyjątek z wiadomościa: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Metoda printStackTrace drukuję na ekranie wyjątek.
            e.printStackTrace();
        }

        System.out.println("Pracuje dalej..");

    }

}
