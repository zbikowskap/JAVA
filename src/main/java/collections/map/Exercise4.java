package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise4 {

    public static void main(String[] args) {

        Map<Student, List<Integer>> studentsWithGrades = new HashMap<>();

        Student student1 = new Student("Michal", "Test", "PL");
        List<Integer> student1Grades = List.of(5, 3, 3, 2, 5);

        Student student2 = new Student("Marcin", "Test", "PL");
        List<Integer> student2Grades = List.of(2, 3, 3, 2, 2);

        Student student3 = new Student("Basia", "Test", "DE");
        List<Integer> student3Grades = List.of(5, 4, 4, 4, 5);

        studentsWithGrades.put(student1, student1Grades);
        studentsWithGrades.put(student2, student2Grades);
        studentsWithGrades.put(student3, student3Grades);

        for (Map.Entry<Student, List<Integer>> entry : studentsWithGrades.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
