package string;

/**
 * WSZYSTKIE TE OPERACJE ZWRACAJA NOWE OBIEKTY KLASY STRING PONIEWAZ STRING JEST NIEMUTOWALNY.
 */
public class StringOperationsExample {

    public static void main(String[] args) {
        String text = "Kolorowy świat kiedy ja";
        //Metoda tworzy nowego Stringa z duzych liter
        String upperCaseString = text.toUpperCase();

        System.out.println(text);
        System.out.println(upperCaseString);
        //Metoda tworzy nowego Stringa z malych liter
        System.out.println(text.toLowerCase());

        //Podmiana wszystkihc o na 0
        System.out.println(text.replace('o', '0'));

        //Czy text zawiera w sobie "świat"
        System.out.println(text.contains("świat"));

        //Czy String jest pusty
        System.out.println(text.isEmpty());

        //Pobranie znaku spod indexu 0
        System.out.println(text.charAt(0));

        //Wyciecie Stringa (index 2,3,4)
        System.out.println(text.substring(2, 5));

        //Metoda split tworzy tablice, dzielac String po podanym jako argument separatorze
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + "-");
        }

        System.out.println();

    }

}
