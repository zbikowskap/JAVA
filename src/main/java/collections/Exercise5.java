package collections;

import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Raz");
        words.add("Raz");
        words.add("Dwa");
        words.add("Trzy");
        words.add("Raz");
        words.add("Trzy");

        List<String> result = removeDuplicates(words);
        System.out.println(result);
    }

    public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    /*//Za pomoca streamow
    public static List<String> removeDuplicates(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }*/

    //Na piechotę z pętlą
    /*public static List<String> removeDuplicates(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String word : list) {
            if (!result.contains(word)) {
                result.add(word);
            }
        }

        return result;
    }
*/
}
