package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        //LinkedHashSet zapamiętuje kolejność dodawania.
        set = new LinkedHashSet<>();

        set.add("RED");
        set.add("BLACK");
        set.add("BLACK");
        set.add("YELLOW");
        set.add("BLUE");
        set.add("BLUE");
        set.add("WHITE");
        set.add("RED");

        System.out.println(set);

        //TreeSet
        set = new TreeSet<>();

        set.add("RED");
        set.add("bLACK");
        set.add("BLACK");
        set.add("BLACK");
        set.add("YELLOW");
        set.add("BLUE");
        set.add("BLUE");
        set.add("WHITE");
        set.add("RED");

        System.out.println(set);


    }

}
