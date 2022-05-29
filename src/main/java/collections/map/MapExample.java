package collections.map;

import collections.set.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    /**
     * Mapy przetrzymuja tylko unikalne klucze.
     *
     * 1. HashMap nie pilnuje kolejnosci dodawnia.
     */
    public static void main(String[] args) {

        //Deklaracja mapy
        Map<String, Integer> map = new HashMap<>();

        //Metoda put dodaje pare do mapy.
        map.put("klucz1", 15);
        map.put("klucz2", 10);
        map.put("klucz3", 5);
        //Aktualizacja wartosci pod kluczem klucz2
        map.put("klucz2", 0);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + " Wartosc: " + entry.getValue());
        }

        //Usuwanie w mapie na podstawie klucza
        map.remove("klucz1");

        //Pobranie zbioru kluczy z mapy
        System.out.println("Keys: ");
        System.out.println(map.keySet());

        //Pobranie wartosci z mapy
        System.out.println("Values: ");
        System.out.println(map.values());

    }

}
