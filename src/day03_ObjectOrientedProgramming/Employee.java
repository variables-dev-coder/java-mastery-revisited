package day03_ObjectOrientedProgramming;

public class Employee {
    int id;
    String name;

    Employee() {
        System.out.println("Default constructor called");
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();         // Default constructor called

        Employee e2 = new Employee(101, "John Doe");

        System.out.println(e2.id + " " + e2.name);   // 101 John Doe
    }
}
