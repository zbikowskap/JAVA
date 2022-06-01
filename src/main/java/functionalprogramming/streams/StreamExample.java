package functionalprogramming.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> list = List.of("Portugalia", "Albania", "Grecja", "Polska", "Norwegia");

        /**
         * Metoda map służy do zmiany elementów w strumieniu.
         */
        List<String> upperCase = list.stream()
                .map(country -> country.toUpperCase())
                .collect(Collectors.toList()); //collect jest operacją kończącą, np. zamienia strumien na liste

        System.out.println(upperCase);

        /**
         * Metoda filter służy do odsiania elementów ze strumienia. W wyniku dostaniemy strumien elementów, które spełniły warunek.
         */
        list.stream()
                .filter(country -> country.startsWith("P"))
                .forEach(country -> System.out.print(country + " ")); //forEach jest operacja kończącą, wykonuje operacje dla każdego elementu

    }

}
