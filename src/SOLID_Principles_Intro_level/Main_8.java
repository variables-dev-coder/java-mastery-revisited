package SOLID_Principles_Intro_level;

class Employee {

    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    @Override
    public void work() {
        System.out.println("Developer is writing code");
    }
}

class Tester extends Employee {

    @Override
    public void work() {
        System.out.println("Tester is testing software");
    }
}

class Manager extends Employee {

    @Override
    public void work() {
        System.out.println("Manager is managing the team");
    }
}

public class Main_8 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Developer(),
                new Tester(),
                new Manager()
        };

        for (Employee employee : employees) {
            employee.work();
        }
    }
}
