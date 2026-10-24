package inheritance;


class Employee2 {

    String name;
    double salary;

    // Parent class constructor
    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Common method inherited by child classes
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

// Developer inherits Employee2
class Developer2 extends Employee2 {

    String programmingLanguage;

    Developer2(String name, double salary, String language) {
        super(name, salary);
        this.programmingLanguage = language;
    }

    void writeCode() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Tester inherits Employee
class Tester2 extends Employee2 {

    Tester2(String name, double salary) {
        super(name, salary);
    }

    void testSoftware() {
        System.out.println(name + " is testing software.");
    }
}

public class MainEmp {

    public static void main(String[] args) {

        // Developer object
        Developer2 dev = new Developer2("Rahul", 50000, "Java");

        dev.displayDetails();  // Inherited method
        dev.work();            // Inherited method
        dev.writeCode();       // Developer method

        System.out.println("------------------");

        // Tester object
        Tester2 tester = new Tester2("Amit", 40000);

        tester.displayDetails(); // Inherited method
        tester.work();            // Inherited method
        tester.testSoftware();    // Tester method
    }
}

