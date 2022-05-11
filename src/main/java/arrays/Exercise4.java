package arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int[] array = {5, 10, 5, 10, 5, 10, 5, 10, 5, 10};

        //suma
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);

        //srednia
        double average = (double) sum / array.length;
        System.out.println(average);

        //srednia z liczb parzystych
        int sumOfEvenNumbers = 0;
        int evenNumbersQuantity = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumbers += array[i];
                evenNumbersQuantity++;
            }
        }

        double evenAverage = (double) sumOfEvenNumbers / evenNumbersQuantity;
        System.out.println(evenAverage);
    }

}
