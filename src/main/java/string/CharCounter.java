package string;

public class CharCounter {

    public static boolean checkXO(String word) {
        word = word.toLowerCase();
        int countX = 0;
        int countO = 0;

        for (char aChar : word.toCharArray()) {
            if (aChar == 'x') {
                countX++;
            } else if (aChar == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }

}
