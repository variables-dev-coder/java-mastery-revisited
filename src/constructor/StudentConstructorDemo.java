package constructor;


class Student {

    int rollNumber;
    String name;
    double marks;
    String course;

    // 1. No-argument constructor
    Student() {
        this(0, "Unknown", 0.0, "Not Assigned");
        System.out.println("Default student created");
    }

    // 2. Parameterized constructor
    Student(int rollNumber, String name, double marks, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    // 3. Constructor overloading
    Student(int rollNumber, String name) {
        this(rollNumber, name, 0.0, "Java");
    }

    // 4. Copy constructor
    Student(Student other) {
        this(other.rollNumber, other.name, other.marks, other.course);
    }

    // Update marks
    void updateMarks(double newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            marks = newMarks;
            System.out.println("Marks updated successfully");
        } else {
            System.out.println("Invalid marks");
        }
    }

    // Display student details
    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}

public class StudentConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized constructor
        Student s2 = new Student(101, "Munna", 85.5, "Java");
        s2.display();

        // Overloaded constructor
        Student s3 = new Student(102, "Rahul");
        s3.updateMarks(90);
        s3.display();

        // Copy constructor
        Student s4 = new Student(s2);
        s4.display();
    }
}

