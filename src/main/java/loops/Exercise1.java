package loops;

public class Exercise1 {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        /*for (int i = 20; i < 37; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }*/
        for (int i = 20; i < 37; i += 2) {
            System.out.print(i + " ");
        }

    }

}
