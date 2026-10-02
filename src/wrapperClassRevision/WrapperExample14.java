package wrapperClassRevision;

public class WrapperExample14 {

    public static void main(String[] args) {

        Integer marks1 = 85;
        Integer marks2 = null;
        Integer marks3 = 72;

        printMarks("Student 1", marks1);
        printMarks("Student 2", marks2);
        printMarks("Student 3", marks3);
    }

    static void printMarks(String student, Integer marks) {

        if (marks == null) {
            System.out.println(student + ": Marks not available");
            return;
        }

        System.out.println(student + ": " + marks);
    }
}
