package Classes_Objects;

class Student {

    String name;
    int age;
    double marks;

    void study() {
        System.out.println(name + " is studying");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Rahul";
        s1.age = 21;
        s1.marks = 85.5;

        // Calling methods
        s1.display();
        s1.study();
    }
}
