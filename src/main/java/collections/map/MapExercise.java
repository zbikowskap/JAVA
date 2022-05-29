package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {

        Map<Long, String> map = new HashMap<>();

        map.put(1L, "Agata");
        map.put(2L, "Jan");
        map.put(3L, "Beate");
        map.put(4L, "Jan");
        map.put(5L, "Angelika");
        map.put(6L, "Jan");
        map.put(7L, "Andrzej");

        for (String value : map.values()) {
            if (value.startsWith("A")) {
                System.out.print(value + " ");
            }
        }

        System.out.println();
        System.out.println("ID dla wartosci Jan:");

        for (Map.Entry<Long, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Jan")) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }

}
