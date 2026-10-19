package Encapsulation;

class Student {

    // 1. Private fields
    private int rollNumber;
    private String name;
    private double marks;

    // 2. Constructor
    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        setName(name);
        setMarks(marks);
    }

    // 3. Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // 4. Getter for name
    public String getName() {
        return name;
    }

    // 5. Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty!");
        }
    }

    // 6. Getter for marks
    public double getMarks() {
        return marks;
    }

    // 7. Setter for marks with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println(
                    "Marks must be between 0 and 100!"
            );
        }
    }

    // 8. Calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // 9. Check pass or fail
    public boolean isPassed() {
        return marks >= 40;
    }

    // 10. Display result
    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println(
                "Result: " + (isPassed() ? "PASS" : "FAIL")
        );
    }
}

public class StudentEncapsulationDemo {

    public static void main(String[] args) {

        // Create student
        Student student =
                new Student(101, "Munna", 85);

        System.out.println("=== Initial Result ===");
        student.displayResult();

        // Update marks
        System.out.println("\n=== Update Marks ===");
        student.setMarks(95);
        student.displayResult();

        // Attempt invalid marks
        System.out.println("\n=== Invalid Marks ===");
        student.setMarks(150);

        // Marks should remain unchanged
        System.out.println(
                "Current Marks: " + student.getMarks()
        );

        // Update student name
        System.out.println("\n=== Update Name ===");
        student.setName("Rahul");
        student.displayResult();
    }
}
