package loops;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //Sprawia, ze odrazu przechodzimy do nastepnego obrotu
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break; //Natychmiast konczy petle
            }
            System.out.print(i + " ");
        }

    }

}
