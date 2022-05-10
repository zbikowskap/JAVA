package arrays;

public class ArrayExample {

    public static void main(String[] args) {
        //deklaracja tablicy typu int o rozmiarze 5
        int[] array = new int[5];

        //przypisywania danych do elementow tablicy
        array[0] = 5;
        array[1] = 54;
        array[2] = 15;
        array[3] = 325;

        //wydrukowanie wartosci z elementu tablicy
        System.out.println("First element: " + array[0]);

        //przejscie po calej tablicy
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);
        }

    }

}
