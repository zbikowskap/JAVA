package string;

public class WordCounter {

    public static void main(String[] args) {
        String text = "        test        dwa       ";

        int wordsQuantity = countWords2(text);
        System.out.println(wordsQuantity);

        double averageWordLength = averageWordLength(text);
        System.out.println(averageWordLength);
    }

    /**
     * Przykład brzydkiego kodu.
     * Tak nie robimy.
     * Jest nieczytelny.
     */
    public static int countWords3(String text) {
        return text.isEmpty() ? 0 : text.replaceAll("\\s+", " ").trim().split(" ").length;
    }

    /**
     * Metoda liczy ilość wyrazów.
     */
    public static int countWords2(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = retrieveWords(text);
        return words.length;
    }

    /**
     * Metoda liczy ilość wyrazów.
     */
    public static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        String textWithoutMultiplySpaces = text.replaceAll("\\s+", " ");
        String trimmedWord = textWithoutMultiplySpaces.trim();
        int words = 0;

        char[] chars = trimmedWord.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                words++;
            }
        }

        return words + 1;
    }

    /**
     * Metoda zwraca tablice wyrazow z tekstu. Ignoruje wielokrotne spacje.
     */
    public static String[] retrieveWords(String text) {
        String textWithoutMultiplySpaces = text.replaceAll("\\s+", " ");
        String trimmedWord = textWithoutMultiplySpaces.trim();
        return trimmedWord.split(" ");
    }

    /**
     * Metoda oblicza srednia dlugosc wyrazow w tekscie.
     */
    public static double averageWordLength(String text) {
        //Pozyskanie tablicy wyrazow
        String[] words = retrieveWords(text);

        int sum = 0;

        //Obliczenie sumy
        for (int i = 0; i < words.length; i++) {
            sum += words[i].length();
        }

        //Obliczenie sredniej
        return (double) sum / words.length;
    }

}
