package immutable_Class;

import java.util.Map;

public final class StudentReport {

    // 1. Private final fields
    private final int studentId;
    private final String studentName;
    private final String department;
    private final Map<String, Integer> subjectMarks;

    // 2. Constructor
    public StudentReport(
            int studentId,
            String studentName,
            String department,
            Map<String, Integer> subjectMarks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;

        // 3. Defensive Copying
        this.subjectMarks = Map.copyOf(subjectMarks);
    }

    // 4. Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    // 5. Calculate total marks
    public int calculateTotal() {

        int total = 0;

        for (int marks : subjectMarks.values()) {
            total += marks;
        }

        return total;
    }

    // 6. Calculate average marks
    public double calculateAverage() {

        if (subjectMarks.isEmpty()) {
            return 0.0;
        }

        return (double) calculateTotal() / subjectMarks.size();
    }

    // 7. Calculate grade
    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    // 8. Display report
    public void displayReport() {

        System.out.println("========== STUDENT REPORT ==========");

        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);

        System.out.println("\nSubject Marks:");

        for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("\nTotal Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());

        System.out.println("====================================");
    }
}
