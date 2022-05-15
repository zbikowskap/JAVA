package arrays;

public class VarargsExample {

    public static void main(String[] args) {
        printVariables();
        printVariables(5);
        printVariables(1, 5, 13);

    }

    public static void printVariables(int... array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
