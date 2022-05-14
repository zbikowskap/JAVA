package string;

public class WordCounter {

    public static void main(String[] args) {
        //86 slow
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nullam et convallis massa. Phasellus sit amet ligula nisl. " +
                "Aliquam volutpat condimentum odio, eu finibus leo egestas eget. " +
                "Aliquam volutpat sit amet risus condimentum accumsan. " +
                "Fusce sit amet nisi lorem. Sed ac nulla id metus accumsan gravida efficitur at sem. " +
                "Sed accumsan mauris sit amet rhoncus auctor. Maecenas mollis hendrerit turpis quis auctor. " +
                "Integer a tellus varius, efficitur ante sagittis, feugiat tellus. In purus elit, porttitor nec erat vitae, " +
                "eleifend imperdiet nisl. Nam facilisis porta rhoncus. Suspendisse potenti.";

        //obliczyc ilosc slow
        int words = countWords(text);

        System.out.println(words);
    }

    /**
     * Metoda liczy ilość wyrazów na podstawie ilości spacji. Nadmierna ilość spacji sprawia, że wyniki są błędne.
     */
    public static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        int words = 0;

        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (chars[i] == ' ') {
                words++;
            }
        }

        return words + 1;
    }

}
