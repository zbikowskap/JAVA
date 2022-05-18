package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //Deklaracja listy typu String
        List<String> words = new ArrayList<>();

        //Dodawanie elementu do listy
        words.add("Raz");
        words.add("Tak");
        words.add("Nie");
        words.add("Może");

        //Wyjmowanie elementu z listy po indexie
        String elementFromFirstIndex = words.get(1);
        System.out.println(elementFromFirstIndex);

        //Pobranie rozmiaru listy
        int size = words.size();
        System.out.println("Rozmiar listy to: " + size);

        //Usuwa element o indexie 2
        words.remove(2);

        //Usuwa obiekt z listy, jeśli się w niej znajduję.
        words.remove("Tak");

        //Wyswietlenie calej listy
        System.out.println(words);

        //Metoda contains sprawdza czy obiekt znajduje sie w liscie
        boolean isRazInList = words.contains("Raz");
        System.out.println(isRazInList);

        //Usuwa wszystkie elementy
        words.clear();

        System.out.println(words);

    }


}
