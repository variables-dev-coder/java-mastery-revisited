package inheritance;


class Employee {

    String name;
    double salary;

    void work() {
        System.out.println(name + " is working");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println(name + " is writing Java code");
    }
}

class Tester extends Employee {

    void testSoftware() {
        System.out.println(name + " is testing software");
    }
}

public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.name = "Rahul";
        dev.salary = 50000;

        dev.work();
        dev.writeCode();

        Tester tester = new Tester();
        tester.name = "Amit";
        tester.salary = 40000;

        tester.work();
        tester.testSoftware();
    }
}

