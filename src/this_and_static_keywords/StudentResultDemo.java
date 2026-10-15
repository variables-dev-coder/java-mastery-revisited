package this_and_static_keywords;


class Student {

    // Instance variables: different for every student
    int rollNumber;
    String name;
    double marks;

    // Static variables: shared by all students
    static String schoolName = "ABC Public School";
    static int totalStudents = 0;
    static double passingMarks = 40.0;

    // Default constructor
    Student() {
        this(0, "Unknown", 0.0);
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;

        totalStudents++;
    }

    // Instance method to calculate result
    void displayResult() {

        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Student Name: " + this.name);
        System.out.println("Marks: " + this.marks);

        if (this.marks >= Student.passingMarks) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("School: " + Student.schoolName);
        System.out.println("-------------------------");
    }

    // Static method to display student count
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Static method to change school name
    static void changeSchoolName(String newName) {
        schoolName = newName;
    }

    // Static method to change passing marks
    static void changePassingMarks(double marks) {
        passingMarks = marks;
    }
}

public class StudentResultDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Priya", 35);
        Student s3 = new Student(103, "Amit", 65);

        // Display individual results
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();

        // Display shared student count
        Student.displayTotalStudents();

        // Change shared passing marks
        Student.changePassingMarks(50);

        System.out.println("\nAfter changing passing marks:");
        s2.displayResult();

        // Change shared school name
        Student.changeSchoolName("XYZ International School");

        System.out.println("\nAfter changing school name:");
        s1.displayResult();
        s3.displayResult();
    }
}

