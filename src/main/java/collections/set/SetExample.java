package collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 1. Zbiory nie przechowują duplikatów.
 * 2. Zbiory nie posiadają indexów.
 */
public class SetExample {

    public static void main(String[] args) {
        //HashSet nie zachowuję kolejności dodawnia.
        Set<String> set = new HashSet<>();

        set.add("RED");
        set.add("BLACK");
        set.add("BLACK");
        set.add("YELLOW");
        set.add("BLUE");
        set.add("BLUE");
        set.add("WHITE");
        set.add("RED");

        for (String element : set) {
            System.out.println(element);
        }

    }

}
