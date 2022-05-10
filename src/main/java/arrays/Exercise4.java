package arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int[] array = {5, 10, 5, 10, 5, 10, 5, 10, 5, 10};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);

        double average = (double) sum / array.length;
        System.out.println(average);
    }

}
