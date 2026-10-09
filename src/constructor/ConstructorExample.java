package constructor;


class Employee {

    int id;
    String name;
    double salary;

    // 1. No-argument constructor
    Employee() {
        this(0, "Unknown", 0.0);
        System.out.println("No-argument constructor called");
    }

    // 2. Parameterized constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        System.out.println("Parameterized constructor called");
    }

    // 3. Constructor overloading: two parameters
    Employee(int id, String name) {
        this(id, name, 20000.0);
    }

    // 4. Copy constructor
    Employee(Employee other) {
        this(other.id, other.name, other.salary);
    }

    // Display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Calls the no-argument constructor
        Employee e1 = new Employee();
        e1.display();

        // Calls the three-parameter constructor
        Employee e2 = new Employee(101, "Munna", 30000);
        e2.display();

        // Calls the two-parameter constructor
        Employee e3 = new Employee(102, "Rahul");
        e3.display();

        // Calls the copy constructor
        Employee e4 = new Employee(e2);
        e4.display();
    }
}

