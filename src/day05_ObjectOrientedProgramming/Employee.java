package day05_ObjectOrientedProgramming;

abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void printName() {
        System.out.println("Employee: " + name);
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name) {
        super(name);
    }

    double calculateSalary() {
        return 50000;
    }

    public static void main(String[] args) {
        Employee e = new FullTimeEmployee("Munna");
        e.printName();
        System.out.println(e.calculateSalary());
    }
}

//Employee: Munna
//50000.0

//Use abstract class when:
//You need constructors
//You need common fields