package arrays;

public class Array2dExample {

    public static void main(String[] args) {
        //deklaracja tablicy dwu wymiarowej
        int[][] array = new int[5][10];

        //Aby przejsc po tablicy 2d, potrzebujemy dwoch petli
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
