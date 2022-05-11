package arrays;

public class Exercise6 {

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 5, 2, 1, 2, 3, 4, 5, 2, 2, 1};
        int[] quantity = new int[6];

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            quantity[number]++;
        }

        for (int i = 0; i < quantity.length; i++) {
            System.out.println("Liczba " + i + " wystapila " + quantity[i] + " razy.");
        }
    }

}
