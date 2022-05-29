package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Wyjątki dziedziczące po Exception są tak zwanymi CHECKED EXCEPTION. Trzeba je obsłużyć lub użyć throws przy deklaracji metody informując
 * metode wyżej że trzeba go obsłużyć.
 */
public class ExceptionExample {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje.");
        }

    }

}
