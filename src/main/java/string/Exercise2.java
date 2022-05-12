package string;

public class Exercise2 {

    public static void main(String[] args) {

        String text = "Ala ma kota";
        String text2 = new String("a kot ma Ale");

        String result = text + text2;

        String word = text.substring(4, 6);
        String word2 = text2.substring(2, 5);

        System.out.println(word.length());
        System.out.println(word2.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));

        System.out.println(word2.charAt(0));
        System.out.println(word2.charAt(word.length() - 1));
    }

}
