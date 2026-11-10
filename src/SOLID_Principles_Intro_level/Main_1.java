package SOLID_Principles_Intro_level;

// 1. Single Responsibility Principle (SRP)

class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class StudentValidator {

    public boolean isPassed(Student student) {
        return student.getMarks() >= 40;
    }
}

class StudentRepository {

    public void save(Student student) {
        System.out.println("Saving: " + student.getName());
    }
}

class StudentReport {

    public void generate(Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
    }
}

public class Main_1 {
    public static void main(String[] args) {

        Student student = new Student("Munna", 85);

        StudentValidator validator = new StudentValidator();
        StudentRepository repository = new StudentRepository();
        StudentReport report = new StudentReport();

        System.out.println("Passed: " + validator.isPassed(student));

        repository.save(student);
        report.generate(student);
    }
}
