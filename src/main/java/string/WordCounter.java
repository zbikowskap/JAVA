package string;

public class WordCounter {

    public static void main(String[] args) {
        String text = "        test        dwa       ";

        int words = countWords2(text);

        System.out.println(words);
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
        String textWithoutMultiplySpaces = text.replaceAll("\\s+", " ");
        String trimmedWord = textWithoutMultiplySpaces.trim();
        String[] words = trimmedWord.split(" ");
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

}
