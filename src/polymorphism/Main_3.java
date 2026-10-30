package polymorphism;


class Employee {

    double calculateBonus(double salary) {
        return salary * 0.05;
    }
}

class Developer extends Employee {

    @Override
    double calculateBonus(double salary) {
        return salary * 0.15;
    }
}

class Manager extends Employee {

    @Override
    double calculateBonus(double salary) {
        return salary * 0.20;
    }
}

public class Main_3 {

    public static void main(String[] args) {

        Employee employee;

        employee = new Employee();
        System.out.println(
                "Employee bonus: " +
                        employee.calculateBonus(50000)
        );

        employee = new Developer();
        System.out.println(
                "Developer bonus: " +
                        employee.calculateBonus(50000)
        );

        employee = new Manager();
        System.out.println(
                "Manager bonus: " +
                        employee.calculateBonus(50000)
        );
    }
}

