package abstract_revision;

interface Developer23 {

    void writeCode();

    default void develop() {
        System.out.println("Software development started");
    }
}

interface Tester {

    void testCode();

    default void test() {
        System.out.println("Software testing started");
    }
}

abstract class Employee23 {

    protected String name;
    protected double salary;

    Employee23(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class SoftwareEngineer extends Employee23 implements Developer23, Tester {

    SoftwareEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void writeCode() {
        System.out.println("Writing Java code");
    }

    @Override
    public void testCode() {
        System.out.println("Testing application using JUnit");
    }

    @Override
    void work() {
        System.out.println("Software engineer is working");
    }
}

public class Main_23 {

    public static void main(String[] args) {

        SoftwareEngineer employee = new SoftwareEngineer("Munna", 50000);

        employee.display();

        employee.work();

        employee.develop();
        employee.writeCode();

        employee.test();
        employee.testCode();
    }
}
