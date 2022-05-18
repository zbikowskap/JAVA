package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            list.add(random.nextInt(11));
        }

        System.out.println(list);

        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        //Bonus: Ponizsza linijka usuwa wszystkie parzyste elementy z listy.
        //list.removeIf(number -> number % 2 == 0);

        long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");

        System.out.println(list);
    }

}
