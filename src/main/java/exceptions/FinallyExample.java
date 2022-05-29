package exceptions;

/**
 * finally wykonuję się zawszę.
 * Jeśli w catch użyjemy return lub poleci wyjątek którego nie łapiemy finally również wykona swój kod.
 */
public class FinallyExample {

    public static void main(String[] args) {
        int[] array = new int[5];
        String name = null;

        try {
            array[2] = 17;
            System.out.println(name.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poleciał wyjątek.");
        } finally {
            System.out.println("Kod w finally");
        }

        System.out.println("Koniec programu");

    }
}
