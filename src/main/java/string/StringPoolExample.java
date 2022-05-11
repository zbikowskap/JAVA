package string;

public class StringPoolExample {

    public static void main(String[] args) {
        String text = "ala";
        String text2 = "ala";
        String text3 = new String("ala");

        //Znak == porownuje miejsce w pamieci
        System.out.println(text == text2);
        System.out.println(text == text3);
        //Metoda .equals porownuje wartosc obiektu
        System.out.println(text.equals(text2));
        System.out.println(text.equals(text3));
    }

}
