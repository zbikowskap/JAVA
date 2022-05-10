package arrays;

public class Exercise2 {

    public static void main(String[] args) {
        int[] array = new int[10];

        //uzupelnianie
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }

        //wyswietlanie
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
