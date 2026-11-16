package immutable_Class;

import java.util.HashMap;
import java.util.Map;

public class StudentReportMain {

    public static void main(String[] args) {

        // 1. Create mutable HashMap
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Java", 95);
        marks.put("SQL", 85);
        marks.put("Spring Boot", 90);
        marks.put("DSA", 88);

        // 2. Create immutable StudentReport
        StudentReport report = new StudentReport(
                101,
                "Munna",
                "Computer Science",
                marks
        );

        // 3. Display report
        report.displayReport();

        // 4. Modify original Map
        marks.put("Java", 40);
        marks.put("Python", 99);

        System.out.println("\nAfter modifying original Map:");

        System.out.println(report.getSubjectMarks());

        // 5. Try modifying Map through getter
        report.getSubjectMarks().put("Python", 100);
    }
}
