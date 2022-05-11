package arrays;

public class FindMaxExercise {

    public static void main(String[] args) {
        int[] array = {-5, -2, -6};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }

}
