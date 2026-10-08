package Classes_Objects;

class Employee {

    // Data / Properties
    String name;
    int age;
    double salary;

    // Behavior / Method
    void work() {
        System.out.println(name + " is working");
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}

public class Main3 {

    public static void main(String[] args) {

        // Object 1
        Employee emp1 = new Employee();

        emp1.name = "Rahul";
        emp1.age = 25;
        emp1.salary = 30000;

        // Object 2
        Employee emp2 = new Employee();

        emp2.name = "Amit";
        emp2.age = 28;
        emp2.salary = 40000;

        // Access object data
        emp1.display();
        emp1.work();

        System.out.println();

        emp2.display();
        emp2.work();
    }
}
