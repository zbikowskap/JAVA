package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise4 {

    public static void main(String[] args) {

        Map<Student, List<Integer>> studentsWithGrades = new HashMap<>();

        Student student1 = new Student("Michal", "Test", "PL");
        List<Integer> student1Grades = List.of(5, 3, 3, 2, 5);

        studentsWithGrades.put(student1, student1Grades);

        System.out.println(student1);
    }

}
